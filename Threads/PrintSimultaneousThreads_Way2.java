package Threads;/*
Complete failure

Not following the order
 */

public class PrintSimultaneousThreads_Way2 {
    public static void main(String[] args) {
        int i = 0;
        while (i<5){
            Thread t1=new Thread(new MyThread1());
            Thread t2=new Thread(new MyThread2());
            t1.start();
            t2.start();
            i++;
        }
    }
}

class MyThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("thread 1");
        Thread.yield();
    }
}

class MyThread2 extends Thread {

    @Override
    public void run() {
        System.out.println("thread 2");
        Thread.yield();
    }
}