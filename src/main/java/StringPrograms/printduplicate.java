package StringPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class printduplicate {

    public static void main(String[] args) {

String str="toprealteam";
Map<Character, Integer> map1=new HashMap<>();

for (int i=0;i<str.length();i++){
    if(map1.containsKey(str.charAt(i))){
        map1.put(str.charAt(i), map1.get(str.charAt(i))+1);
    }
    else{
        map1.put(str.charAt(i),1);
    }}

        System.out.println(map1);

Set S1=map1.entrySet();
Iterator itr=S1.iterator();


while(itr.hasNext()){
    Map.Entry M1=(Map.Entry)itr.next();
   if(M1.getValue().equals(2)){
       System.out.println(M1.getKey());
   }
}





    }


}
