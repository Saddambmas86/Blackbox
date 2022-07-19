package StringPrograms;

public class RemoveSpaces {

    public static void main(String[] args) {
        String str="i love india";
        String plain=str.replaceAll("\\s","");
        System.out.println(plain);
    }

}
