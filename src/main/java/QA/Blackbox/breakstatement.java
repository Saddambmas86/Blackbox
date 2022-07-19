package QA.Blackbox;

public class breakstatement {

    public static void main(String... s) {
        for (int i = 0; i <= 10; i++) {
            if (i == 2) {
                break;
            }
            System.out.println(i);
        }

    }
}