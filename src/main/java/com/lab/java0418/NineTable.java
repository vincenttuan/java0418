package com.lab.java0418;

public class NineTable {
    public static void main(String[] args) {
        
        
        for(int x=1;x<=9;x++){
            for (int y = 1; y <= 9; y++) {
                System.out.printf("%d*%d=%d\t", x, y, (x * y));
            }
            System.out.println();
        }
        
    }
}
