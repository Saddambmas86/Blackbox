package Interview_code;

import java.util.HashSet;
import java.util.Set;

public class VowelsConsonentCount {


    public static void main(String[] args) {


        String str="Umar Bin Khattab";
        int Vowels=0;
        int Const=0;

        Set<Character> S1=new HashSet<>();
        S1.add('a');
        S1.add('e');
        S1.add('i');
        S1.add('o');
        S1.add('u');
        S1.add('A');
        S1.add('E');
        S1.add('I');
        S1.add('O');
        S1.add('U');

        for (int i=0;i<str.length();i++){
            if(S1.contains(str.charAt(i))){
                Vowels++;
            }
            else if(str.charAt(i)>'a' & str.charAt(i)<'z' || str.charAt(i)>'A' & str.charAt(i)<'Z'){
                Const++;
            }
        }
        System.out.println(Vowels);
        System.out.println(Const);

    }
}
