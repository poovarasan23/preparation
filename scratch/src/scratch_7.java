import java.util.Arrays;

class Scratch {
    public static void main(String[] args) {
        int[] in = new int[]{23415, 2345, 4567, 7689134, 678, 234};
        System.out.println(Arrays.toString(SelectionSort(in)));
        ;
    }

    /*
    Select the index of smallest value and swap it from respective index.
     */
    public static int[] SelectionSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;

            }

        }
        return arr;
    }

    /*
    Swap the nearby vales
     */
    public static int[] BubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}