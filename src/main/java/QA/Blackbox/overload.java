package QA.Blackbox;

public class overload {

    void show1(StringBuffer x){
    System.out.println("Method1");
}

    void show1(String x){
        System.out.println("Method2");
    }


    void show2(int a){
        System.out.println("Method int");
    }

    void show2(int...a){
        System.out.println("Method int array");
    }

    public static void main(String...s){

    overload T1=new overload();
    T1.show1("abc");
    T1.show1(new StringBuffer("abc"));
        T1.show2(1);
    T1.show2(1,2,3);
//T1.show1(null);
   }




}
