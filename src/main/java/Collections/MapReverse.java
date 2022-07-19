package Collections;

import org.apache.commons.exec.util.MapUtils;

import java.util.*;

public class MapReverse {

    public static void main(String[] args) {
        Map<Integer, String> map1=new TreeMap<>(Collections.reverseOrder());
        map1.put(1,"Abu-Bakr-siddhique");
        map1.put(2,"Umar-Bin-Khattab");
        map1.put(3,"Usman-Gani");
        map1.put(4,"Khalid-bin-Waleed");
        map1.put(5, "Saddam-bin-Sami");
        System.out.println(map1);
    }

}
