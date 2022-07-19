package Programs;

import java.util.Scanner;

public class Pyramid {

public static void trianglenumber(int n){
    for (int i=1;i<=n;i++){
        for (int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}


    public static void floydtriangle(int n){
    int num=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(num+" ");
                num=num+1;
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        //Pyramid.trianglenumber(number);
        Pyramid.floydtriangle(number);
    }


}
