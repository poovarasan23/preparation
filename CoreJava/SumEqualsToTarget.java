package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
sum of numbers equal to desired output

input = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10, 11, 12}
target = 14

output:
[2, 12]
[3, 11]
[4, 10]
[5, 9]
[6, 8]

 */
public class SumEqualsToTarget {
    public static void main(String[] args) {
        int[] in = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int t = 14;
        test(in, t).forEach(x -> {
            System.out.println(Arrays.toString(x));
        });
    }

    public static List<int[]> test(int[] in, int t) {
        List<int[]> op = new ArrayList<>();
        int i = 0, j = in.length - 1;
        while (i < j) {
            int sum = in[i] + in[j];
            if (sum == t) {
                int[] temp = {in[i], in[j]};
                op.add(temp);
                i++;
                j--;
            } else if (sum < t) {
                i++;
            } else {
                j--;
            }
        }
        return op;
    }
}
