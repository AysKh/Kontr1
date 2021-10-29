package com.company;

import java.io.*;
//import java.util.InputMismatchException;
//import java.util.Scanner;

public class Main {
    public static void T3() throws IOException {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
            {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("\nZadacha 3:");
        T3();
    }
}