package Interview_code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringtoMap {

public static void main(String[] args) {

        String str="Audi A1,Audi A2,Audi A3,BMW B1,BMW B2";
        String str1[]=str.split(",");

        List<String> L1=new ArrayList<>();
        for (int i=0;i<str1.length;i++){
            L1.add(str1[i]);
        }

        Map<String,List<String>> M1=new HashMap<>();

        for(int i=0;i<L1.size();i++){
            String AB[]=L1.get(i).split(" ");
            String Brand=AB[0];
            String Model=AB[1];
            List L2=M1.get(Brand);

            if(L2==null){
                L2=new ArrayList();
                M1.put(Brand,L2);
            }
            L2.add(Model);
        }

    System.out.println(M1);
}

}
