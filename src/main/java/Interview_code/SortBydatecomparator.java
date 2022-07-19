package Interview_code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBydatecomparator {

    public static void main(String[] args) {

        List<String> L2=new ArrayList<>();
        L2.add("11/01/1991");
        L2.add("16/01/1991");
        L2.add("04/01/1991");
        L2.add("12/01/1990");
        L2.add("01/11/1991");
        Collections.sort(L2,new sortBydate());
        System.out.println(L2);
    }


}

class sortBydate implements Comparator<String>{



    @Override
    public int compare(String o1, String o2) {
        SimpleDateFormat SD=new SimpleDateFormat("dd/mm/yyyy");
        try {
            return SD.parse(o1).compareTo(SD.parse(o2));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
