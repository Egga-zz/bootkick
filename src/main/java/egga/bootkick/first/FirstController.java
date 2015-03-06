package egga.bootkick.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static java.util.UUID.randomUUID;

/**
 * @author egga
 */
@Controller
public class FirstController {

    @RequestMapping("/")
    @ResponseBody
    Dto home() {
        return new Dto(
                new UserDto(randomUUID(), "hank"),
                new AccountDto(randomUUID(), "premium")
        );
    }
}
