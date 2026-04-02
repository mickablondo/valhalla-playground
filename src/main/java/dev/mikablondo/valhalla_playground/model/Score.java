package dev.mikablondo.valhalla_playground.model;

public value class Score {

    private final int team1Sets;
    private final int team2Sets;
    private final int team1Games;
    private final int team2Games;

    public Score(int team1Sets, int team2Sets, int team1Games, int team2Games) {
        this.team1Sets = team1Sets;
        this.team2Sets = team2Sets;
        this.team1Games = team1Games;
        this.team2Games = team2Games;
    }

    public int team1Sets() { return team1Sets; }
    public int team2Sets() { return team2Sets; }
    public int team1Games() { return team1Games; }
    public int team2Games() { return team2Games; }

    public Score addGameToTeam1() {
        return new Score(team1Sets, team2Sets, team1Games + 1, team2Games);
    }

    public Score addGameToTeam2() {
        return new Score(team1Sets, team2Sets, team1Games, team2Games + 1);
    }

    @Override
    public String toString() {
        return team1Sets + "/" + team2Sets + " (" + team1Games + "-" + team2Games + ")";
    }
}