package com.company;

public class Heap {
    private int[] array;
    private int heapSize;

    Heap(){
        heapSize = 0;
        array = new int[heapSize];
    }

    private void add(int el){
        int[] ttemp = new int[++heapSize];
        for (int i=0; i<heapSize-1; i++){
            ttemp[i] = array[i];
        }
        ttemp[heapSize-1] = el;
        array = ttemp;
    }

    public void push(int el){
        int i = heapSize;
        int parent = (i-1)/2;
        add(el);
        while(i>0 && parent>=0){
            if (array[parent]<array[i]){
                int ttemp = array[parent];
                array[parent] = array[i];
                array[i] = ttemp;
            }
            i = parent;
            parent = (i-1)/2;
        }
    }

    public void showArray(){
        for (int i=0; i<heapSize; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public void getMax(){
        int ttemp = array[0];
        array[0] = array[heapSize-1];
        array[heapSize-1] = ttemp;

        int[] tmp = new int[--heapSize];
        for (int i=0; i<heapSize; i++){
            tmp[i] = array[i];
        }
        array = tmp;
        Heapity(0);
    }

    public void Heapity(int el){
        int parent = el;
        int left = parent*2+1;
        int right = parent*2+2;
        if (left<heapSize){
            if (array[parent]<array[left]){
                int ttemp = array[parent];
                array[parent] = array[left];
                array[left] = ttemp;
                Heapity(left);
            }
        }
        if (right<heapSize){
            if (array[parent]<array[right]){
                int ttemp = array[parent];
                array[parent] = array[right];
                array[right] = ttemp;
                Heapity(right);
            }
        }
    }
}
