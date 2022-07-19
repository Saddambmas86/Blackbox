package Practise;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.remote.http.HttpRequest;
import org.skyscreamer.jsonassert.JSONAssert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.*;

public class IHS3 {

    public static void main(String[] args) throws IOException, ParseException, SQLException, ClassNotFoundException, JSONException {
//    1.    String str="Umar bin Khattab";
//        String strnew="";
//
//        for (int i=str.length()-1;i>=0;i--){
//            strnew=strnew+str.charAt(i);
//        }
//        System.out.println(strnew);

//2.

//String str="Khalid Bin Waleed";
//int Vcount=0;
//int Ccount=0;
//
//Set<Character> Vowels=new HashSet<>();
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
//for(int i=0;i<str.length();i++){
//    if(Vowels.contains(str.charAt(i))){
//        Vcount++;
//    }
//    else if(str.charAt(i)>='a' & str.charAt(i)<='z' ||str.charAt(i)>='A' & str.charAt(i)<='Z'){
//Ccount++;
//    }
//}
// System.out.println(Vcount);
//        System.out.println(Ccount);


//3.

String str="Umar Bin Khattab";
char ch[]=str.toCharArray();
char newch[]=new char[ch.length];

for (int i=0;i<ch.length;i++){
    if(ch[i]==' '){
        newch[i]=' ';
    }
}

int j=str.length()-1;
for (int i=0;i<ch.length;i++){
    if(ch[i]!=' ') {
        if (newch[j] == ' ') {
            j--;
        }

        newch[j]=ch[i];
        j--;
    }
}
        System.out.println(newch);



//4.

//        String str="Automation";
//        char ch[]=str.toCharArray();
//
//        Set<Character> Vowels=new HashSet<>();
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
//
//
//        int start=0;
//        int end=str.length()-1;
//
//        while(start<end){
//if(!Vowels.contains(ch[start])){
//    start++;
//}
//if(!Vowels.contains(ch[end])){
//    end--;
//}
//char temp=ch[start];
//ch[start]=ch[end];
//ch[end]=temp;
//start++;
//end--;
//        }
//        System.out.println(ch);

//        ArrayList<String> A1=new ArrayList<>();
//        A1.add("Umar");
//        A1.add("Bin");
//        A1.add("Khattab");
//
//        int size=A1.size();
//
//        for(int i=0;i<size;i++){
//            for(int j=0;j<A1.get(i).length();j++){
//                if(A1.get(i).charAt(j)=='a'){
//                    System.out.println(A1.get(i));
//                    break;
//                }
//
//            }
//        }

//String str="Umar bin khattab";
//        System.out.println(str.replaceAll(" ",""));

//String str="Umar bin Khattab";
//String newstr[]=str.split(" ");
//
//for(int i=0;i<newstr.length;i++){
//    for(int j=newstr[i].length()-1;j>=0;j--){
//        System.out.print(newstr[i].charAt(j));
//    }
//    System.out.print(" ");
//}
//
//        String str="Khalid Bin Waleed";
//        Map<Character, Integer> M1=new LinkedHashMap<>();
//
//        for (int i=0;i<str.length();i++){
//            if(M1.containsKey(str.charAt(i))){
//                M1.put(str.charAt(i),M1.get(str.charAt(i))+1);
//            }
//            else{
//                M1.put(str.charAt(i),1);
//            }
//        }
//
//        Iterator itr=M1.entrySet().iterator();
//        while(itr.hasNext()){
//            Map.Entry M2=(Map.Entry)itr.next();
//            if(M2.getValue().equals(2)){
//                System.out.print(M2.getKey());
//            }
//
//        }



//int arr[]={2,5,7,9};
//int index=0;
//int size=arr[arr.length-1];
//
//for(int i=0;i<size;i++){
//if(arr[index]==i){
//    index++;
//}
//else{
//    System.out.print(i);
//}
//}

//int n=17;
//Boolean flag=true;
//
//for(int i=2;i<n;i++){
//    if(n%i==0){
//        flag=false;
//        break;
//    }
//}
//        System.out.println("Values of flag "+flag);
//if(flag){
//    System.out.println("Number is prime");
//}
//else{
//    System.out.println("Number is not prime");
//}


//        JSONParser parser=new JSONParser();
//        JSONObject obj= (JSONObject) parser.parse(new FileReader("C:\\Users\\Saddam\\Desktop\\TipsTricks\\Blackbox\\src\\resource\\api.json"));
//        System.out.println(obj.get("dueDate"));


//        FileInputStream Fin=new FileInputStream("C:\\Users\\Saddam\\Desktop\\TipsTricks\\Blackbox\\resources\\config.properties");
//        Properties prop=new Properties();
//        prop.load(Fin);
//        System.out.println(prop.get("mailSubject"));

//        FileInputStream Fin=new FileInputStream("C:\\Users\\Saddam\\Desktop\\TipsTricks\\Blackbox\\src\\main\\resources\\Testdata.xlsx");
//        XSSFWorkbook Wb=new XSSFWorkbook(Fin);
//        XSSFSheet sheet=Wb.getSheet("Login");
//        int numofrows=sheet.getPhysicalNumberOfRows();
//
//        for(int i=0;i<numofrows;i++){
//            XSSFCell Username=sheet.getRow(i).getCell(0);
//            Username.setCellType(CellType.STRING);
//
//            XSSFCell Password=sheet.getRow(i).getCell(1);
//            Password.setCellType(CellType.STRING);
//            System.out.println("|"+Username+"|:|"+Password+"|");
//        }
//

//Class.forName("com.mysql.jdbc.Driver");
//        Connection con= DriverManager.getConnection("");
//        Statement st=con.createStatement();
//        ResultSet RS=st.executeQuery("sql");
//        while (RS.next()){
//            RS.getString(1);
//        }

//        RequestSpecification requestSpecification =
//                RestAssured
//                        .given()
//                        .baseUri("https://restful-booker.herokuapp.com")
//                        .basePath("/booking");
//
//        String ExpectedRespJson=new String(Files.readAllBytes(Paths.get("C:\\Users\\Saddam\\Desktop\\TipsTricks\\Blackbox\\src\\main\\resources\\Expected.json")));
//       Response response= requestSpecification.given()
//               .header("content-type","application-html")
//                .when()
//                .get()
//                .then()
//                .extract().response();
//
//        System.out.println(response.asString());
//
//int size=response.getBody().path("data.size()");
//
//        JSONAssert.assertEquals(ExpectedRespJson, (JSONArray) response,true);













    }}
