package com.example.Java101;

public class diziOrnek {

    public static void main(String[] args){
        int[] arr={10,20,20,10,10,20,5,20};
        int n = arr.length;
        int[] frequency = new int[n];

        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < n; i++) {
            if (frequency[i] != -1) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        frequency[j] = -1; 
                    }
                }
                System.out.println(arr[i] + " sayısı " + count + " kere tekrar edildi.");
            }
        }
    }
}
