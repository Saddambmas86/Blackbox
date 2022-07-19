package Practise;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Int1 {

    public static void main(String[] args) throws IOException {

        //  int n[]={8,9,1,5,3,2,6,7,6,7,2,3,5,6,7,8,5,5};
//        int max=n[0];
//
//        for (int i=1;i<n.length;i++){
//            if(n[i]>max){
//               max=n[i];
//            }
//        }
//        System.out.println(max);

//819326, 813926, 813296, 813269
//183269, 138269, 132869, 132689,

//        for(int i=0;i<n.length;i++){
//            for(int j=0;j<n.length-1-i;j++){
//                if(n[j]<n[j+1]){
//                    int temp=n[j];
//                    n[j]=n[j+1];
//                    n[j+1]=temp;
//                }
//            }
//        }
//
//
//        for (int i=0;i<n.length;i++) {
//            System.out.print(n[i]+" ");
//        }

//String A="I love Islam";
//String B="i love ISLAM";
//
//boolean flag=false;
//if(A.length()==B.length()) {
//    for (int i = 0; i < A.length(); i++) {
//        if(A.toLowerCase().charAt(i)==B.toLowerCase().charAt(i)){
//            flag=true;
//        }
//
//    }
//}
//
//if(flag==true){
//    System.out.println("String is same");
//}
//else{
//    System.out.println("string is not same");
//}
//
//String A="123";
//String B="364";
//int n=Integer.valueOf(A);
//int m=Integer.valueOf(B);
//        System.out.println(n+m);
//        System.out.println(A+B);
//        System.out.println(A+m);
//
//    int n=12344;
//    String str=Integer.toString(n);
//        System.out.println(str);
//    }
//

        //String str = "Saddam";
//        String strnew = str.replaceAll("[a-eA-Z]","78787");
//        System.out.println(strnew);


//        int strnew1=str.codePointCount(0,4);
//        System.out.println(strnew1);


//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'a') {
//                continue;
//            } else {
//                strnew = strnew + str.charAt(i);
//            }
//        }
//
//        System.out.println(strnew);

//
//  int n=123;
//  int rev=0;
//  int rem;
//
//  while(n!=0){
//      rem=n%10;
//      rev=rev*10+rem;
//      n=n/10;
//  }
//        System.out.println(rev);


//Armstrong:
//int n=1;
//int n1=n;
//int n2=n;
//int rem;
//int sum=0;
//int length=0;
//
//while(n2!=0){
//n2=n2/10;
//length=length+1;
//}
//
//
//while(n!=0){
//rem=n%10;
//sum= (int) (sum+Math.pow(rem,length));
//n=n/10;
//}
//if(sum==n1){
//    System.out.println(sum+": number is armstrong");
//}
//else
//{
//    System.out.println(sum+": number is not armstrong");
//}


//
//String str="Saddam";
//        System.out.println(str.replace("a", ""));


//int A[]={1,3,4,5,7};
//        int B[]=new int[7];
//for(int i=0;i<A[A.length-1];i++){
//    B[i]=i+1;
//}
//
//for(int j=0;j<B.length-1;j++){
//    if(B[j]!=A[j]){
//        System.out.println("B Value"+B[j]);
//        System.out.println("A value"+A[j]);
//    }
//
//}
//        String str1;
//        BufferedReader obj1 = new BufferedReader(new InputStreamReader(System.in));
//
//        do {
//            str1 = obj1.readLine();
//            System.out.println(str1);
//        }
//        while (!str1.equals("strong"));





        String obj="abc";
        byte b[]=obj.getBytes();
        ByteArrayInputStream obj1=new ByteArrayInputStream(b);

        for(int i=0;i<2;i++){
            int c;
            while((c=obj1.read())!=-1){
                if(i==0){
                    System.out.println(Character.toUpperCase((char)c));
                    //obj1.write(1);
                }
            }
            System.out.println(obj1);
        }

//int n=A.length+1;
//int sum=n*(n+1)/2;
//int ressum=0;
//int remain;
//
//for(int i=0;i<A.length;i++){
//    ressum=ressum+A[i];
//}
//
//remain=sum-ressum;
//        System.out.println(remain);
    }
            }

