package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pojo.Result;
import pojo.User;
import service.UserService;

import java.util.Optional;

@RequestMapping("/")
@RestController
public class UserControl {
    @Autowired
    private UserService userService;

    // 注册
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Object userIndex(@RequestBody User user) {
        userService.insert(user);
        return new Result<>();
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object userLogin(@RequestBody User user) {
        user = userService.selectByuserAccount(user);
        Optional.ofNullable(user).orElseThrow(RuntimeException::new);
        return new Result<>();
    }

}
