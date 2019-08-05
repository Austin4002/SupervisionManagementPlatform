package service;

import org.springframework.stereotype.Service;
import pojo.User;

@Service
public interface UserService {
    int insert(User user);

    User selectByuserAccount(User user);
}
