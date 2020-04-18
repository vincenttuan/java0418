package com.lab.java0418;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int ans = new Random().nextInt(99) + 1;
        int min = 0;
        int max = 100;
        do {            
            Scanner sc = new Scanner(System.in);
            System.out.printf("請在 %d ~ %d 猜一數字:\n", min, max);
            int guess = sc.nextInt();
            // 1.檢查數值範圍是否合法 ?
            
            
            // 2.進行遊戲比對
            if(guess == ans) {
                System.out.println("恭喜答對了");
                break;
            } else if(guess < ans) {
                min = guess;
            } else {
                max = guess;
            }
        } while (true);
    }
}
