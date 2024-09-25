import java.util.Arrays;

class Scratch {
    public static void main(String[] args) {
        int[] in = new int[]{1, 2, 3, 4};
        int[] out = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in.length; j++) {
                if (i != j) {
                    if (out[i] == 0) {
                        out[i] = in[j];
                    } else
                        out[i] *= in[j];
                }
            }
        }
        System.out.println(Arrays.toString(out));
    }
}