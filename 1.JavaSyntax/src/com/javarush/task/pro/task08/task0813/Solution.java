package com.javarush.task.pro.task08.task0813;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }

    public static int getPowerOfTwo(int power) {
        return power >= 0 ? 1 << power : 1 >> -power;
    }
}
