import io.restassured.response.Response;

import java.io.File;

import static io.restassured.RestAssured.given;

public class CleanUriApi {
        final static String CLEANURI_ULI = "/api/v1/shorten";
        public CleanUriApi(File file){
            this.fileUrlJson = file;
        }
        File fileUrlJson ;

        public Response sendUri(){
            return  given()
                    .header("Content-type", "application/json")
                    .and()
                    .body(fileUrlJson)
                    .when()
                    .post(CLEANURI_ULI);
        }

}
