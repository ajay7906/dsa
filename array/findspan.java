import java.util.*;


public class findspan {
    public static void main(String[] args){
        Scanner snc  = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = snc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = snc.nextInt();
        }
       // System.out.println("The span of the array is: " + findSpan(arr,n));

       //find min and mx
       int min = arr[0];
       int max = arr[0];

       for(int i = 1; i < n; i++){
        if (arr[i] > max) {
            max = arr[i];
            
        }
        if (arr[i] < min) {
            min = arr[i];
        }
       }
       int span  = max - min;
       System.out.println("The span of the array is: " + span);
        
    }
}