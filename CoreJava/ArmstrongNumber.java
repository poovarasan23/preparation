package CoreJava;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int x = 1634;
        int temp = x;
        List<Integer> list = new ArrayList<>();
        while (temp != 0) {
            list.add(temp % 10);
            temp = temp / 10;
        }
        int count = list.size();
        int op = list.stream().reduce(0, (sum, val) -> (int) Math.pow(val, count) + sum);
        System.out.println((x == op) ? "Armstrong Number" : "Not an Armstrong Number");
    }
}