package org.problems.problem01.bread;

public class SugarBread extends Bread {

    private int suger;

    public SugarBread(String breadType, int flour, int water, int suger) {
        super(breadType, flour, water);
        this.suger = suger;
    }

    public int getSuger() {
        return suger;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nsuger: " + suger + "\n";
    }

}
