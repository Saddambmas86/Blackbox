package StringPrograms;

public class specialchar {

    public static void main(String[] args) {

        String str="@#$%jAva123%^&";

        String plain=str.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(plain);

    }


}
