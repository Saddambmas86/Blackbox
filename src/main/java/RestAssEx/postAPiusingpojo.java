package RestAssEx;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.testng.Assert;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class postAPiusingpojo {

    public static void main(String[] args) throws JSONException, IOException {


        EmployeePojo Ep=new EmployeePojo("Saddam","Testing",new String[]{"java","C"},"CEB","Saddam@test.com");

//        given()
//                .auth().none()
//                .header("Content-Type","application/json")
//                .contentType(ContentType.JSON)
//                .when()
//                .body(Ep).log().all()
//                .post("https://reqres.in/api/users")
//                .then().log().all()
//                .body("name",equalTo("Saddam"),
//                        "job",equalTo("Testing"),
//                        "skills[0]",equalTo("java"),
//                        "skills[1]",equalTo("C"),
//                        "details.companyName",equalTo("CEB"),
//                        "details.emailId",equalTo("Saddam@test.com"));
//



        Response postresponse=given()
                .auth().none()
                .header("Content-Type","application/json")
                .contentType(ContentType.JSON)
                .when()
                .body(Ep).log().all()
                .post("https://reqres.in/api/users");




        Assert.assertEquals(postresponse.getBody().path("name"),"Saddam");

Assert.assertEquals(postresponse.getBody().path("name"),"Saddam");

        
        
       // String requestEmployeeId = "2";
 String expectedJsonResponse = new String(Files.readAllBytes(Paths.get("C:/Users/Saddam/Desktop/TipsTricks/Blackbox/src/main/resources/Expected.json")));
        
        
  Response response=  given()
		 .header("Content-Type","application.json")
                .baseUri("https://reqres.in/api/users")
                .when()
                .get()
                .then()
                .extract()
                .response();
        
  String actualJsonResponse=response.asString();

  
  //Count of list
  int size=response.body().path("data.size()");
  System.out.println("Number of Ids: "+size);
  //number of emp:
  
        System.out.println(actualJsonResponse);
        
        //Match the actual and expected response
        JSONAssert.assertEquals(expectedJsonResponse, actualJsonResponse, true);
        System.out.println("completely match");


    }


}
