package Collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortbyCaliphas implements Comparator<String> {
    public Map<String,Integer> M1;
    SortbyCaliphas(){
        M1=new HashMap<>();
        M1.put("Abubakr",1);
        M1.put("Umar",2);
        M1.put("Usman",3);
        M1.put("Khaled",4);
    }

    @Override
    public int compare(String o1, String o2) {
        return M1.get(o1).compareTo(M1.get(o2));
    }
}
