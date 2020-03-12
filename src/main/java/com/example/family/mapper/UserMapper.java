package com.example.family.mapper;
import com.example.family.entity.User;
import org.apache.ibatis.annotations.Mapper;

/*
@description
@anther  Administrator
@creater 2020-03-10 15:06
*/
@Mapper
public interface UserMapper {
//
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(User record);
//
//    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

//    int updateByPrimaryKeySelective(User record);
//
//    int updateByPrimaryKey(User record);

    //通过用户名查找
    User selectByUsername(User record);
}
