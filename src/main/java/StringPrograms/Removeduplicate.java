package StringPrograms;

public class Removeduplicate {

    public static void main(String[] args) {
        String A="Programming";
        String B=A.replaceAll("/s","");
       // System.out.println(B);




String newStr="";
        for (int i=0;i<B.length();i++){
            char ch=B.charAt(i);

            if(newStr.indexOf(ch)==-1){
newStr=newStr+ch;
            }

        }
        System.out.println(newStr);


    }



}
