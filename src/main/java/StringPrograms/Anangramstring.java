package StringPrograms;

public class Anangramstring {

    public static void main(String[] args) {

     String str1="mary";
     String str2="army";
     boolean flag=false;


     if(str1.length()==str2.length()){
         for (int i=0;i<str1.length();i++){
             for (int j=0;j<str1.length();j++){
                 if(str1.charAt(i)==str2.charAt(j)){
                    flag=true;
                 }
             }

         }
     }

        System.out.println(flag);






    }
}
