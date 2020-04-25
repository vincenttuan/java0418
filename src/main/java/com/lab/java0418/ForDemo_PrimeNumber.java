package com.lab.java0418;

public class ForDemo_PrimeNumber {
    public static void main(String[] args) {
        //int n = 17;
        //System.out.printf("%d 是否是質數? %b\n", n, checkPrime(n));
        printPrimeByRange(2, 100);
    }
    
    public static void printPrimeByRange(int begin, int end) {
        for(int i=begin;i<=end;i++) {
            if(checkPrime(i)) {
                System.out.println(i);
            }
        }
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
