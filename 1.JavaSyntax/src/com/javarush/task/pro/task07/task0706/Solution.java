package com.javarush.task.pro.task07.task0706;

public class Solution {
    public static void main(String[] args) {
        div(1 / 0.0, 10 / 0.0);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
