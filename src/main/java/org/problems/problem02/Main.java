package org.problems.problem02;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.add(4).add(5).subtract(3).out();

        System.out.println(result);

    }

}
