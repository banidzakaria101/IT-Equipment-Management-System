package Controller;

import Services.UserService;
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

    @DeleteMapping(name = "/delete")
    public void deleteUser(@RequestBody User user){
        userService.deleteUser(user);
    }

    @GetMapping(name = "/by-name")
    public User getUser(@RequestBody User user){
        return userService.findUserByName(user);
    }

    @GetMapping(name = "all-users")
    public List<User> getAllUsers(){
        return userService.listAllUsers();
    }
}
