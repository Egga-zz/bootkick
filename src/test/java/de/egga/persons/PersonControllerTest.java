package de.egga.persons;

import de.egga.configuration.MainConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * @author egga
 */
@RunWith(SpringJUnit4ClassRunner.class)
@IntegrationTest
@SpringApplicationConfiguration(classes = MainConfiguration.class)
@WebAppConfiguration
public class PersonControllerTest {

    @Test
    public void it_should_return_persons() throws Exception {
        get("/api/persons/").then().statusCode(200);
    }

    @Test
    public void it_should_return_person() throws Exception {
        get("/api/persons/123").then().statusCode(200);
    }

    @Test
    public void it_should_add_person() throws Exception {
        Person person = randomPerson();
        given()
                .body(person)
                .header("Content-Type", APPLICATION_JSON_VALUE)

                .put("/api/persons/123")

                .then()
                .statusCode(204);
    }

    @Test
    public void it_should_delete_persons() throws Exception {
        delete("/api/persons/123").then().statusCode(204);
    }


    private Person randomPerson() {
        Person person = new Person();
        person.setId("123");
        person.setName("Hank");
        person.setPhone("+555123456");
        return person;
    }
}
