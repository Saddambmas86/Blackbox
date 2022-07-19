package Interview_code;

public class Primenmber {

    public static void main(String[] args) {

        int n=52;
        boolean flag=true;
        for (int i=2;i<n;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }

        if(flag==true){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is not prime");
        }


    }

}
