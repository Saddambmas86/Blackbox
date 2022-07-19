package Practise;

import java.util.*;

public class EPAM {
    public static void main(String[] args) {

//        String str="Umar Bin Khattab";
//        Map<Character,Integer> M1=new HashMap<>();
//
//        for(int i=0;i<str.length();i++){
//            if(M1.containsKey(str.charAt(i))){
//                M1.put(str.charAt(i),M1.get(str.charAt(i))+1);
//            }
//            else{
//                M1.put(str.charAt(i),1);
//            }
//        }
//        System.out.println(M1);
//
//        Iterator itr=M1.entrySet().iterator();
//
//        while(itr.hasNext()){
//            Map.Entry M2= (Map.Entry) itr.next();
//            if(M2.getValue().equals(2)){
//                System.out.println(M2.getKey());
//            }
//        }

//String str="Umar Bin Khattab";
//String newstr="";
//
//for(int i=str.length()-1;i>=0;i--){
//    newstr=newstr+str.charAt(i);
//}
//        System.out.println(newstr);


//        String str="Umar Bin Khattab";
//        char ch[]=str.toCharArray();
//        char newch[]=new char[ch.length];
//
//        for(int i=0;i<str.length();i++){
//            if(ch[i]==' '){
//                newch[i]=' ';
//            }
//        }
//        int j=str.length()-1;
//
//        for(int i=0;i<str.length();i++){
//            if(ch[i]!=' '){
//                if(newch[j]==' '){
//                    j--;
//                }
//                newch[j]=ch[i];
//                j--;
//            }
//        }
//
//        System.out.println(newch);
//


// Set<Character> S1=new HashSet<>();
//        S1.add('a');
//        S1.add('e');
//        S1.add('i');
//        S1.add('o');
//        S1.add('u');
//        S1.add('A');
//        S1.add('E');
//        S1.add('I');
//        S1.add('O');
//        S1.add('U');
//
//String str="umar bin khattab";
//char[] ch=str.toCharArray();
//int start=0;
//int end=str.length()-1;
//
//while(start<end){
//    if(!S1.contains(ch[start])){
//        start++;
//    }
//    if(!S1.contains(ch[end])){
//        end--;
//    }
//    char temp=ch[start];
//    ch[start]=ch[end];
//    ch[end]=temp;
//    start++;
//    end--;
//}
//        System.out.println(ch);

//        String str="umar bin khattab";
//        String []S1=str.split(" ");
//        String S2="";
//
//        for(int i=0;i<S1.length;i++){
//            for(int j=S1[i].length()-1;j>=0;j--){
//                S2=S2+S1[i].charAt(j);
//            }
//            S2=S2+" ";
//        }
//        System.out.println(S2);


//
//        String str="abccde";
//        Map<Character,Integer> M1=new HashMap<>();
//
//        for(int i=0;i<str.length();i++){
//            if(!M1.containsKey(str.charAt(i))){
//                M1.put(str.charAt(i),i);
//            }
//            else{
//                i=M1.get(str.charAt(i));
//                M1.clear();
//            }
//        }
//        System.out.println(M1.keySet().toString());


//        Map<String, String> dataSet = new HashMap<String, String>();
//        dataSet.put("Chennai", "Banglore");
//        dataSet.put("Bombay", "Delhi");
//        dataSet.put("Goa", "Chennai");
//        dataSet.put("Delhi", "Goa");
//
//
//        Map<String,String> RevMap=new HashMap<>();
//
//        for(Map.Entry<String,String> M2:dataSet.entrySet()){
//            RevMap.put(M2.getValue(),M2.getKey());
//        }
//
//        for(Map.Entry<String,String> M3: dataSet.entrySet()){
//            if(!RevMap.containsKey(M3.getKey())){
//                System.out.println(M3.getKey());
//            }
//        }
//
//
//


        String str="Audi A1,Audi A2,Audi A3,BMW B1,BMW B2";
        String s1[]=str.split(",");

        List<String> L1=new ArrayList<>();
        for(int i=0;i<s1.length;i++){
            L1.add(s1[i]);
        }

        Map<String,List<String>> M1=new HashMap<>();

for(int i=0;i<L1.size();i++){
    String A[]=L1.get(i).split(" ");
    String brand=A[0];
    String model=A[1];

    List<String> L2=M1.get(brand);

    if(L2==null){
        L2=new ArrayList<>();
        M1.put(brand,L2);
    }
    L2.add(model);
}

        System.out.println(M1);


    }
}
