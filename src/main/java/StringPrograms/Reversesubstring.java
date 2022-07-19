package StringPrograms;


public class Reversesubstring {

    public void rev2(String str) {
        String[] arrStr = str.split(" ");
        for (int i = arrStr.length - 1; i >= 0; i--) {
            boolean punct = i <= 0 || arrStr[i - 1].contains(".");
            if (!arrStr[i].contains(".")) {
                System.out.print(arrStr[i]);
            } else {
                System.out.print(arrStr[i].substring(0, arrStr[i].length() - 1));
            }
            //System.out.print((punct ? ". " : " "));
        }
    }

    public static void main(String[] args) {
        Reversesubstring t = new Reversesubstring();
        t.rev2("My name is Bob. I am happy.");
    }

}
