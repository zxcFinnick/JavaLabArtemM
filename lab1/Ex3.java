package ru.mirea.lab1;

public class Ex3 {
    public static void main(String[] args) {
        int[][] nums = new int[][]
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };
        for (int[] num : nums) {
            for (int i : num) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }



    }
}