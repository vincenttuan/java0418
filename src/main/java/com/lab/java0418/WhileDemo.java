package com.lab.java0418;

import java.util.Random;

public class WhileDemo {
    public static void main(String[] args) {
        while(true) {
            int n = new Random().nextInt(100); // 0~99
            if(n != 0 && n % 3 != 0) { // n!= 0 且 n 不是 3 的倍數
                continue; // 重新執行迴圈
            }
            System.out.println(n);
            if(n == 0) {
                break; // 跳離迴圈
            }
        }
    }
}
