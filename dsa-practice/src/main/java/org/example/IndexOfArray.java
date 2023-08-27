package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class IndexOfArray {

    public static int indexOfMax(int[] arr){
       int maxVal = Integer.MIN_VALUE;
       int maxIndex = -1;

       for(int i = 0 ; i < arr.length; i++){
           if(arr[i] > maxVal){
               maxVal = arr[i];
               maxIndex = i;
           }
       }
       return  maxIndex;
    }

    public static int indexOfMin(int[] arr){
        int maxVal = Integer.MAX_VALUE;
        int maxIndex = -1;

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] < maxVal){
                maxVal = arr[i];
                maxIndex = i;
            }
        }
        return  maxIndex;
    }





    public static void main(String[] args) {
        int[] nums = {2, 33, 5, 8, 99};
        System.out.println(indexOfMax(nums));
        System.out.println(indexOfMin(nums));

        //System.out.println(Arrays.toString(Arrays.stream(indexOfMax(nums)).toArray()));
    }
}
