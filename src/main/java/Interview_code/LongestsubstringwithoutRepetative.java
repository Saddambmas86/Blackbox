package Interview_code;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LongestsubstringwithoutRepetative {

public static void main(String[] args) {

//    String str="aaabbbcef";
//    Map<Character,Integer> M1=new HashMap<>();
//
//    for (int i=0;i<str.length();i++){
//        if(!M1.containsKey(str.charAt(i))){
//            M1.put(str.charAt(i),i);
//        }
//        else{
//            i=M1.get(str.charAt(i));
//            System.out.println(str.charAt(i)+"===="+i);
//            M1.clear();
//        }
//        System.out.println(M1.size());
//        System.out.println(M1.keySet().toString());
//    }


String str="aabec";
Map<Character,Integer>M1=new TreeMap<>();

for (int i=0;i<str.length();i++){
    if(!M1.containsKey(str.charAt(i))){
        M1.put(str.charAt(i),i);
    }
    else{
        i=M1.get(str.charAt(i));
        M1.clear();
    }
}
    System.out.println(M1.size());
    System.out.println(M1.keySet().toString());






}



}
