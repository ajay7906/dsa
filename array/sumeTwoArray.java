import java.util.*;

public class sumeTwoArray {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10, 5};

        int maxSize = Math.max(arr1.length, arr2.length);

        int[] arr3 = new int[maxSize];

        for (int i = 0; i < maxSize; i++){
           int val1 = i < arr1.length ? arr1[i] : 0;
           int val2 = i < arr2.length ? arr2[i] : 0;
           arr3[i] = val1 + val2;
        } 
        System.out.println("Sum of the two arrays:");
        for (int i = 0; i < maxSize; i++) {
            System.out.print(arr3[i] + " ");
        }

    }
}