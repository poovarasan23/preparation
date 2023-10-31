package Threads;

import java.util.Arrays;

public class Thread_Asc_Desc_Order {
    public static void main(String[] args) {
        int[] in = {1, 5, 3, 4, 7, 9, 2, 6};
        OrderThread thread = new OrderThread();
        Thread t1 = new Thread(() -> thread.asc(in), "Ascending order");
        Thread t2 = new Thread(() -> thread.desc(in), "Descending order");
        t1.start();
        t2.start();
    }
}

class OrderThread {
    public synchronized void asc(int[] in) {
        int count = in.length;
        int temp;
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (in[i] < in[j]) {
                    temp = in[i];
                    in[i] = in[j];
                    in[j] = temp;
                }
            }
        }
        System.out.println(Thread.currentThread().getName() + " ==> " + Arrays.toString(in));
    }

    public synchronized void desc(int[] in) {
        int count = in.length;
        int temp;
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (in[i] > in[j]) {
                    temp = in[i];
                    in[i] = in[j];
                    in[j] = temp;
                }
            }
        }
        System.out.println(Thread.currentThread().getName() + " ==> " + Arrays.toString(in));
    }
}
