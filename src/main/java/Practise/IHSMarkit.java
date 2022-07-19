package Practise;

import com.fasterxml.jackson.core.JsonParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class IHSMarkit {
    public static void main(String[] args) throws IOException, ParseException {

//Reverse

//String str="Umar bin Khattab";
//String newstr="";
//
//for (int i=str.length()-1;i>=0;i--){
//    newstr=newstr+str.charAt(i);
//}
//System.out.println(newstr);



//Reverse with fixed space

//String str="Umar bin Khattab";
//char ch[]=str.toCharArray();
//char newch[]=new char[ch.length];
//
//
//for (int i=0;i<ch.length;i++){
//    if(ch[i]==' '){
//        newch[i]=' ';
//    }
//}
//
//int j=ch.length-1;
//
//for (int i=0;i<ch.length;i++){
//    if(ch[i]!=' '){
//        if(newch[j]==' '){
//            j--;
//        }
//        newch[j]=ch[i];
//        j--;
//    }
//}
//        System.out.println(newch);

//2.	Program for Vowels and consonant count

//        String str="Umar bin Khattab";
//
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
//        int Ccount=0;
//        int Vcount=0;
//
//        for (int i=0;i<str.length();i++){
//            if(S1.contains(str.charAt(i))){
//                Vcount++;
//            }
//            else if(str.charAt(i)>='a' & str.charAt(i)<='z' || str.charAt(i)>='A' & str.charAt(i)<='Z' ){
//                Ccount++;
//            }
//        }
//
//        System.out.println("Vowels Count: "+Vcount);
//        System.out.println("Consonents Count: "+Ccount);


//        4.	Program for reverse the Vowels and remain all the things as it is

//String str="Khalid bin Waleed";
//char ch[]=str.toCharArray();
//
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
//int start=0;
//int end=str.length()-1;
//
//while(start<end){
//    if(!S1.contains(ch[start])){
//        start++;
//    }
//    if(!S1.contains(ch[end])){
//        end--;
//    }
//    char temp=ch[start];
//    ch[start]=ch[end];
//    ch[end]=temp;
//    start++;
//    end--;
//}
//        System.out.println(ch);
//


//5.	Program to print the word having ‘e’ in the Arraylist

//
//        ArrayList<String> A1=new ArrayList<>();
//
//        A1.add("Turgut");
//        A1.add("Bamsi");
//        A1.add("Ertugrul");
//        A1.add("Doaan");
//
//        int size=A1.size();
//
//        for(int i=0;i<size;i++){
//            for (int j=0;j<A1.get(i).length();j++){
//                if(A1.get(i).charAt(j)=='u'){
//                    System.out.println(A1.get(i));
//                    break;
//                }
//            }
//        }
//


      //  6.	Program to remove space
//
//        String str="Umar bin khattab";
//        System.out.println(str.replaceAll(" ",""));
//        System.out.println(str.replace(" ",""));
//
//
//        String str1[]=str.split(" ");
//        String S3="";
//
//        for (int i=0;i<str1.length;i++){
//            for (int j=str1[i].length()-1;j>=0;j--){
//                S3=S3+str1[i].charAt(j);
//            }
//            S3=S3+" ";
//        }

//        System.out.println(S3);


//String str="Khalid bin Waleed";
//
//Map<Character,Integer> M1=new HashMap<>();
//
//for(int i=0;i<str.length();i++){
//    if(M1.containsKey(str.charAt(i))){
//        M1.put(str.charAt(i),M1.get(str.charAt(i))+1);
//    }
//    else{
//        M1.put(str.charAt(i),1);
//    }
//}
//        System.out.println(M1);
//
//Iterator itr=M1.entrySet().iterator();
//
//while(itr.hasNext()){
//    Map.Entry M2=(Map.Entry)itr.next();
//    if(M2.getValue().equals(2)){
//        System.out.print(M2.getKey()+" ,");
//    }
//}


//9.	Program to array missing number

//int A[]={1,2,5,7,11};
//int index=0;
//int size=A[A.length-1];
//        System.out.println(size);
//
//        for(int i=0;i<size;i++){
//            if(A[index]==i){
//                index++;
//            }
//            else{
//                System.out.print(i);
//            }
//        }
//

// int n=6;
// boolean flag=true;
//
// for(int i=2;i<n;i++){
//     if(n%i==0){
//         flag=false;
//         break;
//     }
//     else{
//         flag=true;
//     }
// }
//
//        System.out.println(flag);
//
// if(flag==true) {
//     System.out.println("number is prime");
// }
// else{
//     System.out.println("number is not prime");
// }


//        JSONParser parser=new JSONParser();
//        JSONObject obj= (JSONObject) parser.parse(new FileReader("C:\\Users\\Saddam\\Desktop\\TipsTricks\\Blackbox\\src\\main\\resources\\test.json"));
//        System.out.println(obj.get("firstname"));


//        FileInputStream Fin=new FileInputStream("C:\\\\Users\\\\Saddam\\\\Desktop\\\\TipsTricks\\\\Blackbox\\\\src\\\\main\\\\resources\\\\Dbqueries.properties");
//        Properties prop=new Properties();
//        prop.load(Fin);
//        System.out.println(prop.get("query2"));







    }
}
