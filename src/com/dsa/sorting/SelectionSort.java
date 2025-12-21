package com.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {
    //Time Complexity - O(N*2)
    public static void main(){
        int[] arr = {30,10,2,3,1};
        sortBySelection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortBySelection(int unsortedArray[]){
        int posMin = 0, temp=0;
        for(int i = 0; i < unsortedArray.length; ++i){
            posMin = i;
            for(int j = i + 1; j < unsortedArray.length; ++j){
                if(unsortedArray[j] < unsortedArray[posMin]){
                    unsortedArray[posMin] = unsortedArray[j];
                    posMin = j;
                }
            }
            temp = unsortedArray[i];
            unsortedArray[i] = unsortedArray[posMin];
            unsortedArray[posMin] = temp;
        }
    }
}
