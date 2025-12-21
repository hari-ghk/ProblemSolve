package com.dsa.arrays.easy;

public class FindLargestInArray {

    public static void main(String args[]){
        int[] arr = {200,3000,201,101,405,607};
        System.out.println("Largest Element: "+ findLargestElement(arr));
        System.out.println("Largest Element: "+ findLargestElement(null));
    }

    private static int findLargestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        if(arr == null)
            return max;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
