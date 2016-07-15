package example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/info")
    public Response<JsonUser> info() {
        JsonUser user = new JsonUser(1, "demo", "demo@mail.com");
        return new Response<>(null, user);
    }
}
