package com.example.family.service;

import com.example.family.entity.User;
import com.example.family.utils.JsonWrite;

/*
@description
@anther  Administrator
@creater 2020-03-10 15:03
*/
public interface IUserSearch {
    //根据用户名去查询用户信息
    JsonWrite selectUserByUsername(User user);
}
