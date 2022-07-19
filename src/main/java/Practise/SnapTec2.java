package Practise;

import java.util.*;

public class SnapTec2 {
    public static void main(String[] args) {


//        String str = "Umar Bin Khattab";
//        String newstr = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//newstr=newstr+str.charAt(i);
//        }
//        System.out.println(newstr);
//

//String str="Umar bin khattab";
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
//int Vcount=0;
//int Ccount=0;
//
//for(int i=0;i<str.length();i++){
//    if(S1.contains(str.charAt(i))){
//        Vcount++;
//    }
//    else if((str.charAt(i)>'a' & str.charAt(i)<='z') ||(str.charAt(i)>'A' & str.charAt(i)<='Z')){
//        Ccount++;
//    }
//}
//        System.out.println(Vcount);
//        System.out.println(Ccount);


//String str="Umar Bin Khattab";
//char ch[]=str.toCharArray();
//char newch[]=new char[ch.length];
//
//for (int i=0;i<ch.length;i++){
//    if(ch[i]==' '){
//        newch[i]=' ';
//    }
//}
//int j=ch.length-1;
//for (int i=0;i<ch.length;i++){
//    if(ch[i]!=' '){
//        if(newch[j]==' '){
//            j--;
//        }
//
//    newch[j]=ch[i];
//        j--;
//    }
//}
//System.out.println(newch);

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
//String str="Automate";
//char ch[]=str.toCharArray();
//char newch[]=new char[ch.length];
//int start=0;
//int end=ch.length-1;
//
//while(start<end){
//    if(!S1.contains(ch[start])){
//        start++;
//    }
//    if(!S1.contains(ch[end])){
//        end--;
//    }
//
//    char temp=ch[start];
//    ch[start]=ch[end];
//    ch[end]=temp;
//
//    start++;
//    end--;
//}
//
//        System.out.println(ch);


//        ArrayList<String> A1=new ArrayList<>();
//        A1.add("Black");
//        A1.add("Pink");
//        A1.add("Blue");
//
//        int size=A1.size();
//        for(int i=0;i<size;i++){
//            for(int j=0;j<A1.get(i).length();j++){
//                if(A1.get(i).charAt(j)=='i'){
//                    System.out.println(A1.get(i));
//                }
//            }
//        }
//

       // String str="Umar Bin Khattab";
       // System.out.println(str.replaceAll(" ",""));

//String strarr[]=str.split(" ");
//String newtsr="";
//int size=strarr.length;
//
//for (int i=0;i<size;i++){
//    for (int j=strarr[i].length()-1;j>=0;j--) {
//        newtsr = newtsr + strarr[i].charAt(j);
//    }
//    newtsr=newtsr+ " ";
//}
//        System.out.println(newtsr);


//        String str="Umar Bin Khattab";
//        char ch[]=str.toCharArray();
//        Map<Character,Integer> M1=new HashMap<>();
//        for (int i=0;i<ch.length;i++){
//            if(M1.containsKey(ch[i])){
//                M1.put(ch[i],M1.get(ch[i])+1);
//            }
//            else{
//                M1.put(ch[i],1);
//            }
//        }
//        System.out.println(M1);
//
//Iterator itr=M1.entrySet().iterator();
//while (itr.hasNext()){
//    Map.Entry M2=(Map.Entry)itr.next();
//    if(M2.getValue().equals(2)){
//        System.out.println(M2.getKey());
//    }
//}

//String str="umar bin khattab";
//char ch[]=str.toCharArray();
////Arrays.sort(ch);
//        System.out.println(ch);
//for (int i=0;i<str.length();i++){
//    for (int j=i+1;j<str.length();j++){
//        if(ch[i]>ch[j]){
//char temp=ch[i];
//ch[i]=ch[j];
//ch[j]=temp;
//        }
//    }
//}
//       System.out.println(ch);


//String str="Appletter";
//char ch[]=str.toCharArray();
//String str1="";
//
//Set<Character> S1=new LinkedHashSet<>();
//for(int i=0;i<ch.length;i++){
//    S1.add(ch[i]);
//}
//        System.out.println(S1);
//
//for(int i=0;i<ch.length;i++){
//    if(str1.indexOf(ch[i])==-1){
//        str1=str1+str.charAt(i);
//    }
//}
//        System.out.println(str1);
//
/////*
//String S1="Audi A1,Audi A2,Audi A3,BMW B1,BMW B2";
//String strarr[]=S1.split(",");
//List<String> L1=new ArrayList<>();
//Map<String,List<String>> M1=new HashMap<>();
//
//for (int i=0;i<strarr.length;i++){
//    L1.add(strarr[i]);
//}
//
//for (int i=0;i<L1.size();i++){
//    String strarr2[]=L1.get(i).split(" ");
//    String carname=strarr2[0];
//    String model=strarr2[1];
//    List<String> L2=M1.get(carname);
//    if(L2==null){
//        L2=new ArrayList<>();
//        M1.put(carname,L2);
//    }
//    L2.add(model);
//}
//        System.out.println(M1);
//
//
//
//
//        String S1="Audi A1,Audi A6,BMW B1,BMW B2,Audi A3";
//        String S2=","+"Audi A3";
//        String S3="Audi A3"+",";
//        if(S1.contains(S2)) {
//            System.out.println(S1.replace(S2,""));
//        }
//        else if(S1.contains(S3)) {
//            System.out.println(S1.replace(S3,""));
//        }
//
//
//
//
//
//
//

    }}
