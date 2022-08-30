import static io.restassured.RestAssured.*; //haciendo el import statick y agregando el * al final hacems que no sea necesario llamar al RestAssured en los metodos
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Demo {

    @Test
    public void testPostUsers(){
        baseURI = "http://reqres.in/api";
// Validar peticion Post
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "Alejandra");
        map.put("job", "Customer Success");


                given()
                    .log().all()
                    .body(map.toString())
                .when()
                    .post("/users")
                .then()
                    .log().all()
                    .statusCode(301);



//    public void testGetUsers(){
//        baseURI = "http://reqres.in/api";
//// Validar peticion get
//        String body = given()
//                    .when()
//                        .get("/users")
//                    .then()
//                        .statusCode(200)
//                    .body("data[1].first_name", equalTo("Janet"))
//                        .extract().body().asString();
//
//        System.out.println(body);
//
//        // Validar peticion Post
//

    }
}
