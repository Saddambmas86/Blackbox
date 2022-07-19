package Javaconcept;

public class AbstCl extends par{
    int A=40;

    @Override
    void test1() {
        System.out.println("Implementing abstract method");
    }

    public static void main(String[] args) {
        AbstCl t1=new AbstCl();
        System.out.println(t1.A);
    }
}




abstract class par{
    int A=20;

abstract void test1();
void test2() {
    System.out.println("Parent class method");
}
}
