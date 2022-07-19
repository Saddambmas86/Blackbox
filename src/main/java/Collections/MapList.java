package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapList {

    public static void main(String[] args) {


        String str="Audi A2,Audi A3,Audi A4,BMW S3,BMW HH";
        String newstr[]=str.split(",");
        ArrayList<String> myList1=new ArrayList<>();
        myList1.add(newstr[0]);
        myList1.add(newstr[1]);
        myList1.add(newstr[2]);
        myList1.add(newstr[3]);
        myList1.add(newstr[4]);

        HashMap<String, List<String>> myMap = new HashMap<>();
        for(int i=0;i<myList1.size();i++)
        {
            String[] split = myList1.get(i).split(" ");
            List<String> bucket = myMap.get(split[0]);
            if(bucket == null)
            {
                bucket = new ArrayList<String>();
                myMap.put(split[0], bucket);
            }

            bucket.add(split[1]);
        }

        System.out.println(myMap);





    }

}
