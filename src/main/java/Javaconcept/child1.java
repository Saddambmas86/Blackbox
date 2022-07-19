package Javaconcept;

public class child1 extends parent1{

    void parmethod(){
        System.out.println("Child Method");
    }

    void testmethod(){
        super.parmethod();
    }

    String V1(){
        System.out.println("Return tyep is String method");
        return new String();
    }

    public static void main(String[] args) {
        child1 T1=new child1();
        T1.parmethod();
        T1.V1();
    }


}



class parent1{
    void parmethod(){
        System.out.println("parent method");
    }


    Object V1(){
        System.out.println("Return tyep is object method");
        return new parent1();
    }
}
