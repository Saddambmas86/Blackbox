package Collections;

import java.util.*;

public class LinkedListA {

    public static void main(String[] args) {

//        System.out.println("Array List: ");
//        ArrayList<Integer> AL=new ArrayList<Integer>();
//
//        AL.add(3);
//        AL.add(2);
//        AL.add(3);
//        AL.add(1);
//        AL.add(null);
//       // Collections.sort(AL);
//        System.out.println(AL);
//
//
//        Set<Integer> S1=new HashSet<>();
//        S1.add(4);
//        S1.add(6);
//        S1.add(3);
//        S1.add(2);
//        S1.add(5);
//        S1.add(null);
//        System.out.println("Hashset: Random order");
//        System.out.println(S1);
//
//        Set<Integer> S2=new LinkedHashSet<>();
//        S2.add(4);
//        S2.add(6);
//        S2.add(3);
//        S2.add(2);
//        S2.add(5);
//        System.out.println("Linked hashset: Insertion order");
//        System.out.println(S2);
//
//
//        Map<Integer, String> M1=new LinkedHashMap<>();
//        M1.put(1,"Saddam");
//        M1.put(3,"fareed");
//        M1.put(4,"Qutub");
//        M1.put(2,"faredadsed");
//        M1.put(5,"Qutaddub");
//        M1.put(9,null);
//
//        System.out.println("Linked Hashmap: Insertion Order");
//        System.out.println(M1);
//
//
//        Map<Integer, String> M2=new HashMap<>();
//        M2.put(1,"Saddam");
//        M2.put(3,"fareed");
//        M2.put(4,"Qutub");
//        M2.put(8,"faredadsed");
//        M2.put(11,"Qutaddub");
//        M2.put(21,"Saddam");
//        M2.put(7,"fareed");
//        M2.put(2,"Qutub");
//        M2.put(12,"faredadsed");
//        M2.put(20,"Qutaddub");
//
//
//        System.out.println("HashMap: Random Order");
//        System.out.println(M2);
//
//
//
//Set<Integer> S3=new TreeSet<>();
//        S3.add(45);
//        S3.add(31);
//        S3.add(21);
//        S3.add(35);
//        S3.add(56);
//        S3.add(11);
//
//        System.out.println("TreeSet: Ascending order");
//        System.out.println(S3);
//
//
//        TreeSet<String> S4=new TreeSet<>();
//        TreeSet S5= (TreeSet) S4.descendingSet();
//        S4.add("zebra");
//        S4.add("cat");
//        S4.add("apple");
//        S4.add("dog");
//        S4.add("eat");
//
//        System.out.println("TreeSet: Ascending order");
//        System.out.println(S5);

        String A="Audi A2,Audi A3,Audi A4,BMW S3,BMW HH";
        String Anew[]=A.split(",");
        Map<String, List<String>> M1=new HashMap<>();

        List<String> S1=new ArrayList<>();
    for (int i=0;i<Anew.length;i++){
        S1.add(Anew[i]);
    }

    for (int i=0;i<S1.size();i++){
        String car[]=S1.get(i).split(" ");
        String carname=car[0];
        String carmodel=car[1];
        List<String> model=M1.get(carname);
        if(model==null){
            model=new ArrayList<>();
            M1.put(carname,model);
        }
        model.add(carmodel);
    }
        System.out.println(M1);











    }


}
