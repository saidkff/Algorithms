package com.company;

import java.util.Scanner;

public class AlgorithmEvklidNOD {
    public static void Evklid_NOD(int a, int b){
        if (b == 0){
            System.out.println("NOD is: " + a);
        }
        else{
           Evklid_NOD(b, a%b);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Evklid_NOD(n, m);
    }
}