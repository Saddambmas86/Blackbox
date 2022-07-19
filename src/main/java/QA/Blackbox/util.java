package QA.Blackbox;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class util {

    public static String getPresentWorkingDir()	throws IOException	{
        String path;
        path = System.getProperty("user.dir");
        return path;
    }


    public static Properties readPropertyFileDB(){
        Properties prop= new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream(getPresentWorkingDir()+"/src/main/resources/Dbqueries.properties");
            prop.load(input);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop;
    }

}
