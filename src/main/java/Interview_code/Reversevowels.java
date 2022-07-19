package Interview_code;

import java.util.HashSet;
import java.util.Set;

public class Reversevowels {

 public static void main(String[] args) {

  Set<Character> Vowels=new HashSet<>();

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

  String str="Umar Bin Khattab";
  char ch[]=str.toCharArray();

  int start=0;
  int end=str.length()-1;

  while(start<end){
   if(!Vowels.contains(ch[start])){
    start++;
   }
   if(!Vowels.contains(ch[end])){
    end--;
   }
   char temp=ch[start];
   ch[start]=ch[end];
   ch[end]=temp;

   start++;
   end--;
  }

  System.out.println(ch);

 }

}
