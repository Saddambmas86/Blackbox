package Fileprogram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.github.fge.msgsimple.bundle.PropertiesBundle;
import io.restassured.internal.support.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Readfile {

public static void main(String[] args) throws IOException, ParseException {


//	//Parse into JSON
// JSONParser parser=new JSONParser();
// JSONObject obj= (JSONObject) parser.parse(new FileReader("C:\\Users\\Saddam\\Desktop\\TipsTricks\\Blackbox\\src\\main\\resources\\test.json"));
//
//	System.out.println(obj.get("firstname"));
//	System.out.println(obj.get("Lastname"));

	Properties prop=new Properties();
	FileInputStream file=new FileInputStream("C:\\Users\\Saddam\\Desktop\\TipsTricks\\Blackbox\\src\\main\\resources\\Dbqueries.properties");
	prop.load(file);
	System.out.println(prop.getProperty("query1"));
}}
