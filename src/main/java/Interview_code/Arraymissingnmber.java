package Interview_code;

public class Arraymissingnmber {

public static void main(String[] args) {

int A[]={1,4,7,9};
int index=0;
int len=A[A.length-1];

for (int i=0;i<len;i++){
 if(A[index]==i){
  index++;
 }
 else{
  System.out.println(i);
 }
}



}

}
