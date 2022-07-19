package Interview_code;

import java.util.*;

public class SortingMonths {

    public static void main(String[] args) {
        List<String> L1=new ArrayList<>();
        L1.add("July");
        L1.add("November");
        L1.add("March");
        L1.add("February");

        Collections.sort(L1,new sortbymonths());
        System.out.println(L1);

    }




}


class sortbymonths implements Comparator<String>{
    Map<String,Integer> M1=new HashMap<>();

    sortbymonths(){
        M1.put("January",1);
        M1.put("February",2);
        M1.put("March",3);
        M1.put("April",4);
        M1.put("May",5);
        M1.put("June",6);
        M1.put("July",7);
        M1.put("August",8);
        M1.put("September",9);
        M1.put("October",10);
        M1.put("November",11);
        M1.put("December",12);
    }

    @Override
    public int compare(String o1, String o2) {
        return M1.get(o1).compareTo(M1.get(o2));
    }
}
