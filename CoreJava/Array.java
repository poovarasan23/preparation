package CoreJava;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] value = {"poo", "bhuvi"};
        char[][] arr = new char[value.length][];

        for (int i = 0; i < value.length; i++) {
            arr[i] = new char[value[i].length()];
            for (int j = 0; j < value[i].length(); j++) {
                arr[i][j] = value[i].charAt(j);
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
