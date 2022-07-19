package QA.Blackbox;

public class superclass extends parent {

    {
        System.out.println("init block of child");
    }

superclass(int b){
    this();
    System.out.println("child 2 constructor");
}

superclass(){
    System.out.println("Child Constructor");
}

  int a=20;

    void test(){
        System.out.println("Child override method");
    }

  void show(){
      System.out.println(a);
      System.out.println(this.a);
      System.out.println(super.a);
      System.out.println(((Grandparent)this).a);
      test();
      this.test();
      super.test();
  }

public static void main(String...s){

    superclass T1=new superclass();
   T1.show();


   parent T2=new superclass();
   T2.test();


}}

class parent extends Grandparent{
    {
        System.out.println("init block of parent");
    }

parent(){
    System.out.println("Parent constructor");
}


    int a=19;

    void test(){
        System.out.println("Parent override method");
    }
}


class Grandparent{

    int a=18;

}