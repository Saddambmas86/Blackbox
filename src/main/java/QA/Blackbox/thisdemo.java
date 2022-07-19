package QA.Blackbox;

public class thisdemo {


 int a;
 int b;


 public void test1(int a,int b){
 this.a=a;
  this.b=b;
 }

 public void showdata(){
  System.out.println(a);
  System.out.println(b);
  test2(this,15);
 }

public void test2(thisdemo T2, int c){
  System.out.println("this argumemt");
}




 public static void main(String...s){

  thisdemo T1=new thisdemo();
  T1.test1(10,19);
  T1.showdata();






 }



}
