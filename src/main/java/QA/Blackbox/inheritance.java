package QA.Blackbox;

public class inheritance extends Father{
   int x=100;
   public void test1(){
       System.out.println(super.x);
       System.out.println(((GrandFather)this).x);
   }

public static void main(String...s){
inheritance T5=new inheritance();
Father T2=new inheritance();
GrandFather T3=new inheritance();
System.out.println(T2.x);
System.out.println(T3.x);
T5.test1();
}}

class Father extends GrandFather{
int x=20;
}

class GrandFather{
    int x=50;
}