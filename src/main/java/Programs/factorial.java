package Programs;

public class factorial {
    public static void main(String[] args) {


        int n = 4;
        int fact = 1;
        while (n != 0) {
            fact = fact * n;
            n = n - 1;
        }
        System.out.println(fact);

    }

}
