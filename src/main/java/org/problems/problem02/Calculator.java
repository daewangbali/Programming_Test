package org.problems.problem02;

public class Calculator {

    int result = 0;

    public Calculator add(int num) {
        this.result += num;
        return this;
    }

    public Calculator subtract(int num) {
        this.result -= num;
        return this;
    }

    public int out(){
        return this.result;
    }

}
