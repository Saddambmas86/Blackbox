package QA.Blackbox;

public class contructorchaining {
static int x;

    {
        System.out.println("Init block");
    }



    static {
      x=20;
        System.out.println(x);
    }

contructorchaining(){
this(5);

System.out.println("First const");
}

contructorchaining(int x){
this(12,16);
System.out.println("second construct");
}

contructorchaining(int x,int y){
System.out.println("3rd const");
}

public static void main(String...s){
    contructorchaining T1=new contructorchaining();

}

}
