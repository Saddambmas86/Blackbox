package Pattern;

public class leftAngle {

    public static void main(String[] args) {


//*
//* *
//* * *
//* * * *

        for (int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }


//* * * *
//* * *
//* *
//*

        for (int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }


int index=1;
        for (int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }




    }

}
