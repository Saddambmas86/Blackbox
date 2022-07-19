package QA.Blackbox;

public class copyconstrictor {

int a;
int b;

    copyconstrictor(){
      a=10;
      b=18;

    }

    copyconstrictor(copyconstrictor ref){
        a= ref.a;
        b= ref.b;
        System.out.println(a+b);
    }

public static void main(String...s){
    copyconstrictor T1=new copyconstrictor();
    copyconstrictor T2=new copyconstrictor(T1);
}



}
