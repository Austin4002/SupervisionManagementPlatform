package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pojo.Result;
import pojo.User;
import service.UserService;

@RequestMapping("/")
@RestController
public class UserControl {
	@Autowired
	private UserService userService;

	// 注册
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public Object userIndex(User user) {
		userService.insert(user);
		return new Result<>();
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Object userLogin(String userAccount, String userPassword) {
		User user = userService.selectByuserAccount(userAccount);
		Result result = new Result(-1, "错误");
		if (user.getUserPassword().equals(userPassword)) {
			result = new Result<>();
		}
		return result;
	}

}
