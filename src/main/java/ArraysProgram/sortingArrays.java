package ArraysProgram;

import java.util.Arrays;

public class sortingArrays {

    public static void main(String[] args) {


        int [] A={9,3,5,2,7,1};

//        Arrays.sort(A);
//       for (int i=0;i<A.length;i++){
//           System.out.println(A[i]);
//       }

int temp;
for (int i=0;i<A.length;i++){
    for (int j=0;j<A.length-1;j++){
        if (A[j]>A[j+1]){
       temp=A[j];
       A[j]=A[j+1];
       A[j+1]=temp;
        }
    }
}

for (int i=0;i<A.length;i++){
    System.out.println(A[i]);
}






    }

}
