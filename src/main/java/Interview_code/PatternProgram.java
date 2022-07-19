package Interview_code;

public class PatternProgram {

public static void main(String[] args) {

//*
//* *
//* * *
//* * * *

for (int i=1;i<=4;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println(" ");
}

//      *
//    * *
//  * * *
//* * * *
int index=1;
for (int i=1;i<=4;i++){
    for(int j=3;j>=i;j--){
        System.out.print(" ");
    }
    for (int k=1;k<=i;k++){
        System.out.print(index);
        index++;
    }
    System.out.println(" ");
}



}





}
