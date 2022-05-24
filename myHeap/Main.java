package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        Heap heap = new Heap();
        for (int i=0; i<10; i++){
            heap.push(10+ rand.nextInt(991));
        }
        heap.showArray();
        heap.getMax();
        heap.showArray();
    }
}
