package RestAssEx;

import io.restassured.response.Response;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

public class Rest3 {

    public static void main(String[] args) {


        Response getresponse= given()
        .param("page","3")
        .auth().none()
       .when().get("https://reqres.in/api/users");
//                 .then()
//                 .statusCode(200).body("page",equalTo(3));
//

        System.out.println(getresponse.getTime());
        System.out.println(getresponse.getTimeIn(TimeUnit.SECONDS));
        System.out.println(getresponse.time());
        System.out.println(getresponse.timeIn(TimeUnit.SECONDS));




    }

}
