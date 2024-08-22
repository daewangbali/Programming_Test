package org.problems.problem04;

import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        BigInteger result = factorial(1000);
        System.out.println(result);
    }

    //재귀함수를 반복문으로 대체
    static BigInteger factorial(int n){
        BigInteger result = BigInteger.ONE;

        while(n > 0){
            result = result.multiply(BigInteger.valueOf(n));
            n--;
        }

        return result;

    }

}
