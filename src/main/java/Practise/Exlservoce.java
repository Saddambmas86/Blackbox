package Practise;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class Exlservoce {

    public static void main(String[] args) {


//        String S="Umar Bin Khattab";
//        String Sn="";
//
////        for(int i=S.length()-1;i>=0;i--){
////            Sn=Sn+S.charAt(i);
////        }
////        System.out.println(Sn);
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
// int Vowels=0;
// int Consonent=0;
//
// for(int i=0;i<S.length();i++) {
//     if (S1.contains(S.charAt(i))) {
//         Vowels = Vowels + 1;
//     } else if (S.charAt(i) >= 'a' & S.charAt(i) <= 'z' || S.charAt(i) >= 'A' & S.charAt(i) <= 'Z') {
//         Consonent++;
//     }
// }
//
//        System.out.println(Vowels);
//        System.out.println(Consonent);


//        String S1="Umar Bin Khattab";
//        char ch[]=S1.toCharArray();
//        char chnew[]=new char[ch.length];
//
//        for(int i=0;i< S1.length();i++){
//            if(ch[i]==' '){
//                chnew[i]=' ';
//            }
//        }
//
//int j=ch.length-1;
//
//        for(int i=0;i<ch.length;i++){
//            if(ch[i]!=' '){
//                if(chnew[j]==' '){
//                    j--;
//                }
//
//                chnew[j]=ch[i];
//                j--;
//            }
//        }
//
//        System.out.println(chnew);


String S="Umar Bin Khattab";
char ch[]=S.toCharArray();
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

int Start=0;
int end=S.length()-1;

while(Start>end){
    if(!S1.contains(ch[Start])){
        Start++;
    }
    if(!S1.contains(ch[end])){
        end--;
    }



}









    }




}
