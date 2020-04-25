package com.lab.java0418;

public class DefMethod {
    // 主方法
    public static void main(String[] args) {
        sub1(30, 20);
        int sum = sub2(30, 20, 10);
        System.out.println("main 自行印出 sum= " + sum);
    }
    // 子方法 1, 可帶入2個參數
    public static void sub1(int x, int y) {
        System.out.printf("sub1 收到 %d, %d\n", x, y);
        int sum = x + y;
        // sub1 自行將結果印出, 不回傳給呼叫端
        System.out.printf("sub1 計算結果= %d\n", sum);
    }
    // 子方法 2, 可帶入3個參數
    public static int sub2(int x, int y, int z) {
        System.out.printf("sub2 收到 %d, %d, %d\n", x, y, z);
        int sum = x + y + z;
        return sum; // sub2 將結果回傳給呼叫端
    }
}
