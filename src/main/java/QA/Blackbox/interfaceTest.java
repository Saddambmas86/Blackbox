package QA.Blackbox;

public class interfaceTest implements I1,I2 {
    public static void main(String[] args) {
        interfaceTest T1=new interfaceTest();
        T1.show();
        //T1.a=100;

    }
    @Override
    public void show() {
        System.out.println("QA");
    }

    @Override
    public void arrow() {

    }
}


//============================================
interface I1{
    int a=10;
   public static final int ab=100000;
   //protected abstract void show(); --error only public should be allowed
  void show();
  default void display(){
      System.out.println("Interface parent method");
  }
  static void flash(){
      System.out.println("Parent static method");
  }
        }


interface I2{
    void arrow();
}