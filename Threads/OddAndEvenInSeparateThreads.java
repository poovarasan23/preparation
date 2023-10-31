package Threads;

import java.util.Arrays;
import java.util.List;

public class OddAndEvenInSeparateThreads {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Calculation calculation=new Calculation(input);
        Thread t1=new Thread(()->calculation.printEven(input)); // passing input as parameter
        Thread t2=new Thread(calculation::printOdd); // passing input in constructor
        t1.start();
        t2.start();
    }
}


class Calculation {
    List<Integer> in;

    public Calculation(List<Integer> in) {
        this.in = in;
    }

    public synchronized void printEven(List<Integer> in) {
        System.out.println("Even Number");
        in.stream().filter(x-> x%2 ==0).forEach(System.out::print);
        System.out.println();
    }

    public synchronized void printOdd() {
        System.out.println("Odd Number");
        in.stream().filter(x-> x%2 !=0).forEach(System.out::print);
        System.out.println();
    }
}