package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mclass1 {

    public static void main(String[] args) {
        List<Employee> L1=new ArrayList<>();
        L1.add(new Employee("Test1","123","8285003098"));
        L1.add(new Employee("MTest1","345","892377190"));
        L1.add(new Employee("NTest1","678","9455377190"));
        Collections.sort(L1);
        //Collections.sort(L1,new sortByName());
        System.out.println(L1);
    }




}
