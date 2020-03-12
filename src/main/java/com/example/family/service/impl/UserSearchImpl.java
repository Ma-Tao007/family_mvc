package com.example.family.service.impl;

import com.example.family.entity.User;
import com.example.family.mapper.UserMapper;
import com.example.family.service.IUserSearch;
import com.example.family.utils.JsonWrite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/*
@description
@anther  Administrator
@creater 2020-03-10 15:04
*/
@Service
public class UserSearchImpl implements IUserSearch {
    @Resource
    private UserMapper userMapper;
    @Override
    public JsonWrite selectUserByUsername(User user) {
        //由于不需要操作数据库，所以在这里执行查询操作
        User selUser = userMapper.selectByUsername(user);
        //验证信息
        if(null == selUser){
            return JsonWrite.CUSTOMIZE("401",false,"用户名不存在");
        }else if(!selUser.getPassword().equals(user.getPassword())){
            return JsonWrite.CUSTOMIZE("401",false,"密码错误");
        }else{
            return JsonWrite.CUSTOMIZE("200",true,"登陆成功");
        }
    }
}
