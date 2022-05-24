package com.company;

public class Vector {
    private int cur_size;
    private int buf_size;
    private int[] array;

    public Vector(){
        cur_size = 0;
        buf_size = 0;
    }

    public void push_pack(int el){
        if (cur_size == 0 && buf_size == 0){
            buf_size = 1;
            array = new int[buf_size];
        }
        else if(cur_size>=buf_size){
            buf_size*=2;
            int[] ttemp = new int[buf_size];
            for (int i=0; i<cur_size; i++){
                ttemp[i] = array[i];
            }
            array = ttemp;
        }
        array[cur_size++] = el;
    }

    public void showVector(){
        for(int i=0; i<cur_size; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public void pop_back(){
        int[] ttemp = new int[--cur_size];
        for (int i=0; i<cur_size; i++){
            ttemp[i] = array[i];
        }
        array = ttemp;
    }

    public int Size(){
        return cur_size;
    }

    public int capacity(){
        return buf_size;
    }
}
