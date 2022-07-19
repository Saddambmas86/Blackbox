package Programs;

public class Practise {

public static void main(String...s) {


    String A = "Automation";
//String B=A.replaceAll("\\s","");
//System.out.println(B);
//String newstr="";
//
//for(int i=0;i<B.length();i++){
//    char R1=B.charAt(i);
//    if(newstr.indexOf(R1)==-1){
//        newstr=newstr+R1;
//    }
//}
//    System.out.println(newstr);
//}

//Vowels:
    int count=0;
    String newstr = "";

    for (int i=0;i<A.length();i++) {
        System.out.println("Start program");
        if (A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u') {
            int j=i;
            newstr = newstr + A.charAt(A.length()-j);
            count=count+1;
            j--;
        }
        else{
                newstr=newstr+A.charAt(i);
        }
    }


    System.out.println(newstr);
    System.out.println("numbr of vowels: "+count);

}



}
