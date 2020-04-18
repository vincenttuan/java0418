package com.lab.java0418;

// 雞兔同籠
// 雞 + 兔 = 35隻
// 雞腳 + 兔腿 = 94足
// 求雞兔各有幾隻 ?
public class CRCase {
    public static void main(String[] args) {
        int y = 94 - (35 * 2);
        int r = y / 2; // 兔子
        int c = 35 - r; // 雞
        System.out.printf("兔子: %d, 雞: %d\n", r, c);
        
    }
}
