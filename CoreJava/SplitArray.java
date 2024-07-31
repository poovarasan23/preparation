package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
input = {0, 1, 2, 3, 4}
splitSize = 3

output :
[0, 1, 2]
[3, 4, 5]
[6, 7, 8]
[9]
 */

public class SplitArray {
    public static void main(String[] args) {
        int[] in = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int s = 3;
        List<int[]> op = ren(in, s);
        for (int[] a : op) {
            System.out.println(Arrays.toString(a));
        }
    }

    public static List<int[]> ren(int[] in, int s) {
        int a = in.length;
        List<int[]> op = new ArrayList<>();
        if (s == 0) {
            return op;
        }
        int first = 0, last = a % s, cycle = a / s, temp = 0;

        for (int i : in) {
            if (temp == 0) {
                addElemets(op, new int[s], temp, i);
            } else if (temp < s) {
                int[] data = op.get(first);
                data[temp] = i;
            } else {
                temp = 0;
                first++;
                if (first == cycle) {
                    /*
                    If the req o/p is :
                    [0, 1, 2]
                    [3, 4, 5]
                    [6, 7, 8]
                    [9, 0, 0]
                    then
                    change to
                    addElemets(op, new int[s], temp, i);
                     */
                    addElemets(op, new int[last], temp, i);
                } else {
                    addElemets(op, new int[s], temp, i);
                }
            }
            temp++;

        }
        return op;
    }

    private static void addElemets(List<int[]> op, int[] data, int temp, int e) {
        data[temp] = e;
        op.add(data);
    }
}
