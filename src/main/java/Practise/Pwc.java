package Practise;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pwc {

    public static void main(String[] args) {
        String str="Umar bin Khattab";
//        String newstr="";
//
//        for(int i=str.length()-1;i>=0;i--){
//            newstr=newstr+str.charAt(i);
//        }
//        System.out.println(newstr);

//        Set<Character> S1=new HashSet<>();
//        S1.add('a');
//        S1.add('e');
//        S1.add('i');
//        S1.add('o');
//        S1.add('u');
//        S1.add('A');
//        S1.add('E');
//        S1.add('I');
//        S1.add('O');
//        S1.add('U');
//
//        int Vowels=0;
//        int Consonent=0;
//
//        for (int i=0;i<str.length();i++){
//            if(S1.contains(str.charAt(i))){
//                Vowels++;
//            }
//            else if(str.charAt(i)>='a' & str.charAt(i)<='z' || str.charAt(i)>='A' & str.charAt(i)<='Z'){
//                Consonent++;
//            }
//        }
//
//        System.out.println(Vowels);
//        System.out.println(Consonent);

//        String str1="Umar bin Khattab";
//        char ch[]=str1.toCharArray();
//        char newch[]=new char[ch.length];
//
//for (int i=0;i<str1.length();i++){
//    if(str1.charAt(i)==' '){
//        newch[i]=' ';
//    }
//}
//
//int j=str1.length()-1;
//
//for (int i=0;i<str1.length();i++){
//    if(ch[i]!=' '){
//        if(newch[j]==' '){
//            j--;
//        }
//        newch[j]=ch[i];
//        j--;
//    }
//}
//        System.out.println(newch);

//        String str1="Umar Bin Khattab";
//        char ch[]=str1.toCharArray();
//        int start=0;
//        int end=str1.length()-1;
//
//
//Set<Character> S1=new HashSet<>();
//        S1.add('a');
//        S1.add('e');
//        S1.add('i');
//        S1.add('o');
//        S1.add('u');
//        S1.add('A');
//        S1.add('E');
//        S1.add('I');
//        S1.add('O');
//        S1.add('U');
//
//
//        while (start<end){
//            if(!S1.contains(str1.charAt(start))){
//                start++;
//            }
//            if(!S1.contains(str1.charAt(end))){
//                end--;
//            }
//            char temp=ch[start];
//            ch[start]=ch[end];
//            ch[end]=temp;
//            start++;
//            end--;
//        }
//
//        System.out.println(ch);
//

//        List<String> L1=new ArrayList<>();
//        L1.add("Umar");
//        L1.add("Bin");
//        L1.add("Khattab");
//
//        for (int i=0;i<L1.size();i++){
//            for (int j=0;j<L1.get(i).length();j++){
//                if(L1.get(i).charAt(j)=='i'){
//                    System.out.println(L1.get(i));
//                    break;
//                }
//            }
//        }


        String str1="Umar Bin Khattab";
        System.out.println(str1.replace(" ",""));


    }
}
