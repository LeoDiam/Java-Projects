package com.leo.test;

public interface BaseI {
    void method();

}
class BaseC{
    public void method(){
        System.out.println("whatever");
    }
}
class impc extends BaseC implements BaseI{
    public static void main(String[] args) {
        (new impc()).method();
    }
}
