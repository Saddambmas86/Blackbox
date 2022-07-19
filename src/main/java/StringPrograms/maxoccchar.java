package StringPrograms;

import java.util.*;

public class maxoccchar {
    public static void main(String[] args) {


String str="testert";
Map<Character,Integer> map2=new HashMap();

for (int i=0;i<str.length();i++){
    if(map2.containsKey(str.charAt(i))){
        map2.put(str.charAt(i), map2.get(str.charAt(i))+1);
    }
    else{
        map2.put(str.charAt(i),1);
    }


}
        int highesht =Collections.max(map2.values());

        System.out.println(map2);

        Set S1=map2.entrySet();
        Iterator itr=S1.iterator();

        while(itr.hasNext()){
            Map.Entry M1=(Map.Entry)itr.next();
            if((M1.getValue()).equals(highesht)){
                System.out.println(M1.getKey());
            }
        }


    }


}
