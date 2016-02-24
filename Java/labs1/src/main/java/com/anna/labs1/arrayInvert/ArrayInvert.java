package com.anna.labs1.arrayInvert;

import java.util.Arrays;

public class ArrayInvert {
    public static void arrInvert(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            int tmp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = tmp;
        }
      System.out.println(Arrays.toString(arr));   
    }
    
     public static void arrInvertDecr(int[] arr){
        for(int i = arr.length-1; i > arr.length/2; i--){
            int tmp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = tmp;
        }
      System.out.println(Arrays.toString(arr));   
    }
}
