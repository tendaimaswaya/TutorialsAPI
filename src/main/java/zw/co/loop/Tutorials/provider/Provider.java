package zw.co.loop.Tutorials.provider;

import org.springframework.web.bind.annotation.*;
import zw.co.loop.Tutorials.data.Data;
import zw.co.loop.Tutorials.model.User;

import java.util.ArrayList;

@RestController
public class Provider {
    @RequestMapping("/users")
    public ArrayList<User> users() {
        return new Data().getUsers();
    }

    @RequestMapping("/login")
    public User getUserById(@RequestParam(value="id", defaultValue="") String id,
                            @RequestParam(value="password", defaultValue="") String password) {
        return new Data().login(id,password);
    }

    @RequestMapping("/userId")
    public User getUserById(@RequestParam(value="v", defaultValue="0") String id) {
        return new Data().getUserById(id);
    }

    @RequestMapping("/userName")
    public ArrayList<User> getUserByName(@RequestParam(value="v", defaultValue="") String name) {
        return new Data().getUserByName(name);
    }
}