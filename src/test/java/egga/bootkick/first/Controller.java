package egga.bootkick.first;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
 * @author egga
 */
public class Controller {

    @Test
    public void testName() throws Exception {
        get("/").then().body("user.name", is(equalTo("hank")));
    }
}
