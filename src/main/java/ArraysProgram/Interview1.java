package ArraysProgram;

import java.util.ArrayList;

public class Interview1 {

    public static void main(String...s) {

        ArrayList<String> A1=new ArrayList<String>();
        A1.add("Black");
        A1.add("White");
        A1.add("Blue");
        A1.add("Brown");
        A1.add("Green");
        A1.add("Red");
        A1.add("Voilet");
        A1.add("Black2");


        int listsize=A1.size();

        boolean flag=false;
        for(int i=0;i<listsize;i++) {
            for(int j=0;j<A1.get(i).length();j++) {
                if(A1.get(i).charAt(j)!='e') {
                    //System.out.println(A1.get(i).charAt(j));
                    flag=true;
                    //System.out.println(flag);
                }
                else {
                    flag=false;
                    break;
                }

            }
            //System.out.println("Value of flag"+flag);
            if(flag==true){
                System.out.println(A1.get(i));
            }
        }







    }



}
