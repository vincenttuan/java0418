package com.lab.java0418;

import java.util.Random;

public class ForDemo {
    public static void main(String[] args) {
        
        for(int i=1;i<=10;i++) { // 相當於 while(true)
            int n = new Random().nextInt(100);
            System.out.printf("i=%d, n=%d\n", i, n);
        }
        
    }
}
