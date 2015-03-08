package de.egga.first;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.util.UUID.randomUUID;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author egga
 */
@RestController
public class FirstController {

    @RequestMapping(value = "/api/first/", method = GET , produces = APPLICATION_JSON_VALUE)
    Dto home() {
        return new Dto(
                new UserDto(randomUUID(), "hank"),
                new AccountDto(randomUUID(), "premium")
        );
    }
}
