package com.leo.test;

public class A {
    static int add(int i,int j){
        return i + j;
    }

}
class B extends A{
    public static void main(String[] args) {
        short s = 9;
        A.add(s,6);

    }
}
