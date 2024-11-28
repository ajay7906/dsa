// * 
//   *
//      *
//         *
//   
// 
// 
//



package randomQuestion;

public class diagonal {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
           //display diagnol star
           for (int j = 1; j < i; j++){
               System.out.print(" ");
               
           }
           //print space
           for (int j = 1; j <= 1; j++){
               System.out.print("*");
           }
           System.out.println();
        }   
    }
    
}
