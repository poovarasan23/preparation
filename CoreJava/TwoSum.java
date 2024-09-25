package CoreJava;

public class TwoSum {
    public static void main(String[] args) {
        int[] in = {2, 4, 1, 5, 10, 6};
        int[] in2 = {-1, 1, 0, 1, -1, 0};
        int k = 4;

        int profit = 0;
        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            if (i < k / 2) {
                temp[i] = 0;
            } else temp[i] = 1;
        }
        profit = Math.max(profit, cal(in, in2));

        for (int i = 0; i <= in2.length - k; i++) {

            int[] temp1 = new int[in.length];
            for (int z = 0; z < in2.length; z++) {
                temp1[z] = in2[z];
            }

            int x = 0;
            for (int j = i; j < k + i; j++, x++) {
                temp1[j] = temp[x];
            }
            profit = Math.max(profit, cal(in, temp1));
        }
        System.out.println(profit);

    }

    public static int cal(int[] in, int[] s) {
        int profit = 0;
        for (int i = 0; i < in.length; i++) {
            profit += (in[i] * s[i]);
        }
        return profit;
    }

}


//int[] nums = {3, 2, 4};
//int target = 7;
//int n = nums.length;
//        for (int i = 0; i < n - 1; i++) {
//        for (int j = i + 1; j < n; j++) {
//        if (nums[i] + nums[j] == target) {
//        System.out.println(i+","+j);
//                }
//                        }
//                        }