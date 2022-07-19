package Practise;




import java.util.*;

public class IHS2 {

    public static void main(String[] args) {

//        int A[]={3,6,2,9,1,2};
//        int B[]={9,3,1,2,6,2};
//
//        boolean flag=false;
//
//        if(A.length==B.length){
//            Arrays.sort(A);
//            Arrays.sort(B);
//
//            for (int i=0;i<A.length;i++){
//            if(A[i]==B[i]){
//                flag=true;
//            }
//            else {
//                flag = false;
//            }
//            }
//
//            if(flag=true){
//                System.out.println("Arrays exactly equal");
//            }
//            else{
//                System.out.println("Arrays not same");
//            }
//        }
//
//        else{
//            System.out.println("Arrays are not equal");
//        }


//int A[]={3,6,3,2,4,5,6,74,332};
//int sum=0;
//
//for(int i=0;i<A.length;i++){
//sum=sum+A[i];
//}
//        System.out.println(sum/A.length);
//        System.out.println(sum);
//


//        int A[]={3,6,2,9,1,2};
//        int B[]={9,3,1,2,6,2};
//
//
//        int c[]=new int[A.length];
//        System.out.println("size of Array "+A.length);
//
//        for(int i=0;i<A.length;i++){
//            c[i]=A[i]+B[i];
//        }
//
//        for(int i=0;i<A.length;i++){
//            System.out.println(c[i]);
//        }
//

//        int src1[] = {10, 20, 30, 40, 50};
//        int src2[] = {9, 18, 27, 36, 45};
//        int src3[] = {19, 108, 237, 356, 425};
//
//       int newArray[] = new int[src1.length + src2.length+src3.length];
//
//        System.arraycopy(src1, 0, newArray, 0, src1.length);
//        System.arraycopy(src2, 0, newArray, src1.length, src2.length);
//        System.arraycopy(src3,0,newArray,src2.length+src1.length,src3.length);
//
//
//
//
//
//
//       // Arrays.sort(newArray);
//
//        for(int i=0;i<newArray.length;i++){
//           System.out.print(newArray[i]+" ");
//        }
//


//        int src1[] = {100, 20, 3, 4000, 50};
////        Arrays.sort(src1);
////        //System.out.println(src1.length);
////        System.out.println(src1[src1.length-1]);
//int max=src1[0];
//
//for(int i=0;i<src1.length;i++){
//    if(src1[i]>max){
//        max=src1[i];
//    }
//}
//        System.out.println(max);


        ///Remove elements:
//        int arr[]={2,3,4,5,64,4,2};
//
//        for (int i=0;i<arr.length;i++){
//            if(arr[i]==4){
//                for(int j=i;j< arr.length-1;j++){
//                    arr[j]=arr[j+1];
//                }break;
//            }
//        }
//        for(int i=0;i<arr.length-1;i++){
//           System.out.print(arr[i]+" ");
//        }
//

//remove duplicates
//int arr[]={2,81,5,5,6,6,7,81,9,9,8};
//Arrays.sort(arr);
//int j=0;
//for(int i=0;i<arr.length-1;i++){
//if(arr[i]!=arr[i+1]){
//arr[j]=arr[i];
//j++;
//}
//}
//arr[j]=arr[arr.length-1];
//
//for (int i=0;i< j+1;i++){
//    System.out.print(arr[i]+" ");
//}

//        int arr[]={2,81,5,5,6,6,7,81,9,9,8};
//
//Set<Integer> C1=new LinkedHashSet<Integer>();
//for (int i=0;i< arr.length;i++){
//    C1.add(arr[i]);
//}
//        int newarr[]=new int[C1.size()];
//        Iterator itr= C1.iterator();
//for(int i=0;i<C1.size();i++){
//    if(itr.hasNext()) {
//        newarr[i] = (int) itr.next();
//                System.out.print(newarr[i]+",");
//    }}
////Alphabetics order

//String str="Automationss";
//char ch[]=str.toCharArray();
//char temp;
//
//for(int i=0;i<str.length();i++){
//    for(int j=i+1;j<str.length();j++){
//        if(ch[i]>ch[j]){
//            temp=ch[i];
//            ch[i]=ch[j];
//            ch[j]=temp;
//        }
//    }
//}
//
//
//        System.out.println(ch);


//String str="Umar bin Khattab";
//String str1[]=str.split(" ");
//Map<Integer,String>M1=new HashMap<>();
//for(int i=0;i<str1.length;i++){
//    M1.put(str1[i].length(),str1[i]);
//}
//        int maxValueInMap=Collections.max(M1.keySet());
//        System.out.println(maxValueInMap);
//        System.out.println(M1.get(7));
//


String str="abcccde";
Map<Character, Integer> M1=new LinkedHashMap<>();

for (int i=0;i<str.length();i++) {
char ch=str.charAt(i);
if(!M1.containsKey(ch)){
M1.put(ch,i);
}
else{
    i=M1.get(ch);
    M1.clear();

}
}


        System.out.println(M1.keySet().toString());

    }



}
