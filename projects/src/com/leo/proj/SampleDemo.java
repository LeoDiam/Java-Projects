package com.leo.proj;

public class SampleDemo implements Runnable{
    private String threadName;
    private Thread t;

    public SampleDemo(String a) {
        this.threadName = a;
    }

    @Override
    public void run() {
        while (true)
            System.out.println(threadName);
    }
    public void start(){
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
 class TestThread{
    public static void main(String[] args) {
     SampleDemo A = new SampleDemo("A");
        SampleDemo B = new SampleDemo("B");
        B.start();
        A.start();
    }
}
