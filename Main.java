package com.company;

import org.jetbrains.annotations.NotNull;

public class Main {
    public static boolean zadanie1 (int a, int b) {

        return 10 <= a + b && a + b <= 20;
    }

    static int[] zad2(int @NotNull [] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            array[i] = i * 3;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxMas = mas.length;

        for (int i = 0; i < maxMas; i++) {
            if (mas[i] < 6) mas[i] = mas[i] * 2;
        }
        for (int i = 0; i < maxMas; i++) {
            System.out.print(i + "-" + mas[i] + " ");
        }
    }
}

