/*
Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the Reverse N-Number Triangle.
Example:
Input: ‘N’ = 3
Output: 
1 2 3
1 2
1
 */
public class pattern6 {
        public static void nNumberTriangle(int n) {
            for(int i=0;i<n;i++){
                for(int j=n-1;j>=i;j--){
                    System.out.print(n-j+" ");
                }
                System.out.println();
            }
        }
    
}
