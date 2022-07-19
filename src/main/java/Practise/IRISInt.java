package Practise;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class IRISInt {

public static void main(String...s) throws IOException, ParseException {

//-------------1.	Program for reverse String-------------------------

//String str="I Love Islam";
//String revstr="";
//for (int i=str.length()-1;i>=0;i--){
//    revstr=revstr+str.charAt(i);
//}
//    System.out.println(revstr);

////--------------2.	Program for Vowels and consonant count------------
//String str="I love automation";
//    Set<Character> S1=new HashSet<>();
//    S1.add('a');
//    S1.add('e');
//    S1.add('i');
//    S1.add('o');
//    S1.add('u');
//    S1.add('A');
//    S1.add('E');
//    S1.add('I');
//    S1.add('O');
//    S1.add('U');
//
//int Vcount=0;
//int Ccount=0;
//
//for (int i=0;i<str.length();i++){
//    if(S1.contains(str.charAt(i))){
//        System.out.println(str.charAt(i));
//        Vcount=Vcount+1;
//    }
//    else if(str.charAt(i)>='a' & str.charAt(i)<='z'){
//        System.out.println("Consonents: "+str.charAt(i));
//        Ccount=Ccount+1;
//    }
//}
//
//    System.out.println(Vcount);
//    System.out.println(Ccount);


//-----------3. Program reverse String but fixed the space------------------
//String str="Umar Bin Khattab";
//char ch[]=str.toCharArray();
//char newch[]=new char[str.length()];
//
//
////set the space
//for(int i=0;i<ch.length;i++){
//    if(ch[i]==' '){
//        newch[i]=' ';
//    }
//}
//
//int j=str.length()-1;
////reverse string
//for(int i=0;i<str.length();i++){
//    if(ch[i]!=' '){
//        if(newch[j]==' '){
//            j--;
//        }
//        newch[j]=ch[i];
//        j--;
//    }
//}
//    System.out.println(newch);


//------------------4.	Program for reverse the Vowels and remain all the things as it is----------------
//String str="Automation";
//char chnew[]=str.toCharArray();
//Set<Character> Vowels=new HashSet<>();
//    Vowels.add('a');
//    Vowels.add('e');
//    Vowels.add('i');
//    Vowels.add('o');
//    Vowels.add('u');
//    Vowels.add('A');
//    Vowels.add('E');
//    Vowels.add('I');
//    Vowels.add('O');
//    Vowels.add('U');
//
//int start=0;
//int end=str.length()-1;
//
//while(start<end){
//    if(!Vowels.contains(str.charAt(start))){
//        start++;
//    }
//    if(!Vowels.contains(str.charAt(end))){
//        end--;
//    }
//
//    char temp=chnew[start];
//    chnew[start]=chnew[end];
//    chnew[end]=temp;
//    start++;
//    end--;
//}
//    System.out.println(chnew);

//----------------5.	Program to print the word having ‘e’ in the Arraylist----------


//    ArrayList<String> A1=new ArrayList<>();
//    A1.add("Blue");
//    A1.add("Black");
//    A1.add("Yellow");
//    A1.add("White");
//    A1.add("Purple");
//
//    int size=A1.size();
//    Boolean flag=false;
//
//    for (int i=0;i<size;i++){
//        for (int j=0;j<A1.get(i).length();j++){
//            if (A1.get(i).charAt(j)=='l'){
//                System.out.println(A1.get(i));
//                break;
//            }
//        }
//    }

//-----------6.	Program to remove space------------------------------------
//String str="Automation is best";
//String newstr=str.replaceAll(" ","");
//    System.out.println(newstr);

//---------7.	Program to reverse the word of sentence--------------------
//
//String str="Shahrukh banglow is too expensive";
//String newstr[]=str.split(" ");
//String finalstr="";
//int size= newstr.length;
//
//for (int i=0;i<size;i++){
//    for (int j=newstr[i].length()-1;j>=0;j--){
//        finalstr=finalstr+newstr[i].charAt(j);
//    }
//    finalstr=finalstr+" ";
//}
//    System.out.println(finalstr);
//

//-----------------8.	Program to print the duplicate characters---------------------------
//
//String str="Khalid bin waleed";
//Map<Character,Integer> M1=new HashMap<>();
//
//for (int i=0;i<str.length();i++){
//if(M1.containsKey(str.charAt(i))){
//    M1.put(str.charAt(i),M1.get(str.charAt(i))+1);
//}
//else{
//    M1.put(str.charAt(i),1);
//}
//}
//
//Set S2=M1.entrySet();
//Iterator itr=S2.iterator();
//
//while(itr.hasNext()){
//    Map.Entry E1=(Map.Entry)itr.next();
//    if(E1.getValue().equals(2)){
//        System.out.println(E1.getKey());
//    }
//}
//
////--------------------------9.	Program to array missing number-------------------------------------
//int A[]={1,4,6,9,11,14};
//int index=0;
//int len=A[A.length-1];
//
//for (int i=0;i<len;i++){
//    if(i==A[index]){
//        index++;
//    }
//    else{
//        System.out.println(i);
//    }
//}
//

//    int n=6;
//Boolean flag=true;
//    for (int i=2;i<n;i++){
//        if(n%i==0){
//            flag=false;
//            break;
//        }
//        else{
//            flag=true;
//        }
//    }
//    if(flag){
//        System.out.println("NUmber is prime");
//    }
//    else{
//        System.out.println("Number is not prime");
//    }


//----------Read JSON file--------------------------------------

//    JSONParser parse=new JSONParser();
//    JSONObject Obj= (JSONObject) parse.parse(new FileReader("C:\\Users\\Saddam\\Desktop\\TipsTricks\\Blackbox\\src\\main\\resources\\test.json"));
//    System.out.println(Obj.get("firstname"));

//--------Read Prop file---------------------------------------
//    FileInputStream fin=new FileInputStream("C:\\Users\\Saddam\\Desktop\\TipsTricks\\Blackbox\\src\\main\\resources\\Dbqueries.properties");
//    Properties prop=new Properties();
//    prop.load(fin);
//    System.out.println(prop.get("query2"));

//--------Read Excel File--------------------------------------
//    FileInputStream Fin=new FileInputStream("C:\\Users\\Saddam\\Desktop\\TipsTricks\\Blackbox\\src\\main\\resources\\Testdata.xlsx");
//    XSSFWorkbook Wb=new XSSFWorkbook(Fin);
//    XSSFSheet Sheet=Wb.getSheet("Login");
//    int NumofRow=Sheet.getPhysicalNumberOfRows();
//
//    String Cell1=Sheet.getRow(0).getCell(0).getStringCellValue();
//    System.out.println(Cell1);

String str="Humanity";

String revn="";
for (int i=str.length()-1;i>=0;i--){
    revn=revn+str.charAt(i);
}
    System.out.println(revn);
}

}
