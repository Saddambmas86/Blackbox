package StringPrograms;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsConsonents {

    public static void main(String[] args) {

        Set<Character> Vowels=new HashSet<Character>();
        Vowels.add('A');
        Vowels.add('E');
        Vowels.add('I');
        Vowels.add('O');
        Vowels.add('U');
        Vowels.add('a');
        Vowels.add('e');
        Vowels.add('i');
        Vowels.add('o');
        Vowels.add('u');

String A="Apple";
char[] B=A.toCharArray();



int start=0;
int end=A.length()-1;

while(start<end){

 if(!Vowels.contains(B[start])){
start++;
continue;
 }

 if (!Vowels.contains(B[end])){
     end--;
     continue;
 }

char temp=B[start];
B[start]=B[end];
B[end]=temp;

start++;
end--;
}

        System.out.println(B);
    }
}
