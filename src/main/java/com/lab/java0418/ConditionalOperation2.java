package com.lab.java0418;

// 條件運算子
public class ConditionalOperation2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        String s = (++x > 10 | y++ > 0) ? "成功" : "失敗";
        System.out.printf("x= %d, y= %d, s= %s\n", x, y, s);

    }
}
