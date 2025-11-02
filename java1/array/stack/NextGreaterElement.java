import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("The next greater element is: ");
        nextGreaterElement(arr);
    }
    public static void nextGreaterElement(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
    }
}