package Threads;

public class Sequence_NumberGeneratorThreads {

    private static class JThread implements Runnable {
        NumberGenerator numberGenerator;
        int index;

        public JThread(NumberGenerator numberGenerator, int index) {
            this.numberGenerator = numberGenerator;
            this.index = index;
        }

        @Override
        public void run() {
            numberGenerator.printNumber(index);
        }
    }

    public static void main(String[] args) {

        NumberGenerator generator = new NumberGenerator(3, 15);
        JThread thread1 = new JThread(generator, 1);
        JThread thread2 = new JThread(generator, 2);
        JThread thread3 = new JThread(generator, 0);

        Thread t1 = new Thread(thread1, "Thread 1");
        Thread t2 = new Thread(thread2, "Thread 2");
        Thread t3 = new Thread(thread3, "Thread 3");


        t1.start();
        t2.start();
        t3.start();
    }
}

class NumberGenerator {
    int no;
    int seq;
    int temp = 1;

    public NumberGenerator(int no, int seq) {
        this.no = no;
        this.seq = seq;
    }

    public void printNumber(int index) {
        synchronized (this) {
            while (temp < seq - 1) {
                while (temp % no != index) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                System.out.println(Thread.currentThread().getName()+" : "+temp++);
                notifyAll();
            }
        }
    }
}