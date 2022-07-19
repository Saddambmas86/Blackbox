package QA.WhiteBox;

public class ErrorHandling {

public int test(){

 int a=20;
 try {
     System.exit(0);
     return a;
 }
 catch (ArithmeticException A){
     System.out.println(A);
 }
 catch (Exception A){
     System.out.println(A);
 }
 catch (Throwable A){
     System.out.println(A);
 }

 finally {
     return 50;
 }


}

    public static void main(String[] args) {
        ErrorHandling T1=new ErrorHandling();
        T1.test();
        System.out.println( T1.test());
    }

}
