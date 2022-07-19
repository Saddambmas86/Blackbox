package Pattern;

public class RightAngle {
    public static void main(String[] args) {


//   *
//  **
// ***
//****




for (int i=1;i<=4;i++){
    for(int j=3;j>=i;j--){
        System.out.print(" ");
    }
    for (int k=1;k<=i;k++)
    {
        System.out.print("*");
    }
    System.out.println();
}


//    *
//   * *
//  * * *
// * * * *

//oNLY ADD SPACE TO K LOOP WITH STAR PRINT STATEMENT



    }

}
