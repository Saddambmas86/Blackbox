package QA.Blackbox;

public class Nested {

    public static void main(String[] args) {
        Test2.InnerNested T1=new Test2.InnerNested();
        System.out.println(T1.y);
        //System.out.println(T1.x);
        Test2 T3=new Test2();
        Test2.InnerNested2 T2=T3.new InnerNested2();

        System.out.println(T2.z);
    }


}


class Test2{
    int x=19;
    static class InnerNested{
        int y=1991;
    }

    class InnerNested2{
        int z=29;
    }
}