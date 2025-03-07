package com.epam.rd.autotasks.arrays;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] array) {
        int res = 0;

        if (array != null) {
            for (int num : array) {
                if (num % 2 == 0) res += num;
            }
        }

        return res;
    }
}
