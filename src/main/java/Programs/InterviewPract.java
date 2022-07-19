package Programs;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.*;

public class InterviewPract {

    public static void main(String[] args) throws IOException, ParseException {

//        String str="dabad";
//        String str2="";
//
//
//        for(int i=str.length()-1;i>=0;i--){
//            str2=str2+str.charAt(i);
//        }
//
//
//        if(str.equals(str2)){
//            System.out.println(str2);
//            System.out.println("String is palindrome");
//        }
//        else{
//            System.out.println(str2);
//            System.out.println("not palindrome");
//        }

//************************************************************ ***************
//
//int n=121;
//int Match=n;
//int rem=1;
//int n2=0;
//while(n!=0){
//    rem=n%10;
//    n2=rem+n2*10;
//    n=n/10;
//   // n2=n2+n;
//}
//        System.out.println(n2);
//
//if (n2==Match){
//    System.out.println("yes");
//}

//********************************************************************* *******************
//
//   String str="Testor";
//   char []T1=str.toCharArray();
//   //Auoaiooa
//
//        Set<Character> Vowels=new HashSet<Character>();
//        Vowels.add('A');
//        Vowels.add('E');
//        Vowels.add('I');
//        Vowels.add('O');
//        Vowels.add('U');
//        Vowels.add('a');
//        Vowels.add('e');
//        Vowels.add('i');
//        Vowels.add('o');
//        Vowels.add('u');
//
//
//int Start=0;
//int End=str.length()-1;
//
//
//while(Start<End){
//    if(!Vowels.contains(str.charAt(Start))) {
//        Start++;
//        continue;
//    }
//
//    if(!Vowels.contains(str.charAt(End))){
//        End--;
//        continue;
//    }
//
//char temp=T1[Start];
//T1[Start]=T1[End];
//T1[End]=temp;
//
//Start++;
//End--;
//}System.out.println(T1);
//

//String str="Saddam bin Sami";
//char [] chr=str.toCharArray();
//char [] chrnew=new char[str.length()];
//String str1="";
//
//for (int i=0;i<str.length()-1;i++){
//    if(chr[i]==' '){
//        chrnew[i]=' ';
//    }
//}
//
//int j=str.length()-1;
//for (int i=0;i<str.length();i++){
//    if(chr[i]!=' ') {
//        if (chrnew[j] == ' ') {
//            j--;
//        }
//
//
//    chrnew[j]=chr[i];
//    j--;
//}}System.out.println(chrnew);


//String str="Programming";
//char [] chr=str.toCharArray();
//
//Map<Character, Integer> map1=new HashMap<>();
//
//for(int i=0;i<str.length()-1;i++){
//    if(map1.containsKey(chr[i])){
//        map1.put(chr[i],map1.get(chr[i])+1);
//    }
//    else{
//        map1.put(chr[i],1);
//    }
//}
//
//        System.out.println(map1);
//
//Set S1=map1.entrySet();
//Iterator itr=S1.iterator();
//
//while(itr.hasNext()){
//    Map.Entry map2=(Map.Entry)itr.next();
//    if(map2.getValue().equals(2)){
//        System.out.println(map2.getKey());
//    }
//        //System.out.println(map2.getKey());
//
//


//}





//
//
//
//
//List<String> list=new ArrayList<>();
//list.add("Blue");
//list.add("Green");
//list.add("Red");
//list.add("Black");
//list.add("White");
//list.add("Yellow");
//
//int length= list.size();
//boolean flag=false;
//
//
//for (int i=0;i<length;i++){
//    for(int j=0;j<list.get(i).length();j++){
//
//if(list.get(i).charAt(j)=='e'){
//    System.out.println(list.get(i));
//    break;
//}
//
//    }
//
//
//
//
//
//
//}

//File file=new File("C:/Users/Saddam/Desktop/TipsTricks/Blackbox/resources/config.properties");
//        FileInputStream fin=new FileInputStream(file);
//        Properties prop=new Properties();
//        prop.load(fin);
//        System.out.println(prop.getProperty("appName"));

        FileReader file=new FileReader("C:/Users/Saddam/Desktop/TipsTricks/Blackbox/src/resource/api.json");

        JSONParser parser=new JSONParser();
        JSONObject jsonobject= (JSONObject) parser.parse(file);
        System.out.println(jsonobject);
        String Str= (String) jsonobject.get("title");
        System.out.println(Str);




}}

