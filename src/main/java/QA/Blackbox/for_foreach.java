package QA.Blackbox;

import java.util.*;

public class for_foreach {

public static void main(String...s){

int m[]={1,2,3,4,5,6};
int total=0;
for(int i=0;i<6;i++){
System.out.println(m[i]);
}
System.out.println("================================================");
for(int i:m){
    total=total+i;
    System.out.println(i);
}
System.out.println(total);

System.out.println("===============List Integer=================================");
ArrayList<Integer>L= new ArrayList<>();

L.add(10);
L.add(11);
L.add(12);
L.add(13);
L.add(14);

for(Integer f:L){
    System.out.println(f);
}


System.out.println("===============List String=================================");

LinkedList<String> L1=new LinkedList<String>();

L1.add("Umar");
L1.add("Khalid");
L1.add("Affan");

for(String S:L1){
    System.out.println(S);
}

System.out.println("===============HashSet String=================================");

Set<String> s1=new HashSet<String>();

s1.add("Ertgrul");
s1.add("Turgut");
s1.add("Bamsi");

for(String S2:s1){
    System.out.println(S2);
}


System.out.println("===============LinkedHashSet String=================================");


    Set<Integer> s6= new LinkedHashSet<Integer>();
s6.add(45);
s6.add(56);
s6.add(99);


    for(Integer f4:s6){
        System.out.println(f4);
    }


System.out.println("===============HashMap String=================================");

Map<Integer,Integer> M1=new HashMap<Integer,Integer>();
M1.put(1,1);
M1.put(2,2);
M1.put(3,3);

for(Map.Entry<Integer,Integer> ent:M1.entrySet()){
System.out.println(ent.getKey());
System.out.println(ent.getValue());
}



}




}