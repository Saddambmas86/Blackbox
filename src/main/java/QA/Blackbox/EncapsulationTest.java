package QA.Blackbox;

public class EncapsulationTest {

 private int a;

 public void setIds(int E1){
a=E1;
 }

 public int getIds(){
  return a;
 }

 public static void main(String[] args) {
  EncapsulationTest T1=new EncapsulationTest();
  T1.setIds(10000000);
  System.out.println(T1.getIds());
 }

}
