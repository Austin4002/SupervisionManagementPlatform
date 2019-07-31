package test;

import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.UserMapper;
import pojo.User;
import pojo.UserExample;
import pojo.UserExample.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo {

	@Autowired
	private UserMapper userMapper;
	
	
	public void test1() {
		User user = new User();
		user.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
		user.setUserAccount("张三");
		user.setUserPassword("123465");
		user.setUserType("个人");
		userMapper.insert(user);
	}
	
	@Test
	public void test2() {
		UserExample ue = new UserExample();
		Criteria criteria = ue.createCriteria();
		criteria.andUserAccountEqualTo("张三");
		List<User> list = userMapper.selectByExample(ue);
		System.out.println(list);
	}
}
