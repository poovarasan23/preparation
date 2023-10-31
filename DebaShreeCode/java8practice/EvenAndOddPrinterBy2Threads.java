package com.java8practice;

public class EvenAndOddPrinterBy2Threads implements Runnable{

    static int count =1;
    Object object;
    public EvenAndOddPrinterBy2Threads(Object object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        while(count<=10) {
            if(count%2==0 && Thread.currentThread().getName().equals("even")) {
                synchronized (object) {
                    System.out.println("Thread Name: "+Thread.currentThread().
                            getName()+"Value :"+count);
                    count ++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            if(count%2!=0&& Thread.currentThread().getName().equals("odd")) {
                synchronized (object) {
                    System.out.println("Thread Name: "+Thread.currentThread().getName()+"Value :"+count);
                    count++;
                    object.notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        Object lock=new Object();
        Runnable r1=new EvenAndOddPrinterBy2Threads(lock);
        Runnable r2=new EvenAndOddPrinterBy2Threads(lock);
        new Thread(r1,"odd").start();
        new Thread(r2,"even").start();
    }
}
