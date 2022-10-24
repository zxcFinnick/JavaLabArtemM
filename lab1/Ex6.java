package ru.mirea.lab1;

import java.util.Scanner;

public class Ex6 {
    public Ex6() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);

        for(int a = 1; a < 11; ++a) {
            float a1 = (float)a;
            float f = 1.0F / a1;
            System.out.printf("%.2f ", f);
        }

    }
}
