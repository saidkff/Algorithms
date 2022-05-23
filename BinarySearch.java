package com.company;

import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void fillArray(int[] array){
        Random rand = new Random();
        for (int i=0; i<array.length; i++){
            array[i] = 10 + rand.nextInt(90);
        }
    }

    public static void showArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void Merge(int[] array, int left, int right){
        int[] ttemp = new int[right+1];
        int i = left;
        int mid = (right+left)/2;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=right){
            if (array[i]>=array[j]){
                ttemp[k++] = array[j++];
            }
            else{
                ttemp[k++] = array[i++];
            }
        }
        while(i<=mid){
            ttemp[k++] = array[i++];
        }
        while(j<=right){
            ttemp[k++] = array[j++];
        }
        for (int s=0; s<k; s++){
            array[s+left] = ttemp[s];
        }
    }

    public static void MergeSort(int[] array, int left, int right){
        if (right>left){
            if (right-left == 1){
                if(array[left]>array[right]){
                    int ttemp = array[left];
                    array[left] = array[right];
                    array[right] = ttemp;
                }
            }
            else{
                MergeSort(array, left, (right+left)/2);
                MergeSort(array, (left+right)/2+1, right);
                Merge(array, left, right);
            }
        }
    }

    public static void BinarySerach(int[] array){
        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();
        int left = 0;
        int right = array.length-1;
        while(left<=right){
            int middle = (left+right)/2;
            if (array[middle]<key){
                left = middle+1;
            }
            else if(array[middle]>key){
                right = middle-1;
            }
            else{
                System.out.println("Index is: " + middle);
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("YAHOO! ");
        int[] array = new int[10];
        fillArray(array);
        showArray(array);
        MergeSort(array, 0, array.length-1);
        showArray(array);
        System.out.print("Enter a number:  ");
        BinarySerach(array);
    }
}
