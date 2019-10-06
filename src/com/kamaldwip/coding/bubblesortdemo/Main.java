package com.kamaldwip.coding.bubblesortdemo;

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
        }
        System.out.println("Sorted Array is :");
        for(int i = 0; i< arr.length ; i++){
            System.out.println(arr[i]);
        }

    }

    private static int[] swap(int[] arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
        return arr;
    }


}
