package service.impl;

import dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;
import service.UserService;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public int insert(User user) {
        user.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
        return userMapper.insert(user);
    }

    public User selectByuserAccount(User user) {
        return userMapper.selectByuserAccount(user);
    }
}