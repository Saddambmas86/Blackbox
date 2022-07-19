package Practise;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Jiosupport {

    @Test
    void reverseStr() {
        String str = "Saddam bhai";
        String newstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newstr = newstr + str.charAt(i);
        }
        System.out.println(newstr);
    }

    @Test
    void vowelsconsocount() {
        String str1 = "Automation is best";

        int Vcount = 0;
        int Ccount = 0;

        Set<Character> S1 = new HashSet<>();
        S1.add('a');
        S1.add('e');
        S1.add('i');
        S1.add('o');
        S1.add('u');
        S1.add('A');
        S1.add('E');
        S1.add('I');
        S1.add('O');
        S1.add('U');

        for (int i = 0; i <= str1.length() - 1; i++) {
            if (S1.contains(str1.charAt(i))) {
                Vcount = Vcount + 1;
            } else if (str1.charAt(i) > 'a' && str1.charAt(i) < 'z') {
                Ccount = Ccount + 1;
            }
        }
        System.out.println("Number of vowels: " + Vcount);
        System.out.println("Number of Consonents: " + Ccount);
    }

    @Test
    void reversewithfixedspace() {
        String S3 = "I love Islam";
        char[] chr = S3.toCharArray();
        char[] newchr = new char[S3.length()];

//Fixed the space for new array
        for (int i = 0; i < chr.length; i++) {
            if (chr[i] == ' ') {
                newchr[i] = ' ';
            }
        }

//reverse the content
        int j = S3.length() - 1;
        for (int i = 0; i < chr.length; i++) {
            if (chr[i] != ' ') {
                if (newchr[j] == ' ') {
                    j--;
                }
                newchr[j] = chr[i];
                j--;
            }
        }
        System.out.println(newchr);
    }


    @Test
    void reversevowelsonly() {
        String str11 = "I love my family";
        char chnew[] = str11.toCharArray();
        Set<Character> Vowels = new HashSet<>();
        Vowels.add('a');
        Vowels.add('e');
        Vowels.add('i');
        Vowels.add('o');
        Vowels.add('u');
        Vowels.add('A');
        Vowels.add('E');
        Vowels.add('I');
        Vowels.add('O');
        Vowels.add('U');

        int start = 0;
        int end = str11.length() - 1;

        while (start < end) {
            if (!Vowels.contains(str11.charAt(start))) {
                start++;
            }
            if (!Vowels.contains(str11.charAt(end))) {
                end--;
            }

            char temp = chnew[start];
            chnew[start] = chnew[end];
            chnew[end] = temp;
            start++;
            end--;
        }
        System.out.println(chnew);
    }

    @Test
    void Arraychar() {
        ArrayList<String> A1 = new ArrayList<>();
        A1.add("blue");
        A1.add("Black");
        A1.add("Mango");
        A1.add("pink");

        int size = A1.size();

        for (int i = 0; i < size; i++) {

            for (int j = 0; j <= A1.get(i).length() - 1; j++) {
                if (A1.get(i).charAt(j) == 'o') {
                    System.out.println(A1.get(i));
                }
            }
        }
    }


    @Test
    void removespace() {
        String S12 = "I Love Islam";
        System.out.println(S12.replaceAll(" ", ""));
    }


    @Test
    void duplicatevalues() {

        String S14="Self Respect";
        Map<Character, Integer> map1=new HashMap<>();

        for(int i=0;i<S14.length();i++){
            if(map1.containsKey(S14.charAt(i))){
                map1.put(S14.charAt(i), map1.get(S14.charAt(i))+1);
            }
            else{
                map1.put(S14.charAt(i),1);
            }
        }
        System.out.println(map1);

        Set S1=map1.entrySet();
        Iterator itr=S1.iterator();

        while(itr.hasNext()){
            Map.Entry m1=(Map.Entry)itr.next();
            if(m1.getValue().equals(3)){
                System.out.println(m1.getKey());}}}

  @Test
  void missingnumberArray(){

  int A[]={1,5,11,15,20};
  int index=0;
  int len=A[A.length-1];
      System.out.println(len);

      for (int i=0;i<len;i++){
          if(A[index]==i){
              index++;
          }
          else{
              System.out.print(i+" ,");
          }
      }}

@Test
    void checkprime(){
        int n=5;
        boolean flag=true;
        for(int i=2; i<n;i++){
            if(n%i==0){
                flag=false;
                break;
            }
            else{
                flag=true;
            }
        }

        if(flag==true){
            System.out.println("number is prime");
        }
        else{
            System.out.println("not prime");
        }}


 void readjsonfile() throws IOException, ParseException {
     JSONParser parse=new JSONParser();
     JSONObject obj= (JSONObject) parse.parse(new FileReader("C:\\Users\\Saddam\\Desktop\\TipsTricks\\Blackbox\\src\\main\\resources\\test.json"));
     System.out.println(obj.get("firstname"));
 }




}