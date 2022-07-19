package QA.Blackbox;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class PasswordEncode {

    public static void main(String...s){
        String beforeD = "Um9jayQwMzAzUm9jayQwMzAz";
        Base64.Decoder decoder=Base64.getDecoder();
        beforeD=new String(decoder.decode(beforeD.trim()));
        System.out.println(beforeD);

//        String base64encodedString = Base64.getEncoder().encodeToString("Rock$0303Rock$0303".getBytes("utf-8"));
//        System.out.println("Base64 Encoded String (Basic) :" + base64encodedString);

        String beforeE = "dcrkfil";
        Base64.Encoder encoder=Base64.getEncoder();
        beforeE=new String(encoder.encodeToString(beforeE.getBytes(StandardCharsets.UTF_8)));
        System.out.println(beforeE);

    }


}
