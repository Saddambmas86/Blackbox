package Programs;

public class exceptun {
 public static void checkage(int age){
     if(age<18){
         throw new ArithmeticException();
     }
     else{
         System.out.println("Applicable for Voting");
     }
 }
    public static void main(String[] args) {
        exceptun.checkage(15);
    }
}
