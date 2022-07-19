package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Comparabledummy {

    public static void main(String[] args) {

 //       ArrayList<Student> A1=new ArrayList<>();

//        A1.add(new Student("Saddam",823,3));
//        A1.add(new Student("Honey",435,1));
//        A1.add(new Student("Saif",876,2));
//        Collections.sort(A1);

        ArrayList<Student2> A1=new ArrayList<>();
        A1.add(new Student2("Saddam",823,3));
        A1.add(new Student2("Honey",435,1));
        A1.add(new Student2("Asif",876,2));
Collections.sort(A1,new SortedByName());
        System.out.println(A1);


    }


}
