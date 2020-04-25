package com.lab.java0418;

public class DefMethod {
    // 主方法
    public static void main(String[] args) {
        sub1(30, 20);
    }
    // 子方法 1, 可帶入2個參數
    public static void sub1(int x, int y) {
        System.out.printf("sub1 收到 %d, %d\n", x, y);
        int sum = x + y;
        System.out.printf("sub1 計算結果= %d\n", sum);
    }
    // 子方法 2, 可帶入3個參數
    public static void sub2(int x, int y, int z) {
        
    }
}
