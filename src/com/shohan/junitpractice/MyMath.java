package com.shohan.junitpractice;

public class MyMath {
    public int claculateSum(int[] numbers){
        int sum = 0;
        for(int number:numbers) {
            sum+=number;
        }
        return sum;
    }
}
