package ru.mirea.lab1;

import java.util.Scanner;

public class Ex7 {
    public Ex7() {
    }

    static int calculateFactorial(int f) {
        int res = 1;

        for(int i = 1; i <= f; ++i) {
            res *= i;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int Fc = calculateFactorial(i);
        System.out.println(Fc);
    }
}
