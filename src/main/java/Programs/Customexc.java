package Programs;

public class Customexc {

public void checkAge(int Age) {
    if(Age<18){
        try {
            throw new InvalidAgeException("Age is not valid");
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }
    else{
        System.out.println("Age is Valid");
    }
}
    public static void main(String[] args){
        Customexc T1=new Customexc();
        T1.checkAge(17);
    }



}





class InvalidAgeException extends Exception{
    InvalidAgeException(String str){
        super(str);
    }
}
