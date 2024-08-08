package controller;

import services.UserService;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(name = "/add")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }


}
