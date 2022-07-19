package Programs;

public class flagloop {

    public static void main(String[] args) {


boolean flag=true;

        try {
            if (flag) {
                System.out.println("Yes");
                while (true) {
                    System.out.println("NO");
                }
            } else {
                System.exit(1);
            }
        } finally {
            System.out.println("In Finally");
        }


    }



}
