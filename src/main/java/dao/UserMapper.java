<<<<<<< HEAD
package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import pojo.User;
import pojo.UserExample;

=======
package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import pojo.User;
import pojo.UserExample;

>>>>>>> branch 'master' of https://github.com/Austin4002/SupervisionManagementPlatform
public interface UserMapper {
    User selectByuserAccount(User user);

    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}