package StringPrograms;

class BubbleInteger {

    public static void main(String[] args) {

        int A[]={13,2,7,4,17,1,11,8,4,3};
        int temp;

        //first for loop for round
        //Second loop for adjacent element
        for (int i=0;i<A.length;i++) {
            for (int j = 0; j < A.length-1; j++) {
                if (A[j] > A[j + 1]) {
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }

        }
       for (int i=0;i<A.length;i++){
           System.out.println(A[i]);
       }







    }




}
