package Programs;

import java.util.HashMap;
import java.util.Map;

public class CountDistintcahar {

    public static void main(String[] args) {


        String str="SaddamHusain";
        char ch[]=str.toCharArray();

        Map<Character,Integer> map1=new HashMap<>();

        for (int i=0;i<str.length();i++){
            if(map1.containsKey(ch[i])){
map1.put(ch[i],map1.get(ch[i])+1);
            }
            else{
                map1.put(ch[i],1);
            }
        }

        System.out.println(map1);






    }


}
