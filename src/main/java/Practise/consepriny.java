package Practise;

import java.util.HashMap;
import java.util.Map;

public class consepriny {

    public static void main(String[] args) {
//
//        String str="aaabbccdde";
//        for(int i=0;i<str.length();i++){
//            int consecutive=1;
//            while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
//                //System.out.println("----");
//                i++;
//                consecutive++;
//            }
//
//            System.out.print(str.charAt(i)+""+consecutive);
//        }

//int n=5;
//int index=1;
//
//for(int i=0;i<=n;i++){
//    for(int j=0;j<i;j++){
//        System.out.print(index+++" ");
//    }
//    System.out.println();
//}


//String str="aaabbccccccdeeerr";
//for (int i=0;i<str.length();i++){
//    int consecutive=1;
//    while (i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
//     consecutive++;
//     i++;
//    }
//    System.out.print(str.charAt(i)+""+consecutive);
//}

//   *
//  **
// ***
//****
//***
//**
//*

//for (int i=1;i<=4;i++){
//    for (int k=3;k>=i;k--){
//        System.out.print(" ");
//    }
//
//    for (int j=1;j<=i;j++){
//        System.out.print("*");
//    }
//    System.out.println();
//}
//
//for (int i=1;i<=3;i++){
//    for (int j=3;j>=i;j--){
//        System.out.print("*");
//    }
//    System.out.println();
//}




//        String firstString = "one";
//        String secondString = "tworeergrg";
//
//        firstString = firstString + secondString;
//        secondString = firstString.substring(0, (firstString.length() - secondString.length()));
//        firstString = firstString.substring(secondString.length());
//
//        System.out.println("\nAfter swapping....");
//        System.out.println("The first String  = " + firstString);
//        System.out.println("The second String = " + secondString);

String str="aaabbbcef";
Map<Character,Integer> M1=new HashMap<>();

for (int i=0;i<str.length();i++){
    if(!M1.containsKey(str.charAt(i))){
        M1.put(str.charAt(i),i);
    }
    else{
        System.out.println(str.charAt(i));
        i=M1.get(str.charAt(i));
        System.out.println(str.charAt(i)+"===="+i);
        M1.clear();
    }
    System.out.println(M1.size());
    System.out.println(M1.keySet().toString());
}

    }
}
