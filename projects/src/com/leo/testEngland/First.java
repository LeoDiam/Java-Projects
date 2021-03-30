package com.leo.testEngland;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.List;

public class First {

    public static int f( int x , int y) {
        return y == 0 ? 1 : x * f(x , y - 1);
    }
    public static int mystery ( int [][] a , int b) {
        int x = 0;
        for (int i = 0; i < a. length ; i ++) {
            for (int j = 0; j < a[i ]. length ; j ++) {
                x += (a[i ][ j] == b) ? b : 0;
            }
        }
        return x;
    }


    public static void main(String[] args) {
        int [][] a;
        a = new int[][]{{6, 4, 5, 8}, {4, 6, 4, 8}, {7, 3, 6, 4}, {1, 5, 4, 8}};
       System.out.println(mystery(a,4));
        System.out.println(f(3,5));
    }}

