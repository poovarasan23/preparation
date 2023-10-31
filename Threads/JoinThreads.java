package Threads;

public class JoinThreads {

    private static class MyRunnable implements Runnable {

        Thread t;

        @Override
        public void run() {
            System.out.println("execution started" + Thread.currentThread().getName());
            try {
                if (t != null) {
                    t.join();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("execution ended" + Thread.currentThread().getName());
        }

        public void setT(Thread t) {
            this.t = t;
        }
    }

    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        MyRunnable r2 = new MyRunnable();
        MyRunnable r3 = new MyRunnable();

        Thread t1 = new Thread(r1, "Thread 1");
        Thread t2 = new Thread(r2, "Thread 2");
        Thread t3 = new Thread(r3, "Thread 3");

        r2.setT(t1);
        r3.setT(t2);

        t1.start();
        t2.start();
        t3.start();
    }
}


