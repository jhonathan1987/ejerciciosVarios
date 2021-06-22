package com.gm.prueba;

public class MovOrdenarArray {

    public static void main(String[] args) {
        int arr[] = {7, 1, 3, 2, 4, 5, 6};

        int i = 0;
        int count = 0;
        int temp;
        int n = arr.length;
        while (i < n) {
            if (arr[i] != i + 1) {
                temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
                count++;
            } else {
                i++;
            }
        }
        System.out.println(count);

    }
}
