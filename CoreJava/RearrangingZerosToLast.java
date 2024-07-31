package CoreJava;

import java.util.Arrays;
import java.util.List;

/*
input : {1, 0, 3, 0, 2, 0}
output : [1, 3, 2, 0, 0, 0]
 */
public class RearrangingZerosToLast {

    /*
    Move all the zeros to left
    Op: [0, 0, 0, 0, 0, 0, 1, 3, 4, 6, 5, 2]
     */
    public static void main(String[] args) {
        int[] in = {1, 0, 3, 4, 6, 5, 0, 0, 0, 2, 0, 0};
        int count = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] != 0) {
                in[count++] = in[i];
            }
        }
        int x = in.length - count;
        for (int i = 0; i < in.length - count; i++) {
            in[x++]=in[i];
            in[i]=0;
        }
        System.out.println(Arrays.toString(in));
    }

    /*
    Move all the zeros to Right
    Op: [1, 3, 2, 0, 0, 0]
     */

//    public static void main(String[] args) {
//        int[] in = {1, 0, 3, 0, 2, 0};
//        int count = 0;
//        for (int i = 0; i < in.length; i++) {
//            if (in[i] != 0) {
//                in[count] = in[i];
//                in[i] = count == i ? in[i] : 0;
//                count++;
//            }
//        }
//        System.out.println(Arrays.toString(in));
//    }
}

/*
TODO: Simpler approach
public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 2, 0};
        int n = arr.length;
        int count = 0;
        int[] op= new int[n];
        for (int i:arr){
        if (i!=0){
        op[count] = i;
        count++;
        }
        }
        System.out.println(Arrays.toString(op));
        }
*/

/*
TODO: Another Approach
public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 2, 0};
        int n = arr.length - 1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < n) {
            arr[count++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
 */
