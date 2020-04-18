package com.lab.java0418;

import java.util.Random;

public class WhileDemo {
    public static void main(String[] args) {
        while(true) {
            int n = new Random().nextInt(100); // 0~99
            System.out.println(n);
            if(n == 0) {
                break;
            }
        }
    }
}
