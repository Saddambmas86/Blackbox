package RestAssEx;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Verifyjson {

    public static void main(String[] args) throws IOException, JSONException {

        RestAssured.baseURI="https://reqres.in/api/users";

String ExpectedJsonResponse=new String(Files.readAllBytes(Paths.get("C:/Users/Saddam/Desktop/TipsTricks/Blackbox/src/main/resources/Expected.json")));

        Response getresponse=RestAssured.given()
                .header("content-type","application/json")
                .when()
                .get()
                .then()
                .extract().response();


        String actualJsonResponse=getresponse.asString();

//TO count the size of list:
int size=getresponse.body().path("data.size()");
        System.out.println("count of List: "+size);

//To print all the ids:
        System.out.println(getresponse.path("data.email").toString());

//To match expected JSON file
        JSONAssert.assertEquals(ExpectedJsonResponse,actualJsonResponse,true);
        System.out.println("completely Match");









    }


}
