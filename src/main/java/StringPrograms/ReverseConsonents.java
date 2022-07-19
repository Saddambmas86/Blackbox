package StringPrograms;

import java.util.HashSet;
import java.util.Set;

public class ReverseConsonents {

    public static void main(String[] args) {


        Set<Character> Vowels=new HashSet<Character>();
        Vowels.add('a');
        Vowels.add('e');
        Vowels.add('i');
        Vowels.add('o');
        Vowels.add('u');
        Vowels.add('A');
        Vowels.add('E');
        Vowels.add('I');
        Vowels.add('O');
        Vowels.add('U');

        String str1="clash";
        char chr[]=str1.toCharArray();
        int start=0;
        int end=str1.length()-1;

        while(start<end){
            if(Vowels.contains(chr[start])){
                start++;
                continue;
            }
            if(Vowels.contains(chr[end])){
                end--;
                continue;
            }

            char temp=chr[start];
            chr[start]=chr[end];
            chr[end]=temp;

            start++;
            end--;
        }

        System.out.println(chr);




















    }


}
