package Threads;

/*
output:
Thread 1
Thread 2
Thread 1
Thread 2
Thread 1
Thread 2
 */
public class PrintSimultaneousThreads_Way1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        int i = 1;
        while (i < 5) {
            Thread t1 = new Thread(thread::thread1);
            Thread t2 = new Thread(thread::thread2);
            t1.start();
            t2.start();
            i++;
        }
    }
}

class MyThread {
    boolean thread1 = true;

    public synchronized void thread1() {
        try {
            while (!thread1) {
                wait();
            }
            System.out.println("thread1");
            thread1 = false;
            notify();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized void thread2() {
        try {
            while (thread1) {
                wait();
            }
            System.out.println("thread2");
            thread1 = true;
            notify();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
