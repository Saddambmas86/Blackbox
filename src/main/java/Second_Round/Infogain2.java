package Second_Round;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Infogain2 {


    public static String reverseString(String str) {
        String newstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newstr = newstr + str.charAt(i);
        }
        System.out.println(newstr);
        return newstr;
    }

    public static void main(String[] args) throws IOException, ParseException {

        // System.out.println(Infogain2.reverseString("Saddam bhai"));

//        String str="Automation Testing";
//        Map<Character, Integer> M1=new HashMap<>();
//
//        for (int i=0;i<str.length();i++){
//            if(M1.containsKey(str.charAt(i))){
//                M1.put(str.charAt(i), M1.get(str.charAt(i))+1);
//            }
//            else{
//                M1.put(str.charAt(i),1);
//            }
//        }
//        System.out.println(M1);
//
//        Iterator itr=M1.entrySet().iterator();
//
//        while(itr.hasNext()){
//            Map.Entry M2=(Map.Entry)itr.next();
//            if(M2.getValue().equals(2)){
//                System.out.println(M2.getKey());
//            }
//        }
//

//String str="Umar bin Khattab";
////Fixed space and reverse string
//
//  char []chr=str.toCharArray();
//  char []newchr=new char[chr.length];
//
//for (int i=0;i<chr.length;i++){
//    if(chr[i]==' '){
//        newchr[i]=' ';
//    }
//}
//
//int j=chr.length-1;
//for (int i=0;i<chr.length;i++){
//    if(chr[i]!=' '){
//        if(newchr[j]==' '){
//            j--;
//        }
//
//        newchr[j]=chr[i];
//        j--;
//    }
//}
//        System.out.println(newchr);

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
//
//String str="Automatic Machine";
//char ch[]=str.toCharArray();
//
//int start=0;
//int end=ch.length-1;
//
//while(start<end){
//    if(!S1.contains(ch[start])){
//start++;
//    }
//    if(!S1.contains(ch[end])){
//        end--;
//    }
//
//    char temp=ch[start];
//    ch[start]=ch[end];
//    ch[end]=temp;
//    start++;
//    end--;
//}
//        System.out.println(ch);


        //duplicates char

//String S1="abcd abcefg";
//ArrayList<Character> A1=new ArrayList<>();
//
//for (int i=0;i<S1.length();i++){
//    for(int j=i+1;j<S1.length();j++){
//        if(S1.charAt(i)==S1.charAt(j)){
//            A1.add(S1.charAt(i));
//        }
//    }
//}
//        System.out.println(A1);
//



//ArrayList<String> L1=new ArrayList<>();
//L1.add("Khalid");
//L1.add("Ammar");
//L1.add("Umar");
//L1.add("Umair");
//
//int size=L1.size();
//
//for(int i=0;i<size;i++){
//    for(int j=0;j<L1.get(i).length();j++){
//        if(L1.get(i).charAt(j)=='U'){
//            System.out.println(L1.get(i));
//            break;
//        }
//    }
//}
//
//String str="Automation Testing";
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
//for (int i=0;i<str.length();i++){
//    if(S1.contains(str.charAt(i))){
//        Vcount++;
//    }
//    else if(str.charAt(i)>='a' & str.charAt(i)<='z' || str.charAt(i)>='A' & str.charAt(i)<='Z'){
//        Ccount++;
//    }
//}
//
//        System.out.println("Number of Vowels: "+Vcount);
//        System.out.println("Number of Consonents: "+Ccount);
//

//
//String str="Umar bin Khattab";
//String strarr[]=str.split(" ");
//int size=strarr.length;
//String newstr="";
//
//
//for (int i=0;i<size;i++) {
//    for (int j = strarr[i].length() - 1; j >= 0; j--) {
//        newstr=newstr+strarr[i].charAt(j);
//    }
//    newstr=newstr+" ";
//}
//        System.out.println(newstr);

//
//int A[]={2,6,8,11,21};
//int index=0;
//int size=A[A.length-1];
//
//for (int i=0;i<size;i++){
//    if(A[index]==i){
//        index++;
//    }
//    else{
//        System.out.print(i+",");
//    }
//}


//int n=16;
//for (int i=2;i<n;i++){
//    if(n%i==0){
//        break;
//    }
//    else{
//        System.out.println("Number is prime");
//    }
//}
//
//


//        JSONParser parser=new JSONParser();
//        JSONObject Obj= (JSONObject) parser.parse(new FileReader("C:\\Users\\Saddam\\Desktop\\TipsTricks\\Blackbox\\src\\main\\resources\\Expected.json"));
//        System.out.println(Obj.get("per_page"));

//        FileInputStream Fin=new FileInputStream("C:\\Users\\Saddam\\Desktop\\TipsTricks\\Blackbox\\src\\main\\resources\\Dbqueries.properties");
//        Properties prop=new Properties();
//        prop.load(Fin);
//        System.out.println(prop.get("query2"));










    }
}