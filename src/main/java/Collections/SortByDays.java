package Collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortByDays implements Comparator<String> {

   public Map<String, Integer> M1;
    SortByDays() {
        M1 = new HashMap<>();
        M1.put("Friday",6);
        M1.put("Monday",2);
        M1.put("Wednesday",4);
        M1.put("Tuesday",3);
        M1.put("Sunday",1);
        M1.put("Thursday",5);
        M1.put("Saturday",7);
    }

    @Override
    public int compare(String o1, String o2) {
        return M1.get(o1).compareTo(M1.get(o2));
    }
}
