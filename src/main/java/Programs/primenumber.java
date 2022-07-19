package Programs;

public class primenumber {

 public static void prime(int m){
     boolean Isprime=true;


     for (int i=2;i<m;i++) {
         if (m % i == 0) {
             Isprime = false;
             break;
         }
     }


     if(Isprime){
         System.out.println("Number "+m+" is Prime");
     }
     else{
         System.out.println("Number "+m+" is not prime");
     }
 }

    public static void main(String[] args) {


for (int i=2;i<50;i++){
    primenumber.prime(i);
}



    }


}
