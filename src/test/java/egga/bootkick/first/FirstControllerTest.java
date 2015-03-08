package egga.bootkick.first;

import egga.bootkick.configuration.MainConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
 * @author egga
 */
@RunWith(SpringJUnit4ClassRunner.class)
@IntegrationTest
@SpringApplicationConfiguration(classes = MainConfiguration.class)
@WebAppConfiguration
public class FirstControllerTest {

    @Test
    public void testName() throws Exception {
        get("/api/").then().body("user.name", is(equalTo("hank")));
    }
}
