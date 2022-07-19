package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IHS2 {

    public static void main(String[] args) {
//        String student = "Aashish:1, Bina:2, Chintu:3";
//
//        Map<String, String> hashMap = new HashMap<String, String>();
//
//        // split the String by a comma
//        String parts[] = student.split(",");
//
//        // iterate the parts and add them to a HashMap
//        for (int i=0;i<parts.length;i++) {
//            String stuData[] = parts[i].split(":");
//            String stuRollNo = stuData[0].trim();
//            String stuName = stuData[1].trim();
//
//            hashMap.put(stuRollNo, stuName);
//        }
//
//        // Print hashMap
//        System.out.println("String to HashMap: " + hashMap);
//
//
//
//
        String str="Calipha AbuBakr,Calipha Umar,Calipha Usman,Warrior Khalid,Warrior Hamzah";
        String newstr[]=str.split(",");
        List<String> Sahabaas=new ArrayList<>();
        Map<String,List<String>> M1=new HashMap<>();

        //To add in list:
        for (int i=0;i<newstr.length;i++){
            Sahabaas.add(newstr[i]);
        }

        for (int i=0;i<Sahabaas.size();i++){
            String A[]=Sahabaas.get(i).split(" ");
            String Heros=A[0];
            String Name=A[1];

            List <String> B=M1.get(Heros);
            if(B==null){
                B=new ArrayList<>();
                M1.put(Heros,B);
            }
            B.add(Name);
        }
        System.out.println(M1);










    }}