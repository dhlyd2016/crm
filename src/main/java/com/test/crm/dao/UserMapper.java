package com.test.crm.dao;

import com.test.crm.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 根据用户名密码查用户
     * @param user
     * @return
     */
    @Select("select * from tbl_user where tbl_user.loginAct = #{user.loginAct} and tbl_user.loginPwd = #{user.loginPwd} ")
    User findUserByUserName(@Param("user") User user);
}