package Programs;

import java.util.Scanner;

public class CircleArea {

//Area of circle:
 public static void Areaofcircle(int Radius){
  double Area;
  Area=Math.PI*Radius*Radius;
  System.out.println("Area of circle: "+Area);
 }


 //Factorial:
 public static void factorial(double number){
  double fact=1;
  while(number!=0){
fact=fact*number;
number=number-1;
  }
  System.out.println("Factorial of number is"+fact);
 }


 //Fibonacci Series:
 public static void fibonacci(int num){
  int f1=0;
  int f2=0;
  int f3=1;

  while(num!=0){
   f1=f2;
   f2=f3;
   f3=f1+f2;
   num=num-1;
   System.out.print(f3+", ");
  }
 }


public static void maxnum(int A[]){

  int Max=A[0];
  for(int i=1;i<A.length;i++){
   if(A[i]>Max){
    Max=A[i];
   }
  }
 System.out.println("Maximum number is "+Max);
}



 public static void main(String[] args) {
  Scanner scan=new Scanner(System.in);
  int radius=scan.nextInt();

  //CircleArea.Areaofcircle(radius);
  //CircleArea.factorial(radius);
  //CircleArea.fibonacci(radius);
  //  System.out.println(Math.max(13,17));
int []A={2,798,8,1,4,90};

CircleArea.maxnum(A);





 }



}
