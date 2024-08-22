package org.problems.problem01.bread;

public class ButterBread extends Bread{

    private int butter;

    public ButterBread(String breadType, int flour, int water, int butter) {
        super(breadType, flour, water);
        this.butter = butter;
    }

    public int getButter() {
        return butter;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nbutter: " + butter + "\n";
    }
}
