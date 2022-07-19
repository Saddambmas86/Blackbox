package Interview_code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateChar {

public static void main(String[] args) {

String str="Umar Bin Khattab";
Map<Character,Integer>M1=new HashMap<>();
for (int i=0;i<str.length();i++){
    if(M1.containsKey(str.charAt(i))){
        M1.put(str.charAt(i),M1.get(str.charAt(i))+1);
    }
    else{
        M1.put(str.charAt(i),1);
    }
}
    System.out.println(M1);


Iterator itr=M1.entrySet().iterator();

while(itr.hasNext()){
Map.Entry M2=(Map.Entry)itr.next();
if(M2.getValue().equals(2)){
    System.out.println(M2.getKey());
}
}


}}
