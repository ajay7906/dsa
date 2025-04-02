public class SumOfNaturalNumbers {
    public static int sumNatural(int n){
        if(n==0){
            return 0;
        }else{
            return n + sumNatural(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumNatural(n));
    }
}