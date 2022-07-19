package QA.Blackbox;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.FileHandler;

public class Webservices {

public static void main(String...s) throws IOException {

    RestAssured.baseURI="https://fakerestapi.azurewebsites.net/api/v1/Activities";

   // File file=new File("C:/Users/Saddam/Desktop/TipsTricks/Blackbox/src/resource/api.json");

    String Jsonbody= new String(Files.readAllBytes(Paths.get("C:/Users/Saddam/Desktop/TipsTricks/Blackbox/src/resource/api.json")));


//    String Jsonbody="{\n" +
//            "  \"id\": 0,\n" +
//            "  \"title\": \"stringQAQQQ\",\n" +
//            "  \"dueDate\": \"2020-11-17T08:58:14.137Z\",\n" +
//            "  \"completed\": true\n" +
//            "}";

    Response response= RestAssured
            .given()
            .header("Content-Type","application/json")
            .body(Jsonbody)
            .when()
            .post()
            .then()
            .extract()
            .response();

    System.out.println(response.getStatusCode());
    System.out.println(response.getStatusLine());
    System.out.println(response.asString());

    String title=response.path("title").toString();
    System.out.println(title);





}



}
