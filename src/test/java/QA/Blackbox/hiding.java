package QA.Blackbox;

import junit.framework.TestCase;

public class hiding extends TestSuper {

 public static void test1(){
     System.out.println("Child Static class");
 }

    public void test2(){
        System.out.println("Child Non Static class");
    }


   public static void main(String...s){
     hiding.test1();
     hiding T1=new hiding();
     T1.test2();
     T1.test1();


       TestSuper.test1();






   }

}


class TestSuper{

    public static void test1(){
        System.out.println("Super Static class");
    }

    public void test2(){
        System.out.println("Super non Static class");
    }
}