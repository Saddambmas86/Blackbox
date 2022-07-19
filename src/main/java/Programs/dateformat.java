package Programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateformat {
    public static void main(String[] args) {
        String format="yyyy-dd-MM";
        SimpleDateFormat DF=new SimpleDateFormat(format);
        String Date=DF.format(new Date());
        System.out.println(Date);
    }
}
