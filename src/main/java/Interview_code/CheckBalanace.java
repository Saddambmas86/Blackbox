package Interview_code;

public class CheckBalanace {

    public static void main(String[] args) {

        int Balance=100;
        int Withdrawal=50;

        if(Withdrawal>Balance){
            try {
                throw new MinimumBalanceException("Minimum Balance");
            } catch (MinimumBalanceException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Amount has been withdraw");
        }
    }



}



class MinimumBalanceException extends Exception{
 public MinimumBalanceException(String str){
     super(str);
 }
}