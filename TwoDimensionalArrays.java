package com.company;

import java.util.Random;

public class TwoDimensionalArrays {
    public static void fillArray(int[][] array, int n){
        Random rand = new Random();
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                array[i][j] = 10+rand.nextInt(90);
            }
        }
    }
    public static void showArray(int[][] array, int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("HELLO ~ ");
        int n = 10;
        int[][] array = new int[n][n];
        fillArray(array, n);
        showArray(array, n);
    }
}