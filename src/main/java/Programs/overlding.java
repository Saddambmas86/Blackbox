package Programs;


class A{
     Object Test2(){
        System.out.println("Integerr parent");
        return new Object();
    }
}


public class overlding extends A {

    @Override
     String Test2(){
        System.out.println("Child class");
        return "QA";
            }



    public static int test1(int A, int B,int C){
        System.out.println("Return type float");
        return 2;
    }

    public static String test1(int A, int B){
        System.out.println("Return integer");
        return "Saddam";
    }




    public static void main(String[] args) {
overlding T1=new overlding();
T1.Test2();


    }


}
