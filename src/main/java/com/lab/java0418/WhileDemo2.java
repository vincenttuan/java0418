package com.lab.java0418;

import java.util.Random;

public class WhileDemo2 {
    public static void main(String[] args) {
        int count = 4; // 產生 4 的 lotto 號碼
        while(count-- > 0) {
            int n = new Random().nextInt(10); // 0~9
            System.out.println(n);
            //count--;
        }
    }
}
