package dev.mikablondo.valhalla_playground.model;

public value class Player {

    private final String name;
    private final int ranking;

    public Player(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public String name() {
        return name;
    }

    public int ranking() {
        return ranking;
    }

    @Override
    public String toString() {
        return "Player[name=" + name + ", ranking=" + ranking + "]";
    }
}
