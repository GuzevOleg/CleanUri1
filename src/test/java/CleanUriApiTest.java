import io.restassured.RestAssured;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.File;

public class CleanUriApiTest {

        File url = new File("target/classes/File.json");

        @BeforeEach
        public void setUp() {
            RestAssured.baseURI = "https://cleanuri.com";

        }
        @Test
        public void sendUrlTest(){
            CleanUriApi cleanuriApi = new CleanUriApi(url);
            cleanuriApi.sendUri()
                    .then().statusCode(200);
        }



}
