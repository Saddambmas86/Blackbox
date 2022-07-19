package Practise;

import java.util.Scanner;

public class Countconsecutive {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter character");
        String A=scan.nextLine();

       // String A="acbbccd";

        System.out.println(A);
        int consecutive=0;

        for (int i=0;i<A.length();i++){
            if(i==A.length()-1)
                break;
            if(A.charAt(i)==A.charAt(i+1)){
                consecutive++;
            }
        }

        System.out.println(consecutive);

    }


}
