package Collections;

import java.util.HashMap;
import java.util.Map;

public class srcdes1 {

   public static void main(String[] args) {

      Map<String, String> dataSet = new HashMap<String, String>();
      dataSet.put("Chennai", "Banglore");
      dataSet.put("Bombay", "Delhi");
      dataSet.put("Goa", "Chennai");
      dataSet.put("Delhi", "Goa");


      Map<String, String> reverseMap = new HashMap<String, String>();

      // To fill reverse map, iterate through the given map
      for (Map.Entry<String,String> M1: dataSet.entrySet()) {
         reverseMap.put(M1.getValue(), M1.getKey());
      }

      for (Map.Entry<String,String> M1: dataSet.entrySet()) {

         if(!reverseMap.containsKey(M1.getKey())) {
            System.out.println("Source----"+M1.getKey());
         }

         if(!reverseMap.containsValue(M1.getValue())) {
            System.out.println("Destination-----"+M1.getValue());
         }


      }




   }

}
