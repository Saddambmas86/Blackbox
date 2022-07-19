package ArraysProgram;

import java.util.*;

public class Threejan {

    public static void main(String[] args) {

//        ArrayList<String> list=new ArrayList<>();
//
//        list.add("Umar");
//        list.add("AbuBakr");
//        list.add("Khalid");
//        list.add("AffanB");
//
//        int size1=list.size();
//        System.out.println(size1);
//        boolean flag=false;
//
//        for (int i=0;i<size1;i++){
//            for(int j=0;j<list.get(i).length();j++){
//if (list.get(i).charAt(j)=='B'){
//    flag=true;
//    break;
//}
//else{
//    flag=false;
//}
//            }
// if (flag==true){
//     System.out.println(list.get(i));
// }
//
//        }
//
//To print only single time char appears
String A="Testautomation";

Map<Character, Integer>map=new HashMap<>();




for (int i=0;i<A.length()-1;i++){
    if(map.containsKey(A.charAt(i))){
        map.put(A.charAt(i),map.get(A.charAt(i))+1);
    }
    else{
        map.put(A.charAt(i),1);
    }
}
       // System.out.println(map.get('a'));
        System.out.println(map);

        Set set=map.entrySet();
        Iterator itr=set.iterator();

        while(itr.hasNext()){
            Map.Entry map2=(Map.Entry)itr.next();
            if(map2.getValue().equals(2)){
                System.out.println(map2.getKey());
            }
        }


























    }


}
