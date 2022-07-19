package StringPrograms;

public class ReverseString {

    public static void main(String[] args) {


        String A="Automation Manual";
        int length=A.length();
        String Reverse="";

        for (int i=length-1;i>=0;i--){
            Reverse=Reverse+A.charAt(i);
        }

        System.out.println(Reverse);



    char [] initial=A.toCharArray();
    for (int i=initial.length-1;i>=0;i--){
        System.out.println(initial[i]);
    }





    }






}
