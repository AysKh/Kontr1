package com.company;

import java.io.*;
import java.util.InputMismatchException;


public class Main {
    public static void T2(int c) throws IOException{
        int[] n = new int[c];
        int arrn = 0;
        for(int i = 0; i < n.length; i++) {
            n[i] = arrn;
            System.out.print(n[i] + " ");
            arrn += 3;
        }
    }

    public static void main(String[] args)
    {
        int c = 8;
        System.out.println("Zadacha 2:");
        try {
            T2(c);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}