package Interview_code;

public class ReversSentenceWord {

    public static void main(String[] args) {

        String str="Umar bin Khattab";
        String []newstr=str.split(" ");
        String reverseword="";

        for (int i=0;i<newstr.length;i++){
            for (int j=newstr[i].length()-1;j>=0;j--){
                reverseword=reverseword+newstr[i].charAt(j);
            }
            reverseword=reverseword+" ";
        }
        System.out.println(reverseword);
    }
}
