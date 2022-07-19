package StringPrograms;

public class BubbleString {

    public static void main(String[] args) {

      String B[]={"Saddam","QA","Tom","Apple"};
      String Temp;
      for (int i=0;i<B.length;i++){
          for (int j=0;j<B.length-1;j++){
        	  System.out.println(B[j].compareTo(B[j+1]));
              if (B[j].compareTo(B[j+1])>0){
                  Temp=B[j];
                  B[j]=B[j+1];
                  B[j+1]=Temp;
              }
          }
      }

      for (int i=0;i<B.length;i++){
          System.out.println(B[i]);
      }


    }


}
