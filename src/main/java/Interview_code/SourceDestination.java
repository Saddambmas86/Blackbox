package Interview_code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SourceDestination {

public static void main(String[] args) {

    Map<String, String> dataSet = new HashMap<String, String>();
    dataSet.put("Chennai", "Banglore");
    dataSet.put("Bombay", "Delhi");
    dataSet.put("Goa", "Chennai");
    dataSet.put("Delhi", "Goa");

    Map<String,String> RevMap=new HashMap<>();


    for (Map.Entry<String,String> M1:dataSet.entrySet()){
        RevMap.put(M1.getValue(),M1.getKey());
    }

for(Map.Entry<String,String> M2:dataSet.entrySet()){
    if(!RevMap.containsKey(M2.getKey())){
        System.out.println(M2.getKey());
    }
    if(!RevMap.containsValue(M2.getValue())){
        System.out.println(M2.getValue());
    }


}




}

}
