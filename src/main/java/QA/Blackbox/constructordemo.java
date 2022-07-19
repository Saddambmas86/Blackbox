package QA.Blackbox;

public class constructordemo {

    int x;
    int y;

    constructordemo(){
        x=12;
        y=18;
    }

    public void constructordemo(){
        System.out.println("Classs name method");
    }

    public static void main(String...s){

        constructordemo T1=new constructordemo();
        System.out.println(T1.x);
        System.out.println(T1.y);
T1.constructordemo();
    }


}
