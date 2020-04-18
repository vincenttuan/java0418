package com.lab.java0418;

// 條件運算子
public class ConditionalOperation {
    public static void main(String[] args) {
        double bmi = 21.2;
        String result = (bmi > 18 && bmi <= 23)?"正常":"不正常";
        System.out.printf("bmi= %.1f %s\n", bmi, result);
    }
}
