package Collections;

import java.util.*;

public class mapsorted {

    public static void main(String[] args) {
        Map<String, Integer> M1=new HashMap<>();
        M1.put("Saddam",11);
        M1.put("Umar",2);
        M1.put("Zin",7);
        M1.put("Khalid",1);
        M1.put("Bin",7);

        //System.out.println(M1);

        List<Map.Entry<String,Integer>> L1=new ArrayList<>(M1.entrySet());


    Collections.sort(L1, new Comparator<Map.Entry<String, Integer>>() {
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            return (o1.getValue()).compareTo(o2.getValue());
        }});

        System.out.println(L1);
        Map<String, Integer> M2=new LinkedHashMap<>();

for(Map.Entry<String,Integer> M3:L1){
M2.put(M3.getKey(), M3.getValue());
}
        System.out.println(M2);


    }

}
