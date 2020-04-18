package com.lab.java0418;

public class BinaryOperator {
    public static void main(String[] args) {
        int no = 3;
        int parking = 0b110101;
        int car     = (int)Math.pow(2, no); // 0b001000;
        int check = parking & car;
        System.out.print("車位:" + no + "號");
        System.out.println(check == 0 ? "可停":"不可停");
    }
}
