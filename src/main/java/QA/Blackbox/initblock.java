package QA.Blackbox;

public class initblock {

    {
        System.out.println("Init block");
    }

    initblock(){
    System.out.println("1st Constructor");
    }

    initblock(int x){
        System.out.println("2nd Constructor: "+x);
    }

public static void main(String...s){
    initblock T1=new initblock();
    initblock T2=new initblock(123);
}


}
