package org.problems.problem04;

public class Main {
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }

    //재귀함수를 반복문으로 대체
    static int factorial(int n){
        int result = 1;

        while(n > 0){
            result *= n;
            n--;
        }
        return result;
    }

}
