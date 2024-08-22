package org.problems.problem01.bread;

public abstract class Bread {

    private String breadType;
    private int flour;
    private int water;

    public Bread(String breadType, int flour, int water) {
        this.breadType = breadType;
        this.flour = flour;
        this.water = water;
    }

    public String getBreadType() {
        return breadType;
    }

    public int getFlour() {
        return flour;
    }

    public int getWater() {
        return water;
    }

    @Override
    public String toString() {
        return "breadType: " + breadType +
                "\nrecipe\n" +
                "flour: " + flour +
                "\nwater: " + water;
    }

}
