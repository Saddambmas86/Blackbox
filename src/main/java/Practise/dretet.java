package Practise;

import java.sql.SQLOutput;
import java.util.*;

public class dretet {
    public static void main(String args[]) throws Exception {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the string:");
//       String A=input.nextLine();
//===================================================
//        for (int i=0;i<A.length();i++){
//            int consecutive=1;
//            while (i+1<A.length() && A.charAt(i)==A.charAt(i+1)){
//                i++;
//                consecutive++;
//            }
//            System.out.print(A.charAt(i)+""+consecutive);
//        }
//====================================================

//      Map<String,String> M1=new HashMap<>();
//      M1.put("Etw","Agra");
//      M1.put("Delhi","Jaipur");
//      M1.put("KANPUR","Etw");
//      M1.put("Jaipur","Ajmer");
//      M1.put("Agra","Delhi");
//
//        Map<String,String> RevMap=new HashMap<>();
//
//      for(Map.Entry<String,String> M2:M1.entrySet()){
//          RevMap.put(M2.getValue(),M2.getKey());
//      }
//
//for(Map.Entry<String,String> M2:RevMap.entrySet()){
//    if(!M1.containsKey(M2.getKey())){
//        System.out.println(M2.getKey());
//    }
//
//    if(!M1.containsValue(M2.getValue())){
//        System.out.println(M2.getValue());
//    }
//}
//===========================================================

//String str="Audi X1,Audi X2,Audi X3,BMW i8,BMW i9";
//String Arr[]=str.split(",");
//
//List<String> L1=new ArrayList<>();
//for (int i=0;i<Arr.length;i++){
//    L1.add(Arr[i]);
//}
//
//Map<String,List<String>> cars=new HashMap<>();
//
//for(int i=0;i<L1.size();i++){
//    String arr1[]=L1.get(i).split(" ");
//    String carcompany=arr1[0];
//    String carmodel=arr1[1];
//    List<String> modelList=cars.get(carcompany);
//
//    if(modelList==null){
//        modelList=new ArrayList<>();
//        cars.put(carcompany,modelList);
//    }
//    modelList.add(carmodel);
//}
//System.out.println(cars);

//        int number=20;
//        //Switch expression
//        switch(number){
//            //Case statements
//            case 10:
//                System.out.println("10");
//                break;
//            case 20:
//                System.out.println("20");
//                break;
//            case 30:
//                System.out.println("30");
//                break;
//            //Default case statement
//            default:
//                System.out.println("Not in 10, 20 or 30");
//        }


//        switch(A){
//            case "1":
//                System.out.println("MONDAY");
//                break;
//            case "2":
//                System.out.println("TUESDAY");
//                break;
//            case "3":
//                System.out.println("WEDNESDAY");
//                break;
//            case "4":
//                System.out.println("THURSDAY");
//                break;
//            case "5":
//                System.out.println("FRIDAY");
//                break;
//            case "6":
//                System.out.println("SATURDAY");
//                break;
//            case "7":
//                System.out.println("SUNDAY");
//                break;
//            default:
//                System.out.println("Number not between 1-7");
//        }
//----------------------------------------------------------------------

//String revStr="";
//
//for(int i=A.length()-1;i>=0;i--){
//    revStr=revStr+A.charAt(i);
//}
//        System.out.println(revStr);
//-----------------------------------------------------------------------

//Set<Character> Vowels=new HashSet<>();
//        Vowels.add('a');
//        Vowels.add('e');
//        Vowels.add('i');
//        Vowels.add('o');
//        Vowels.add('u');
//        Vowels.add('A');
//        Vowels.add('E');
//        Vowels.add('I');
//        Vowels.add('O');
//        Vowels.add('U');
////
//int Vcount=0;
//int Ccount=0;
//
//for (int i=0;i<A.length();i++){
//    if(Vowels.contains(A.charAt(i))){
//        Vcount++;
//    }
//    else if(A.charAt(i)>='a' & A.charAt(i)<='z' || A.charAt(i)>='A' & A.charAt(i)<='Z'){
//        Ccount++;
//    }
//}
//
//        System.out.println(Vcount);
//        System.out.println(Ccount);


//String A="Umar bin khattab";
//char ch[]=A.toCharArray();
//char chnew[]=new char[ch.length];
//
//for (int i=0;i<ch.length;i++){
//    if(ch[i]==' '){
//        chnew[i]=' ';
//    }
//}
//int j=A.length()-1;
//
//for (int i=0;i<ch.length;i++){
//    if(ch[i]!=' ') {
//        if (chnew[j] == ' ') {
//            j--;
//        }
//
//        chnew[j] = ch[i];
//        j--;
//    }
//}
//
//        System.out.println(chnew);

//String str="Umarbin";
//char ch[]=str.toCharArray();
//int start=0;
//int end=ch.length-1;
//while(start<end){
//    if(!Vowels.contains(ch[start])){
//        start++;
//    }
//    if(!Vowels.contains(ch[end])){
//        end--;
//    }
//    char temp=ch[start];
//    ch[start]=ch[end];
//    ch[end]=temp;
//    start++;
//    end--;
//}
//        System.out.println(ch);


//String str="Umar Bin Khattab";
//System.out.println(str.replaceAll(" ",""));
//

//String str="Umar Bin Khattab";
//String [] A=str.split(" ");
//String newstr="";
//
//for(int i=0;i<A.length;i++){
//    for(int j=A[i].length()-1;j>=0;j--){
//        newstr=newstr+A[i].charAt(j);
//    }
//    newstr=newstr+" ";
//}
//        System.out.println(newstr);

//===========================================

//String str="Umar Bin Khattab";
//Map<Character,Integer> M1=new HashMap<>();
//
//for (int i=0;i<str.length();i++){
//    if(M1.containsKey(str.charAt(i))){
//        M1.put(str.charAt(i), M1.get(str.charAt(i))+1);
//    }
//    else{
//        M1.put(str.charAt(i),1);
//    }
//}
//        System.out.println(M1);
//
//Iterator itr=M1.entrySet().iterator();
//
//while (itr.hasNext()){
//    Map.Entry M2=(Map.Entry)itr.next();
//    if(M2.getValue().equals(2)){
//        System.out.println(M2.getKey());
//    }
//}
//

//int A[]={6,2,9,3,5};
//Arrays.sort(A);
//int index=0;
//int size=A[A.length-1];
//
//for(int i=0;i<size;i++){
//    if(A[index]==i){
//        index++;
//    }
//    else{
//        System.out.println(i);
//    }
//}

//int n=13;
//boolean flag=true;
//for(int i=2;i<n;i++){
//    if(n%i==0){
//        flag=false;
//        break;
//    }
//    else{
//        flag=true;
//    }
//}
//        System.out.println(flag);
//if(flag==true){
//    System.out.println("Number is prime"+flag);
//}

//String str="umar bin khattab";
//char A[]=str.toCharArray();
//Arrays.sort(A);
//        System.out.println(A);


//String str="UmarbinKhattab";
//char ch[]=str.toCharArray();
//String newst="";
//
//for (int i=0;i<ch.length;i++){
//if(newst.indexOf(ch[i])==-1){
//newst=newst+str.charAt(i);
//
//}
//}
//System.out.println(newst);










    }
    }



