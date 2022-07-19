package Collections;

import java.util.Comparator;

public class SortedbyId implements Comparator<Student2> {

    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o1.getEmployeeID()-o2.getEmployeeID();
    }
}
