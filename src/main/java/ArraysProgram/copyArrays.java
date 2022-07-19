package ArraysProgram;

import java.sql.Array;
public class copyArrays {
 public static void main(String[] args) {
  int n=7;
  boolean IsPrime=true;

  for(int i=2;i<n;i++){
   if(n%i==0){
    IsPrime=false;
    break;
   }
  }

   if (IsPrime){
    System.out.println(n+" : Number is prime");
   }
   else{
    System.out.println(n+" : Number is not prime");
   }






 }


}
