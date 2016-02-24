package arrayMerge;

import java.util.Arrays;

public class ArrayMerge {
    public static int[] merge(int[] arr1,int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        System.out.println(Arrays.toString(result));
        return result;
    }
    
}
