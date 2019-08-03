package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pojo.Result;
import pojo.User;
import service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	// 注册
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public Object userIndex(User user) {
		int i = userService.insert(user);
		Result rs = new Result<>();
		if(i>0) {
			rs.setCode(200);
			rs.setMsg("OK");
		}else {
			rs.setCode(-1);
			rs.setMsg("注册失败");
			
		}
		return rs;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Object userLogin(String userAccount, String userPassword,String userType) {
		User user = userService.selectByuserAccount(userAccount,userType);
		Result result = new Result(-1, "错误");
		if (user.getUserPassword().equals(userPassword)) {
			result = new Result<>();
		}
		return result;
	}

}
