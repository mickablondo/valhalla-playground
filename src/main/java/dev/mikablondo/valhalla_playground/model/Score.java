package dev.mikablondo.valhalla_playground.model;

import java.util.ArrayList;
import java.util.List;

public value class Score {

    private final List<int[]> sets;  // historique des sets
    private final int team1Games;
    private final int team2Games;

    private static final int GAMES_TO_WIN_SET = 6;
    private static final int MAX_SETS = 3;

    public Score() {
        this.sets = List.of();
        this.team1Games = 0;
        this.team2Games = 0;
    }

    private Score(List<int[]> sets, int team1Games, int team2Games) {
        this.sets = sets;
        this.team1Games = team1Games;
        this.team2Games = team2Games;
    }

    public int team1Sets() {
        return (int) sets.stream().filter(s -> s[0] > s[1]).count();
    }

    public int team2Sets() {
        return (int) sets.stream().filter(s -> s[1] > s[0]).count();
    }

    public int team1Games() { return team1Games; }
    public int team2Games() { return team2Games; }

    public Score addGameToTeam1() {
        return addGame(true);
    }

    public Score addGameToTeam2() {
        return addGame(false);
    }

    private Score addGame(boolean team1Scored) {
        int t1 = team1Scored ? team1Games + 1 : team1Games;
        int t2 = team1Scored ? team2Games : team2Games + 1;

        // set terminé ?
        if (isSetWon(t1, t2)) {
            List<int[]> newSets = new ArrayList<>(sets);
            newSets.add(new int[]{t1, t2});
            return new Score(List.copyOf(newSets), 0, 0);
        }

        return new Score(sets, t1, t2);
    }

    private boolean isSetWon(int t1, int t2) {
        return (t1 >= GAMES_TO_WIN_SET && t1 - t2 >= 2)
                || (t2 >= GAMES_TO_WIN_SET && t2 - t1 >= 2)
                || t1 == 7 || t2 == 7; // gestion du tie-break
    }

    public boolean isMatchOver() {
        int needed = MAX_SETS / 2 + 1; // 2 sets gagnants sur 3
        return team1Sets() >= needed || team2Sets() >= needed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] set : sets) {
            sb.append(set[0]).append("/").append(set[1]).append(" | ");
        }
        sb.append("(").append(team1Games).append("-").append(team2Games).append(")");
        return sb.toString();
    }
}