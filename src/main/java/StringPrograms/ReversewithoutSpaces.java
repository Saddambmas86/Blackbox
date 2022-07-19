package StringPrograms;

public class ReversewithoutSpaces {

    public static void main(String[] args) {

        String A="We have to do good deeds";

        char[] inputArray=A.toCharArray();
        char[] finalResult=new char[A.length()];

            for (int i=0;i<inputArray.length;i++){
                if(inputArray[i]==' '){
                 finalResult[i]=' ';
                }
            }

            int j=inputArray.length-1;
            for(int i=0;i<inputArray.length;i++){
               if(inputArray[i]!=' '){
                   if(finalResult[j]==' '){
                       j--;
                   }
                   finalResult[j]=inputArray[i];
j--;
               }
                }

        System.out.println(finalResult);



    }




}
