package com.javarush.task.pro.task06.task0609;

public class Solution {
    public static void main(String[] args) {

    }

    public static long cube(long n){
        return n * n * n;
    }

    public static long ninthDegree(long n) {
        long nCube = cube(n);
        return cube(nCube);
    }
}
