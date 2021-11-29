import io.restassured.internal.RestAssuredResponseOptionsGroovyImpl;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import  static org.hamcrest.Matchers.*;

public class CreatePerStoreAPiArray {


    @Test
    public void TestCreatePerStoreAPiArray() {
        CreatePetStoreApi userDetails = new CreatePetStoreApi();
        userDetails.setUserStatus(10);
        userDetails.setUsername("Manasa");
        userDetails.setFirstname("manasakk");
        userDetails.setLastname("kk");
        userDetails.setEmail("manasakk15@yahoo.com");
        userDetails.setPassword("12334");
        userDetails.setPhone("444444");

        given().
                contentType("application/json").
                body(userDetails).
                log().body().
                when().
                post("https://petstore.swagger.io/v2/user").
                then().
                assertThat().
                statusCode(200);


    }

    @Test
    public void TestCreatePerStoreAPiArray1() {

        CreatePetStoreApi userDetails1 = new CreatePetStoreApi();
        ArrayList<CreatePetStoreApi> userDetails = new ArrayList<CreatePetStoreApi>();
        userDetails1.setId(1);
        userDetails1.setUsername("Manasa");
        userDetails1.setFirstname("Manasa");
        userDetails1.setLastname("kk");
        userDetails1.setPhone("33434343");
        userDetails1.setEmail("manasakk15@yahoo.com");
        userDetails1.setPassword("123456");
        userDetails1.setUserStatus(10);
        userDetails.add(userDetails1);

        userDetails1.setId(2);
        userDetails1.setUsername("test");
        userDetails1.setFirstname("test");
        userDetails1.setLastname("kk");
        userDetails1.setPhone("33434343");
        userDetails1.setEmail("test@yahoo.com");
        userDetails1.setPassword("1234568");
        userDetails1.setUserStatus(20);
        userDetails.add(userDetails1);
        userDetails.add(userDetails1);

        given().
                contentType("application/json").
                body(userDetails).
                log().body().
                when().
                post("https://petstore.swagger.io/#/user/createUsersWithArrayInput").
                then().
                assertThat().
                statusCode(200);
    }
}







