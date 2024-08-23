package com.codefinity.solution;

import java.math.BigInteger;
import java.util.Arrays;

public class TaskSolution {

    public final static int SIZE_MASSIVE = 100; //DO NOT CHANGE
    public static final BigInteger[] results = new BigInteger[SIZE_MASSIVE]; //DO NOT CHANGE

    public static void main(String[] args) throws InterruptedException {  //DO NOT CHANGE
        calculateFactorialsInParallelSolution();

        printMassiveSolution(results);
    }

    public static void calculateFactorialsInParallelSolution() throws InterruptedException{
        Thread[] threads = new Thread[SIZE_MASSIVE];

        for (int i = 0; i < SIZE_MASSIVE; i++) {
            int index = i;
            threads[i] = new Thread(() -> {
                results[index] = factorialSolution(index);
            });
            threads[i].start(); // Start the thread
        }

        for (Thread thread : threads) {
            thread.join(); // Wait for the thread to finish
        }
    }

    public static BigInteger factorialSolution(Integer length) {  //DO NOT CHANGE
        BigInteger result = new BigInteger("1");

        for(int i = 1; i <= length; i++) {
            result = result.multiply(new BigInteger("" + i));
        }

        return result;
    }

    public static void printMassiveSolution(BigInteger[] array) {  //DO NOT CHANGE
        System.out.println(Arrays.toString(array));
    }

    public static BigInteger[] getResults() {  //DO NOT CHANGE
        return results;
    }

}
