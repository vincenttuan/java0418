package com.lab.java0418;

public class BinaryOperatorParking2 {
    public static void main(String[] args) {
        int no = 2;
        int parking = 0b110101;
        System.out.println("現在車位:" + Integer.toBinaryString(parking));
        int car = (int)Math.pow(2, no);
        if((parking & car) > 0) {
            System.out.println(no + "號車位可牽車");
            parking = parking - car; // 將車子牽出去
            System.out.println("現在車位:" + Integer.toBinaryString(parking));
        } else {
            System.out.println(no + "號車位無車可牽");
        }
    }
}
