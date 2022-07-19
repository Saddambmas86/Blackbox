package Practise;

import java.util.*;

public class TwentyOne {

    public static void main(String[] args) {

        List<String> months=new ArrayList<>();
        months.add("March");
        months.add("January");
        months.add("December");
        months.add("July");
        months.add("June");
        months.add("February");
        months.add("October");

Collections.sort(months,new sortBymonths1());
        System.out.println(months);
    }

}



class sortBymonths1 implements Comparator<String>{

Map<String, Integer> M1=new HashMap<>();

    sortBymonths1(){
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