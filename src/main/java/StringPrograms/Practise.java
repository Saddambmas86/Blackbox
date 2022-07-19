package StringPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Practise {


    public static void main(String[] args) {

//        String Str="Welcome to Dubai";
//
//        char[] initial=Str.toCharArray();
//        char[] finalR=new char[Str.length()];
//
//
//        //Save the space:
//        for (int i=0;i<initial.length;i++){
//            if(initial[i]==' '){
//                finalR[i]=' ';
//            }
//        }
//
//        int j=initial.length-1;
//
//        for (int i=0;i<initial.length;i++){
//            if(initial[i]!=' '){
//                if(finalR[j]==' '){
//                    j--;
//                }
//                finalR[j]=initial[i];
//                j--;
//            }
//
//        }
//        System.out.println(finalR);

    	

    	
String str="Automation";

Set<Character> vowels=new HashSet();
vowels.add('a');
vowels.add('e');
vowels.add('i');
vowels.add('o');
vowels.add('u');
vowels.add('A');
vowels.add('E');
vowels.add('I');
vowels.add('O');
vowels.add('U');

Map<Character, Integer> map1=new HashMap();

for(int i=0;i<str.length();i++) {
	if(map1.containsKey(str.charAt(i))) {
		map1.put(str.charAt(i), map1.get(str.charAt(i))+1);
	}
	else {
		map1.put(str.charAt(i), 1);
	}
}


System.out.println(map1);
   	
    	
Set S1=map1.entrySet();
Iterator itr=S1.iterator();

while(itr.hasNext()) {
Map.Entry map2=(Map.Entry)itr.next();
if(map2.getValue().equals(2)) {
	System.out.println(map2.getKey());
}

}






    }
}
