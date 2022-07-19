package ArraysProgram;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ArrayPract {

    public static void main(String[] args) throws IOException {

        String readJsonFile=new String(Files.readAllBytes(Paths.get("C:\\Users\\Saddam\\Desktop\\TipsTricks\\Blackbox\\src\\main\\resources\\test.json")));
        String value="firstname,Lastname,Contact";
        String []ValueArray=value.split(",");

        Map<String,String> map1=new HashMap<>();
        map1.put("firstname","Khalid");
        map1.put("Lastname","Umar");
        map1.put("Contact","Saddam");



        for(int i=0;i<ValueArray.length;i++) {
            value=ValueArray[i];
            System.out.println(value);
            readJsonFile=readJsonFile.replace("@"+ValueArray[i]+"@",map1.get(value));
        }

        System.out.println(readJsonFile);







    }


}
