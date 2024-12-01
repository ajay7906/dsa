import java.util.*;

public class findelement {
    public static void main(String[] args){
        Scanner scn  =  new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scn.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        System.out.print("Enter the element to find: ");
        int x = scn.nextInt();

        // input the element to find
        boolean found = false;
        int index = -1;

        for(int i = 0; i < n; i++){
            if (arr[i] == x) {
                found = true;
                index = i;
                break;
                
            }
        }

        
        if (found) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }


    }
}