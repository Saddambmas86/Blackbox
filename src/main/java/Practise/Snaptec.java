package Practise;

import java.util.*;

public class Snaptec {

 public static void main(String[] args) {

//String str="Umar Bin Khattab";
//String newstr="";
//
//for (int i=str.length()-1;i>=0;i--){
// newstr=newstr+str.charAt(i);
//}
//
//  System.out.println(newstr);

//  String str="Umar Bin Khattab";
//  String strarr[]=str.split(" ");
//  String newstr="";
//
//  for (int i=0;i<strarr.length;i++){
//   for(int j=strarr[i].length()-1;j>=0;j--){
//    newstr=newstr+strarr[i].charAt(j);
//   }
//   newstr=newstr+" ";
//  }
//  System.out.println(newstr);

//  String str="Umar Bin Khattab";
//
//  Set<Character> Vowels=new HashSet<>();
//  Vowels.add('a');
//  Vowels.add('e');
//  Vowels.add('i');
//  Vowels.add('o');
//  Vowels.add('u');
//  Vowels.add('A');
//  Vowels.add('E');
//  Vowels.add('I');
//  Vowels.add('O');
//  Vowels.add('U');
//
//  int Vcount=0;
//  int Ccount=0;
//
//  for (int i=0;i<str.length();i++){
//   if(Vowels.contains(str.charAt(i))){
//    Vcount++;
//   }
//   else if(str.charAt(i)>='a' & str.charAt(i)<='z' || str.charAt(i)>='A' & str.charAt(i)<='Z'){
//    Ccount++;
//   }
//  }
//
//  System.out.println("Number of Count: "+Vcount);
//  System.out.println("Number of Ccount: "+Ccount);


//  String str="Umar Bin Khattab";
//  char ch[]=str.toCharArray();
//  char newch[]=new char[ch.length];
//
//  for (int i=0;i<ch.length;i++){
//   if(ch[i]==' '){
//    newch[i]=' ';
//   }
//  }
//
//  int j=ch.length-1;
//
//  for (int i=0;i<ch.length;i++) {
//   if (ch[i] != ' ') {
//    if (newch[j] == ' ') {
//     j--;
//    }
//    newch[j] = ch[i];
//    j--;
//   }
//  }
//  System.out.println(newch);

//  String str="Umar Bin Khattab";
//  char ch[]=str.toCharArray();
//  Set<Character> Vowels=new HashSet<>();
//  Vowels.add('a');
//  Vowels.add('e');
//  Vowels.add('i');
//  Vowels.add('o');
//  Vowels.add('u');
//  Vowels.add('A');
//  Vowels.add('E');
//  Vowels.add('I');
//  Vowels.add('O');
//  Vowels.add('U');
//
//  int start=0;
//  int end=str.length()-1;
//
//  while(start<end){
//   if(!Vowels.contains(ch[start])){
//    start++;
//   }
//   if(Vowels.contains(ch[end])){
//    end--;
//   }
//   char temp=ch[start];
//   ch[start]=ch[end];
//   ch[end]=temp;
//  }
//
//  System.out.println(ch);


//  ArrayList<String> A1=new ArrayList<>();
//  A1.add("Umar");
//  A1.add("Bin");
//  A1.add("Khattab");
//
//  int size=A1.size();
//  for (int i=0;i<size;i++){
//   for (int j=0;j<A1.get(i).length();j++){
//    if(A1.get(i).charAt(j)=='i'){
//     System.out.println(A1.get(i));
//     break;
//    }
//   }
//  }

//String str="Umar Bin Khattab";
//  System.out.println(str.replaceAll(" ",""));

//String str="Umar Bin Khattab";
//
//Map<Character,Integer> M1=new HashMap<>();
//
//for (int i=0;i<str.length();i++){
// if(M1.containsKey(str.charAt(i))){
//  M1.put(str.charAt(i), M1.get(str.charAt(i))+1);
// }
// else{
//  M1.put(str.charAt(i),1);
// }
//}
//Iterator itr=M1.entrySet().iterator();
//
//while(itr.hasNext()){
// Map.Entry M2= (Map.Entry) itr.next();
// if(M2.getValue().equals(2)){
//  System.out.println(M2.getKey());
// }
//}


//  int A[]={21,11,1,5,3,7,8,13};
//   Arrays.sort(A);
//
//  int size=A[A.length-1];
//  System.out.println(size);
// int index=0;
//
// for(int i=0;i<size;i++){
//if(A[index]==i){
// index++;
//}
//else{
// System.out.println(i);
//}
// }

//
//String str="umar bin khattab";
//char ch[]=str.toCharArray();
//for(int i=0;i<str.length();i++){
// for (int j=i+1;j<str.length();j++){
//  if(ch[i]>ch[j]){
//   char temp=ch[i];
//   ch[i]=ch[j];
//   ch[j]=temp;
//  }
// }
//}

 // System.out.println(ch);


//String str="Programming";
//
//  System.out.println(str.indexOf('t'));
//  //System.out.println(str.replaceAll("/s",""));
//
//String newstr="";
//for (int i=0;i< str.length();i++){
//if(newstr.indexOf(str.charAt(i))==-1){
// newstr=newstr+str.charAt(i);
//}
//}
//System.out.println(newstr);
//

String str="Calipha AbuBakr,Calipha Umar,Calipha Usman,Warrior Khalid,Warrior Hamzah";
String splitt[]=str.split(",");
ArrayList<String> L1=new ArrayList<>();

for (int i=0;i<splitt.length;i++) {
    L1.add(splitt[i]);
}

Map<String, List<String>> M1=new HashMap<>();

for(int i=0;i<L1.size();i++){
    String A[]=L1.get(i).split(" ");
    String A1=A[0];
    String A2=A[1];

    List<String> L2=M1.get(A1);

    if(L2==null){
        L2=new ArrayList<>();
        M1.put(A1,L2);
    }
    L2.add(A2);
}

     System.out.println(M1);



 }

}
