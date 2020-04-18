package com.lab.java0418;

// 關係運算子
public class RelationalOperator {
    public static void main(String[] args) {
        int score = 40;
        String pass = (score >= 60)?"及格":"不及格";
        System.out.printf("score: %d %s\n", score, pass);
    }
}
