package com.theironyard.charlotte;

public class Main {

    public static void main(String[] args) {
      //  FizzBuzz(7);
        fibseq(10);


    }

    public static String FizzBuzz(int x) {
        if ((x < 100) && (x > 0)) {
            if (x % 5 == x % 3) {
                return "FizzBuzz";
            }
            if (x % 3 == 0) {
                return "Fizz";

            }
            if (x % 5 == 0) {
                return "Buzz";
            }
        }
        return String.valueOf(x);
    }

            public static int [] fibseq(int x) {
                int[] fibs = new int[x];
                fibs[0] = 1;
                fibs[1] = 1;
                for(int i = 2; i < x; i++){
                    fibs[i] =fibs[i - 1] + fibs[i -2];
                }
                return fibs;
            }
}


