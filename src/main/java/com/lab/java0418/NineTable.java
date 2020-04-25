package com.lab.java0418;

public class NineTable {
    public static void main(String[] args) {
        int n = 11;
        for(int x=1;x<=n;x++){
            for (int y = 1; y <= n; y++) {
                System.out.printf("%02d*%02d=%-3d ", x, y, (x * y));
            }
            System.out.println();
        }
        
    }
}
