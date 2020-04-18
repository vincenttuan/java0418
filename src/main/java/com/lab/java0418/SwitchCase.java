package com.lab.java0418;

public class SwitchCase {
    public static void main(String[] args) {
        String name = "boss";
        int salary = 0;
        switch(name) {
            case "boss":
                salary += 40000;
            case "manager":
                salary += 20000;
            case "employee":
                salary += 30000;
                break;
        }
        System.out.printf("%s 薪資 $ %,d\n", name, salary);
    }
}
