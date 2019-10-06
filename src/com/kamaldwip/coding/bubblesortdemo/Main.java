package com.kamaldwip.coding.bubblesortdemo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int arr[] = {25, 55, -2, 13, -25, 8, 32};

        doBubbleSort(arr);
    }

    private static void doBubbleSort(int[] arr) {

        for(int lastSortedPos = arr.length - 1; lastSortedPos > 0; lastSortedPos --){

            for(int i = 0; i<lastSortedPos; i++){
                if(arr[i] > arr[i+1]){
                    if(i == i+1){
                        System.out.println("Ignore.....");
                    }else {
                        arr = swap(arr, i, i + 1);
                    }
                }

            }
            System.out.println("After Iteration Array now is = "+ Arrays.toString(arr));
        }
        System.out.println("Sorted Array is :"+Arrays.toString(arr));

    }

    private static int[] swap(int[] arr, int i, int j) {
        System.out.println("Input numbers are "+arr[i]+" and "+arr[j]);
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
        System.out.println("After Swapping numbers are "+arr[i]+" and "+arr[j]);
        return arr;
    }


}
