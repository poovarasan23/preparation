package CoreJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] in = new int[]{4, 0, 1, -2, 3};
        List<Integer> out = new ArrayList<>();
        for (int i = 0; i < in.length; i++) {
            out.add((i > 0 ? in[i - 1] : 0 )+ in[i] + (i < in.length - 1 ? in[i + 1] : 0));
        }
        out.forEach(System.out::print);
    }
}
