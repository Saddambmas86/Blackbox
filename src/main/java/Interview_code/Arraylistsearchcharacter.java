package Interview_code;

import java.util.ArrayList;
import java.util.List;

public class Arraylistsearchcharacter {

    public static void main(String[] args) {

        List<String> L1=new ArrayList<>();
        L1.add("Blue");
        L1.add("Red");
        L1.add("Black");

        for (int i=0;i<L1.size();i++){
            for (int j=0;j<L1.get(i).length();j++){
                if(L1.get(i).charAt(j)=='e'){
                    System.out.println(L1.get(i));
                    break;
                }
            }
        }


    }


}
