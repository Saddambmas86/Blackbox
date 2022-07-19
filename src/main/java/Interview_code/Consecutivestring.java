package Interview_code;

public class Consecutivestring {

    public static void main(String... s) {


        String str = "aaabbccddeerr";

        for (int i=0;i<str.length();i++){
            int consecutive=1;
            while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                consecutive++;
                i++;
            }
            System.out.print(str.charAt(i)+""+consecutive);
        }



//        for (int i=0;i<str.length();i++){
//    int consecutive=1;
//    while (i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
//     consecutive++;
//     i++;
//    }
//    System.out.print(str.charAt(i)+""+consecutive);
//}


//
//     Boolean B1=false;
//     Boolean B2=false;
//
//     if(B2!=B1==!B2){
//         System.out.println("true");
//     }
//     else{
//         System.out.println("false");
//     }
//
//



//        float f[]=new float[5];
//        Object obj=f;
//        System.out.println(f[0]);





    }

//    static void test(String S){
//        System.out.println("String");
//    }
//
//    static void test(Object o){
//        System.out.println("Object");
//    }

}
