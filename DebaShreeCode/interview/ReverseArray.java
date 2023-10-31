package com.interview;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7};
        int n= arr.length-1;

        for (int i=0; i< (n/2); i++){
            int temp= arr[i];
            arr[i] = arr[n-i];
            arr[n-i]= temp;
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
