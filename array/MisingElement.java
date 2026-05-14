public class MisingElement {
    public static void main(String[] args) {
        // this will work only if array is shorted or if the missing element is not the last element
        int[] arr = {1, 4, 4, 5, 2, 2};
        int n = arr.length + 1; // since one element is missing
        // int totalSum = n * (n + 1) / 2; // sum of first n natural numbers
        // int arrSum = 0;
        // for (int num : arr) {
        //     arrSum += num; // sum of elements in the array
        // }   int missingElement = totalSum - arrSum; // the missing element is the difference
        // System.out.println("The missing element is: " + missingElement);  
          

    }
}
