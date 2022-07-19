package ArraysProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingnumberArray {

    public static void main(String[] args) {




//        int[] numbers = { 11, 6, 4, 5, 7, 1 };
//        Arrays.sort(numbers);
//        int numbersArrayIndex = 0;
//
//        //{1,4,5,6,7,11}
//
//        for (int i = 0; i < numbers[numbers.length - 1]; i++) {
//            if (i == numbers[numbersArrayIndex]) {
//                numbersArrayIndex++;
//            }
//            else {
//                System.out.println(i);
//            }
//        }


//  int A[]={1,3,5,7,11,13,15,17,19};
//  int length=A[A.length-1];
//        System.out.println(length);
//        Arrays.sort(A);
//        int index=0;
//        for(int i=0;i<length;i++){
//            if(i==A[index]){
//                index=index+1;
//            }
//            else{
//                System.out.println(i);
//            }
//        }
//
//
//int A[]={1,1,3,3,4,5,6,7};
//
//for(int i=0;i<A.length;i++){
//   for(int j=i+1;j<A.length;j++){
//if(A[i]==A[j]){
//    System.out.println(A[i]);
//}
//   }
//}

//
//String str="I love Automation";
//String str1=str.replaceAll(" ", "");
//        System.out.println(str1);
////IoeAuoaio
////oiaouAeoI
//char A[]=str1.toCharArray();
//
Set vowels=new HashSet<Character>();
vowels.add('a');
vowels.add('e');
vowels.add('i');
vowels.add('o');
vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
//
//
//int Start=0;
//int End=str1.length()-1;
//
//while(Start<End){
//if(!vowels.contains(A[Start])){
//Start++;
//continue;
//}
//if(!vowels.contains(A[End])){
//End--;
//continue;
//}
//
//char temp=A[Start];
//A[Start]=A[End];
//A[End]=temp;
//
//Start++;
//End--;
//
//}
//
//        System.out.println(A);
//


String str="Automation";

//tmtn,,,,,,ntmt

char []B=str.toCharArray();

int Start=0;
int End=B.length-1;

while(Start<End){
if(vowels.contains(B[Start])){
    Start++;
    continue;
}
if(vowels.contains(B[End])){
    End--;
    continue;
}
char temp=B[Start];
B[Start]=B[End];
B[End]=temp;
Start++;
End--;
}

        System.out.println(B);

    }

}
