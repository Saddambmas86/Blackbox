package QA.Blackbox;

import java.util.*;

public class Rategain2 {

    public static void main(String[] args) {

//        String str="Umar bin Khattab";
//        //System.out.println(str.replaceAll(" ",""));
////***************************
////String strnew="";
////
////for (int i=str.length()-1;i>=0;i--){
////    strnew=strnew+str.charAt(i);
////}
////        System.out.println(strnew);
////***************************
//
//Set Vowels=new HashSet<>();
//        Vowels.add('a');
//        Vowels.add('e');
//        Vowels.add('i');
//        Vowels.add('o');
//        Vowels.add('u');
//        Vowels.add('A');
//        Vowels.add('E');
//        Vowels.add('I');
//        Vowels.add('O');
//        Vowels.add('U');
//
//        int Vcount=0;
//        int Ccount=0;
//
//for (int i=0;i<str.length();i++){
//    if(Vowels.contains(str.charAt(i))){
//Vcount=Vcount+1;
//    }
//    else if(str.charAt(i)>'a' & str.charAt(i)<'z'){
//Ccount=Ccount+1;
//    }
//}
//        System.out.println("Vowels count: "+Vcount);
//        System.out.println("Consonent count: "+Ccount);
//
//
//String str="Automation is best";
//char [] chr=str.toCharArray();
//char [] rev=new char[str.length()];
//
//
////Fix the space
//for(int i=0;i<str.length()-1;i++){
//    if(chr[i]==' '){
//        rev[i]=' ';
//    }
//}
//
//
////reverse the word:
//int j=str.length()-1;
//
//for (int i=0;i<chr.length;i++){
//    if(chr[i]!=' ') {
//        if (rev[j] == ' ') {
//            j--;
//        }
//
//        rev[j] = chr[i];
//        j--;
//    }
//}
//        System.out.println(rev);


//String str="Automaion Appium";
//char chr[]=str.toCharArray();
//
//
//Set Vowels=new HashSet();
//Vowels.add('a');
//        Vowels.add('e');
//        Vowels.add('i');
//        Vowels.add('o');
//        Vowels.add('u');
//        Vowels.add('A');
//        Vowels.add('E');
//        Vowels.add('I');
//        Vowels.add('O');
//        Vowels.add('U');
//
//int start=0;
//int end=str.length()-1;
//
//while(end>start){
//if(!Vowels.contains(str.charAt(start))){
//    start++;
//}
//if(!Vowels.contains(str.charAt(end))){
//    end--;
//}
//
//char temp=chr[start];
//chr[start]=chr[end];
//chr[end]=temp;
//
//start++;
//end--;
//}
//
//        System.out.println(chr);
//ArrayList<String> list=new ArrayList();
//list.add("Pink");
//        list.add("Blue");
//        list.add("Black");
//        list.add("Yellow");
//        list.add("White");
//
//
//boolean flag=false;
//for (int i=0;i<list.size();i++){
//    for (int j=0;j<list.get(i).length();j++){
//        if(list.get(i).charAt(j)=='B'){
//            flag=true;
//            break;
//        }
//        else{
//            flag=false;
//        }
//    }
//
//if(flag==true){
//    System.out.println(list.get(i));
//}
//}

//String str="Khalid bin Waleed";
//
//Map<Character, Integer> map1=new HashMap<>();
//
//for (int i=0;i<str.length();i++){
//    if(map1.containsKey(str.charAt(i))){
//        map1.put(str.charAt(i), map1.get(str.charAt(i))+1);
//    }
//    else{
//        map1.put(str.charAt(i), 1);
//    }
//}
//
//Set S1=map1.entrySet();
//Iterator itr=S1.iterator();
//
//while(itr.hasNext()){
//    Map.Entry map2=(Map.Entry)itr.next();
//    if(map2.getValue().equals(2)){
//        System.out.println(map2.getKey());
//    }
//}

//String str="First Last Middle";
//String []StrArray=str.split(" ");
//String strfinal="";
//
//for (int i=StrArray.length-1;i>=0;i--){
//    strfinal=strfinal+StrArray[i]+" ";
//}
//        System.out.println(strfinal);
//


//int A[]={120,6,3,4,9,1};
//Arrays.sort(A);
//
//int index=0;
//
//for (int i=0;i<A[A.length-1];i++){
//    if(i==A[index]){
//        index++;
//    }
//    else{
//        System.out.println(i);
//    }
//

//}


//String str="Auto mn koi nhi";
//System.out.println(str.replaceAll(" ",""));

//int A[]={9,4,7,2,6,3,11};
//int Max=A[0];
//for (int i=0;i<A.length;i++){
//    if(A[i]>Max){
//        int temp=A[i];
//        A[i]=Max;
//        Max=temp;
//    }
//}
//        System.out.println(Max);


//int A[]={9,4,7,2,6,3,11};
//
//for (int i=0;i<A.length;i++){
//  for (int j=0;j<A.length-1;j++){
//      if(A[j]>A[j+1]){
//          int temp=A[j];
//          A[j]=A[j+1];
//          A[j+1]=temp;
//      }
//  }
//}
//        for(int i=0;i<A.length-1;i++){
//            System.out.println(A[i]);
//        }





    }
}
