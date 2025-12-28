class equalSum{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       
        System.out.println(isPossible(arr));
    }
   
    public static boolean isPossible(int[] arr, ){
        for( int val: arr){
            sum += val;
        }
        int prefixSum = 0;
        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];
            int ans = sum - prefixSum;
            if(ans == prefixSum){
                return true;
            }
        }
        return false;
    }
}

