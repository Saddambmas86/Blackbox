package StringPrograms;

public class Reversenumb {

    public static void main(String[] args) {


        int A = 123456789;
int rev=0;
int rem;
while (A!=0) {
rem=A%10;
rev=rev*10+rem;
A=A/10;
        }

        System.out.println(rev);


    }



}
