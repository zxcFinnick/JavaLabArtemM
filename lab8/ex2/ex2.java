package ru.mirea.lab8.ex2;

public class ex2 {
    public static void main(String[] args){
        int n = 10;
        int k = 1;
        func(n, k);
    }
    public static int func(int n, int k){
        if (n + 1 == k) {
            return 1;
        }
        else{
            System.out.print(k + ", ");
            return func(n, k + 1);
        }
    }
}
