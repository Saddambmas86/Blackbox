package QA.Blackbox;


import com.fasterxml.jackson.core.JsonParser;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.*;
import java.nio.file.Paths;
import java.sql.*;
import java.util.*;

public class Rategain {

    public static void main(String[] args) throws SQLException, IOException, ParseException {

//        Map<Integer,String>map=new HashMap<>();
//        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//        ChromeOptions option=new ChromeOptions();
//        option.addArguments("start-maximized");
//        WebDriver driver=new ChromeDriver(option);
//        driver.get("https://demoqa.com/browser-windows");
//        driver.findElement(By.id("windowButton")).click();
//        Set<String> Windows=driver.getWindowHandles();
//        Iterator itr=Windows.iterator();
//        String W1= (String) itr.next();
//        System.out.println(W1);
//        map.put(1,W1);
//        String W2= (String) itr.next();
//        System.out.println(W2);
//        map.put(2,W2);
//        System.out.println(map);

        FileInputStream fin=new FileInputStream("C:/Users/Saddam/Desktop/TipsTricks/Blackbox/src/resource/api.json");
        RestAssured.baseURI="https://fakerestapi.azurewebsites.net/api/v1/Activities";
        Response response=
                RestAssured
                        .given()
                        .header("Content-Type","application/json")
                        .body(fin)
                        .when()
                        .post()
                        .then()
                        .extract()
                        .response();

        System.out.println(response.asString());
        System.out.println(response.getHeader("Server"));

//
//String title=response.path("title");
//List<String> list=response.jsonPath().get("title");
//        System.out.println(list);
//

//      FileInputStream fin=new FileInputStream("C:/Users/Saddam/Desktop/TipsTricks/Blackbox/src/main/resources/Dbqueries.properties");
//      Properties prop=new Properties();
//      prop.load(fin);
//        System.out.println(prop.getProperty("query1"));
//        System.out.println(prop.getProperty("query2"));


        // FileInputStream fin=new FileInputStream("C:/Users/Saddam/Desktop/TipsTricks/Blackbox/src/main/resources/test.json");
//        JSONParser parser=new JSONParser();
//        JSONObject obj= (JSONObject) parser.parse(new FileReader("C:/Users/Saddam/Desktop/TipsTricks/Blackbox/src/main/resources/test.json"));
//        System.out.println(obj.get("Contact"));

//FileInputStream fin=new FileInputStream("C:/Users/Saddam/Desktop/TipsTricks/Blackbox/src/main/resources/Testdata.xlsx");
//        XSSFWorkbook wb=new XSSFWorkbook(fin);
//        XSSFSheet sheet=wb.getSheet("Login");
//        int numofrows= sheet.getPhysicalNumberOfRows();
//
//        String col=sheet.getRow(0).getCell(0).toString();
//        Object [][]obj=new Object[numofrows][2];
//
//        for (int i=0;i<numofrows;i++){
//        XSSFRow row=sheet.getRow(i);
//        XSSFCell username=row.getCell(0);
//        XSSFCell password=row.getCell(1);
//
//        if(username.getCellType()==username.getNumericCellValue()){
//obj[i][0]=username.getNumericCellValue();
//        }
//        else{
//            obj[i][0]=username.getStringCellValue();
//        }
//        }


//String str="Khalid bin Walid";
//char []A=str.toCharArray();
//String rev="";
//for (int i=A.length-1;i>=0;i--){
//    rev=rev+A[i];
//}
//System.out.println(rev);

      //  String str = "Khalid bin Walid Umar bin khattab";
//String newstr[]=str.split(" ");
//String res="";
//
//for(int i= newstr.length-1;i>=0;i--){
//    res=res+newstr[i]+" ";
//}
//System.out.println(res);


//        //  String str = "Khalid bin Walid Umar bin khattab";
//        Set Vowels = new HashSet();
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
//int Vcount=0;
//        Map<Character, Integer> map = new HashMap<>();
//        System.out.println("Strat");
//        for (int i = 0; i < str.length(); i++) {
//            if (Vowels.contains(str.charAt(i))) {
//                System.out.println(str.charAt(i));
//                Vcount=Vcount+1;
//            }
//        }
//        System.out.println(Vcount);

//        String str="Automation";
//        Map<Character,Integer> map=new HashMap<>();
//
//        for (int i=0;i<str.length();i++){
//            if(map.containsKey(str.charAt(i))){
//                map.put(str.charAt(i),map.get(str.charAt(i))+1);
//            }
//            else{
//                map.put(str.charAt(i),1);
//            }
//        }
//        System.out.println(map);
//
//        Set S1=map.entrySet();
//        Iterator itr=S1.iterator();
//
//        while(itr.hasNext()){
//            Map.Entry map2=(Map.Entry)itr.next();
//            if(map2.getValue().equals(2)){
//                System.out.println(map2.getKey());
//            }
//        }


//String str="Khalidaeiou";
//aiaeiou
//uoieaia
//char []newstr=str.toCharArray();
//
//        Set Vowels = new HashSet();
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
//int start=0;
//int Last=newstr.length-1;
//
//while(start<Last){
//    if(!Vowels.contains(newstr[start])){
//        start++;
//        continue;
//    }
//    if(!Vowels.contains(newstr[Last])){
//        Last--;
//        continue;
//    }
//
//    char temp=newstr[start];
//    newstr[start]=newstr[Last];
//    newstr[Last]=temp;
//    start++;
//    Last--;
//}
//System.out.println(newstr);
//
//

//String str="Umar bin Khattab";
//char [] ch=str.toCharArray();
//char []chfinal=new char[ch.length];
//
////fixed the space:
//for(int i=0;i<ch.length-1;i++){
//    if(ch[i]==' '){
//        chfinal[i]=' ';
//    }}
//
//int j=ch.length-1;
//
//for(int i=0;i<ch.length;i++){
//    if(ch[i]!=' '){
//        if(chfinal[j]==' '){
//            j--;
//        }
//        chfinal[j]=ch[i];
//        j--;
//    }
//}
//        System.out.println(chfinal);
//


//int n=14;
//boolean flag=true;
//
//for (int i=2;i<n;i++){
//    if(n%i==0){
//        flag=false;
//        break;
//    }
//}
//
//if (flag){
//    System.out.println("Number is prime");
//}
//else{
//    System.out.println("Number is not prime");
//}
//




    }
}