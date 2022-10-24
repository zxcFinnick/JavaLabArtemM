package ru.mirea.lab8.ex3;

public class ex3 {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        System.out.println(a);
        func(a,b);
    }
    public static int func(int a, int b){
        if (a == b) {
            return 1;
        }
        if (a > b){
            System.out.println(a - 1);
            a -= 1;
        }
        if (b > a){
            System.out.println(a + 1);
            a += 1;
        }
        return func(a,b);
    }
}
