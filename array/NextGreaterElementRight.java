import stack.stack;

public class NextGreaterElementRight {
    public static int findNextGreaterElement(int[] arr, int x){
        boolean foundX = false;

        for(int num : arr){
            if (foundX && num > x) {
                return num;
                
            }
            if (num == x) {
                foundX = true;
                
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int [] arr  = {4,5,78,9,4,76};
        int x = 9;
        int result  = findNextGreaterElement(arr, x);
        System.out.println(result);
    }
    
}