package Interview_code;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {

        String str="Umar Bin Khattab";
        String newstr="";
//        Set<Character> S1=new HashSet<>();
//
//        for (int i=0;i<str.length();i++){
//            S1.add(str.charAt(i));
//        }
//        System.out.println(S1);
//    }


    for(int i=0;i<str.length();i++){
if(newstr.indexOf(str.charAt(i))==-1){
    newstr=newstr+str.charAt(i);
}
}

        System.out.println(newstr);



    }



}
