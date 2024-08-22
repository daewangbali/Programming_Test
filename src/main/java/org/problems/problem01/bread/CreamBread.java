package org.problems.problem01.bread;

public class CreamBread extends Bread{

    private int cream;

    public CreamBread(String breadType, int flour, int water, int cream) {
        super(breadType, flour, water);
        this.cream = cream;
    }

    public int getCream() {
        return cream;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncream: " + cream + "\n";
    }

}
