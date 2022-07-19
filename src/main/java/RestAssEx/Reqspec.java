package RestAssEx;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reqspec {

  static RequestSpecification commspec(){

    RequestSpecBuilder builder=new RequestSpecBuilder();
    builder.setBaseUri("https://reqres.in/");
    builder.setBasePath("api/users");
    RequestSpecification requestspec=builder.build();
    return  requestspec;
  }





  static void testwithoutparam(){
    Response response= RestAssured
            .given()
            .spec(commspec())
            .when()
            .get();
  }

  static void testwithparam(){
    Response response=RestAssured
            .given()
            .spec(commspec())
            .queryParam("page","2")
            .when()
            .get();
  }


  public static void main(String[] args) throws IOException, JSONException {

    String ExpectedRespJson=new String(Files.readAllBytes(Paths.get("C:\\Users\\Saddam\\Desktop\\TipsTricks\\Blackbox\\src\\main\\resources\\Expected.json")));
    Response response=RestAssured
            .given()
            .header("content-type","application-html")
            .spec(commspec())
            .when()
            .get()
            .then()
            .extract().response();

    int size=response.getBody().path("data.size()");
    System.out.println(size);

    JSONAssert.assertEquals(ExpectedRespJson,response.asString(),true);
    System.out.println("Completely Match");





  }




}
