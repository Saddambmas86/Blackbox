package QA.Blackbox;
public class AccessModifiers extends Test1{
    public int x=1;
    protected int y=2;
    int z=3;
    private int a=4;

    public static void main(String[] args) {
        AccessModifiers T1=new AccessModifiers();
        System.out.println(T1.x);
        System.out.println(T1.y);
        System.out.println(T1.z);
        System.out.println(T1.a);

        System.out.println(T1.x1);
        System.out.println(T1.x2);
        System.out.println(T1.x3);
       // System.out.println(T1.x4);

      //  System.out.println(T2.x4);
    }
}


class Test1{

  public int x1=11;
  protected int x2=12;
  int x3=13;
  private int x4=14;
        }




