package ArraysProgram;

import java.util.Arrays;

public class Arraycompare {
    public static void main(String[] args) {
        int A[]={6,4,5,1,3,2};
        int B[]={1,2,3,6,4,5};
        boolean flag=false;

        if(A.length==B.length){
            Arrays.sort(A);
            Arrays.sort(B);
            for (int i=0;i<A.length;i++){
                if(A[i]!=B[i]){
                    flag=false;
                    break;
                }
                else{
                    flag=true;
                }
            }

            if(flag)
            System.out.println("Arrays are exactly the same");
            else{
                System.out.println(" not same");
            }
        }
        else{
            System.out.println("Arrays are not equal");
        }










    }


}
