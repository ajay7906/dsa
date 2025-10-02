// reverse the array
import java.util.*;

public class Reverse {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("The reversed array is: ");
        for(int i = n - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverseArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        left++;
        right--;
        }
    }      
    System.out.println("The reversed array is: ");
    for(int i = 0; i < n; i++){
        System.out.print(arr[i] + " ");
    }
}
