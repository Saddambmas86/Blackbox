package Interview_code;

public class ReverseString {

    public static void main(String[] args) {


//Reverse String
        String str="Umar Bin Khattab";
        String newstr="";

        for(int i=str.length()-1;i>=0;i--){
            newstr=newstr+str.charAt(i);
        }
        System.out.println(newstr);

    }
}
