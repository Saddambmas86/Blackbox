package QA.Blackbox;

public class override extends A{

    void test(){
        System.out.println("Child Method1");
    }

    @Override
    Object show4(){
        System.out.println("Object Child class");
        return new Object();
    }
@Override
    public void testQA(){
        System.out.println("Child Test Method2");
    }

public static void main(String...s){

       override T1=new override();
       A T2=new override();
       A T3=new A();
//        T1.test();
    T1.testQA();
//        T2.test();
//        T3.test();
    //T2.show4();
}

}


class A{

     void test(){
        System.out.println("Parent Method1");
    }

   protected void testQA(){
        System.out.println("Parent Test Method2");
    }


    Object show4(){
         System.out.println("Parent Object Type");
         return new Object();
    }

}