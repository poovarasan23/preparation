import java.util.Arrays;

class Scratch {
    public static void main(String[] args) {
        int[] in1={7,8,9,0,0};
        int[] in2={1,2};
        int m=3;
        int n=2;
        merge(in1,m,in2,n);
        System.out.println(Arrays.toString(in1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0 || n < 1) return;

        if(m == 0) {
            nums1[n - 1] = nums2[n - 1];
            merge(nums1, m, nums2, n - 1);
        } else if(nums1[m - 1] <= nums2[n - 1]) {
            nums1[m + n - 1] = nums2[n - 1];
            merge(nums1, m, nums2, n - 1);
        } else {
            nums1[m + n - 1] = nums1[m - 1];
            nums1[m - 1] = nums2[n - 1];
            merge(nums1, m - 1, nums2, n);
        }
    }


}

