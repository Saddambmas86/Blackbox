package Interview_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortBydaycomparable implements Comparable<SortBydaycomparable>{
 int age;

SortBydaycomparable(int age){
        this.age=age;
    }
public int getAge(){
        return age;
}


    public static void main(String[] args) {

        List<SortBydaycomparable> L1=new ArrayList<>();

        L1.add(new SortBydaycomparable(45));
        L1.add(new SortBydaycomparable(35));
        L1.add(new SortBydaycomparable(23));

        System.out.println(L1);
        Collections.sort(L1);
        System.out.println(L1);


    }


    @Override
    public int compareTo(SortBydaycomparable o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "Student Age= " + getAge();
    }


}
