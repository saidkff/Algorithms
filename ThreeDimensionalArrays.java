package com.company;

import java.util.Random;

public class ThreeDimensionalArrays {
    public static void fillArray(int[][][] array, int n){
        Random rand = new Random();
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                for (int k=0; k<n; k++){
                    array[i][j][k] = 10+rand.nextInt(90);
                }
            }
        }
    }

    public static void showArray(int [][][] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                for (int k=0; k< array.length; k++){
                    System.out.print(array[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int[][][] array = new int[n][n][n];
        fillArray(array, n);
        showArray(array);
    }
}