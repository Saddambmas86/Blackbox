package ArraysProgram;

public class ArrayElementSum {

    public static void main(String[] args) {

        int A[]={1,4,7,2,6,3,3000};
        int sum=0;

for (int i=0;i<A.length;i++){
    sum=A[i]+sum;
}

        System.out.println(sum);

    }
}
