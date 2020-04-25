package com.lab.java0418;

public class ForDemo_PrimeNumber {
    public static void main(String[] args) {
        int n = 17;
        System.out.printf("%d 是否是質數? %b\n", n, checkPrime(n));
    }
    public static boolean checkPrime(int n) {
        for(int i=2;i<=n/2;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
