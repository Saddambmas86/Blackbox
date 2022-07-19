package StringPrograms;

public class CountVowels {

    public static void main(String[] args) {


        String A="Aeiou TT";
        A=A.toLowerCase();
int vCount=0;
int cCount=0;

        for (int i=0;i<A.length();i++){
            if(A.charAt(i)=='a'||A.charAt(i)=='e'||A.charAt(i)=='i'||A.charAt(i)=='o'||A.charAt(i)=='u'){
                vCount=vCount+1;
            }
            else if(A.charAt(i)>='a' && A.charAt(i)<='z'){
                cCount=cCount+1;
            }
        }
        System.out.println("No of Vowels: "+vCount);
        System.out.println("No of Consonents: "+cCount);
        
        
        
        
        
        
        
    }


}
