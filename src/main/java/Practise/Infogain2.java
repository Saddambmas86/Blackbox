package Practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Infogain2 {

    public static WebDriver driver;

    public static void main(String[] args) throws IOException {

//Swap 2 numbers:
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter inputs");
//        int A=scan.nextInt();
//        int B=scan.nextInt();
//
//        System.out.println("Before Swapping: A="+A+" B="+B);
//
//        A=A+B;
//        B=A-B;
//        A=A-B;
//
//        System.out.println("After Swapping: A="+A+" B="+B);


//Count words with hashmap:
//        Scanner scan=new Scanner(System.in);
//        String str=scan.nextLine();
//        String strArr[]=str.split(" ");
//
//        Map<String, Integer> M1=new HashMap<>();
//
//        for(int i=0;i< strArr.length;i++){
//           if(M1.containsKey(strArr[i])){
//               M1.put(strArr[i],M1.get(strArr[i])+1);
//           }
//           else{
//               M1.put(strArr[i],1);
//           }
//        }
//        System.out.println(M1);


//Iterator

//        Map<Integer,String> M2=new HashMap<>();
//        M2.put(1,"A");
//        M2.put(2,"B");
//        M2.put(3,"C");
//        M2.put(4,"D");
//        M2.put(5,"E");
//
//        Iterator itr=  M2.entrySet().iterator();
//
//        while(itr.hasNext()){
//            Map.Entry M3=(Map.Entry)itr.next();
//            System.out.println("Key : "+M3.getKey()+" Values: "+M3.getValue());
//        }
//
//        for (Map.Entry m4:M2.entrySet()) {
//            System.out.println("Key : "+m4.getKey()+" Values: "+m4.getValue());
//        }

//Palindrome:

//Scanner scan=new Scanner(System.in);
//        System.out.println("Enter string");
//String str=scan.nextLine();
//String rev="";
//
//for (int i=str.length()-1;i>=0;i--){
//    rev=rev+str.charAt(i);
//}
//
//if(str.equalsIgnoreCase(rev)){
//    System.out.println(rev+" String is palindrome");
//}
//else{
//    System.out.println(rev+" String is not palindrome");
//}
//
//Fibonacci Series
//int n=10;
//int a=0,b=0,c=1;


//for (int i=0;i<n;i++){
//    a=b;
//    b=c;
//    c=a+b;
//    System.out.print(a+ ",");
//}

//
//Set <String>S1=new HashSet<>();
//S1.add("Roza");
//S1.add("Namaaz");
//S1.add("Haj");
//S1.add("Zakaat");
//S1.add("Kalma");
//
//Iterator itr=S1.iterator();
//
//while(itr.hasNext()){
//    System.out.println(itr.next());
//}
//
//        for (Object obj:S1) {
//            System.out.println(obj);
//        }
//
//
//


//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.get("https://www.softwaretestinghelp.com/java-coding-interview-programs/");
//        WebElement element=driver.findElement(By.xpath("//input[@title=\"Search\"]"));
//        element.sendKeys("SoftwareTestingHelp");
//        element.sendKeys(Keys.ENTER);

//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,7000)");


//List Allelements=driver.findElements(By.tagName("a"));
//
//for (int i=0;i<Allelements.size();i++){
//    WebElement element= (WebElement) Allelements.get(i);
//    String url= element.getAttribute("href");
//
//    if(isUrlValid(url)) {
//        URL url1=new URL(url);
//        HttpURLConnection httpURLConnection = (HttpURLConnection) url1.openConnection();
//        httpURLConnection.setConnectTimeout(5000);
//        httpURLConnection.connect();
//
//        if (httpURLConnection.getResponseCode() == 200) {
//            System.out.println(url1 + " : " + httpURLConnection.getResponseMessage());
//        }
//    }
//
//    }




//    public static boolean isUrlValid(String url) {
//        try {
//            URL obj = new URL(url);
//            obj.toURI();
//            return true;
//        } catch (MalformedURLException e) {
//            return false;
//        } catch (URISyntaxException e) {
//            return false;
//        }
//    }

    int Arr[] = {100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89};

    for(int i=0;i<Arr.length-1;i++){
for(int j=i+1;j<Arr.length;j++){

    if(Arr[i]>Arr[j]){
        int temp=Arr[i];
        Arr[i]=Arr[j];
        Arr[j]=temp;
    }}}

for (int i=0;i<Arr.length;i++) {
    System.out.println(Arr[i]);
}
        System.out.println(Arr[Arr.length-2]);

}
}
