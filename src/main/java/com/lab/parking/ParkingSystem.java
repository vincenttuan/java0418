package com.lab.parking;

import java.util.Scanner;

public class ParkingSystem {
    static int parking = 0b100000; // 車位
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() { // 系統選單
        System.out.println("1. 查詢車位");
        System.out.println("2. 我要停車");
        System.out.println("3. 我要取車");
        System.out.println("4. 離開系統");
        System.out.println("-------------");
        System.out.println("請選擇 ==> ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.print("目前車位: ");
                System.out.println(Integer.toBinaryString(parking));
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                return; // 離開系統
            default:
                break;
        }
        System.out.println("按任意鍵繼續 ...");
        sc = new Scanner(System.in);
        sc.nextLine();
        menu();
    }
    
}
