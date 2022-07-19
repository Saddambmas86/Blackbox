package QA.Blackbox;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Logclass {

private static Logger logger= Logger.getLogger("MyLog");

public static void init() throws IOException {

    FileHandler Fh=new FileHandler("C:\\Users\\Saddam\\Desktop\\TipsTricks\\Blackbox\\src\\resource\\file.log");
    logger.addHandler(Fh);
    SimpleFormatter formatter=new SimpleFormatter();
    Fh.setFormatter(formatter);
}

public static void main(String...s) throws IOException {
init();
int A=10;
int B=100/10;
    logger.info("End of Program");



}





}
