package Practise;

import java.util.*;

public class Docquity {

    public static void main(String[] args) {

//        Map<String,String> src=new HashMap<>();
//        src.put("Bombay","Goa");
//        src.put("Etawah","Agra");
//        src.put("Delhi","Jaipur");
//        src.put("Jaipur","Bombay");
//        src.put("Kanpur","Etawah");
//        src.put("Agra","Delhi");
//
//        Map<String,String> Revsrc=new HashMap<>();
//
//        //Make Reverse Map
//        for (Map.Entry<String, String> M1: src.entrySet()){
//            Revsrc.put(M1.getValue(),M1.getKey());
//        }
//
//        //Match the values:
//        for (Map.Entry<String, String> M1: src.entrySet()){
//            if(!Revsrc.containsKey(M1.getKey())){
//                System.out.println(M1.getKey());
//            }
//            if(!Revsrc.containsValue(M1.getValue())){
//                System.out.println(M1.getValue());
//            }
//
//        }


//String str="audi A1,audi A2,audi A3,BMW B1,BMW B2";
//String newstr[]=str.split(",");
//List<String> L1=new ArrayList<>();
//
//for (int i=0;i< newstr.length;i++){
//    L1.add(newstr[i]);
//}
//System.out.println(L1);
//
//Map<String,List<String>> map=new HashMap<>();
//for(int i=0;i<L1.size();i++){
//    String newstr1[]=L1.get(i).split(" ");
//    String carcompany=newstr1[0];
//    String carmodel=newstr1[1];
//    List<String> L2=map.get(carcompany);
//    if(L2==null){
//        L2=new ArrayList<>();
//        map.put(carcompany,L2);
//    }
//    L2.add(carmodel);
//}
//System.out.println(map);



List<String> L2=new ArrayList<>();
        L2.add("Muhammad SAW");
        L2.add("Ayub as");
        L2.add("Adam as");
        L2.add("Isha as");
        L2.add("Hud as");
        Collections.sort(L2,new sortByProphets());
        System.out.println(L2);
    }}








class sortByProphets implements Comparator<String>{

    Map<String,Integer> M1=new HashMap<>();
    sortByProphets(){
        M1.put("Adam as",1);
        M1.put("Edrees as",2);
        M1.put("Nuh as",3);
        M1.put("Hud as",4);
        M1.put("Lut as",5);
        M1.put("Saleh as",6);
        M1.put("Younis as",7);
        M1.put("Hizkeel as",8);
        M1.put("Uzair as",9);
        M1.put("Ibrahim as",10);
        M1.put("Ismail as",11);
        M1.put("Yaakub as",12);
        M1.put("Yahya as",13);
        M1.put("Yousuf as",14);
        M1.put("Musa as",15);
        M1.put("Ayub as",16);
        M1.put("Daud as",17);
        M1.put("Suleman as",18);
        M1.put("Isha as",19);
        M1.put("Muhammad SAW",20);
    }

    @Override
    public int compare(String o1, String o2) {
        return M1.get(o1).compareTo(M1.get(o2));
    }
}





