package QA.Blackbox;

public class Abstract extends test {

    Abstract(){
        System.out.println("Child Constructor");
    }

 void meth1(){
     System.out.println("Abstract");
 }

public static void main(String...s){

     test T1=new Abstract();
//T1.show();
 }}

abstract class test{

    test(){
        System.out.println("Parent constructor");
    }

     abstract void meth1();

    void show(){
        System.out.println("Abstract class");
    }
}