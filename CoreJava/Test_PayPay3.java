package CoreJava;

import java.util.Arrays;

public class Test_PayPay3 {
    public static void main(String[] args) {
        int[][] m = new int[][]{{1,3,5},{1,4,6},{4,6,3}};
//        System.out.println(Arrays.toString(test(m)));
        System.out.println(diagonal(m));
    }
    
    static int diagonal(int[][] in){
        int n= in[0].length;
        int j =n-1,sum=0;
        for (int i = 0; i < n; i++) {
            sum+=in[i][i]+in[i][j];
            j--;
        }
        return sum;
    }

    static int[] test(int[][] in){
        int n= in[0].length;
        int[] out =new int[n];
        for (int i = 0; i < n; i++) {
            int count=0;
            boolean b = true;
            for (int j = i; count < n; ) {
                if (j < 0 ){
                    j= i +1;
                    b=false;
                }
                out[count]+=in[i][j];
                if (b)
                    j--;
                else
                    j++;
            count++;
            }

        }

        return out;
    }
}
