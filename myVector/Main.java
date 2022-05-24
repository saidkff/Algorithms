package com.company;

import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Vector vct = new Vector();
        vct.push_pack(276);
        vct.push_pack(632);
        vct.push_pack(242);
        vct.push_pack(121);
        vct.push_pack(473);
        vct.showVector();
        System.out.println("Size is: " + vct.capacity());
    }
}