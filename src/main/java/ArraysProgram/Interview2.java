package ArraysProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Interview2 {

    public static void main(String[] args) {


        String str="Programm";
        Map<Character, Integer> map1=new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(map1.containsKey(str.charAt(i))){
                map1.put(str.charAt(i), map1.get(str.charAt(i))+1);
            }
            else{
                map1.put(str.charAt(i), 1);
            }
        }

        System.out.println(map1);
        Set S1=map1.entrySet();
        Iterator itr=S1.iterator();

        while(itr.hasNext()){
        Map.Entry map2=(Map.Entry)itr.next();
        if(map2.getValue().equals(1)){
            System.out.println(map2.getKey());
        }}}}
