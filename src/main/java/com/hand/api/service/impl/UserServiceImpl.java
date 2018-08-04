package com.hand.api.service.impl;

import com.hand.api.service.UserService;
import com.hand.domain.entity.UserE;
import com.hand.infra.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public void insertUser(UserE userE) {
        System.out.println(1);
        userMapper.insertUser(userE);
    }

    @Override
    public UserE queryUser(int id) {
        return userMapper.queryUser(id);
    }

    @Override
    public void deleteUser(int id) {
        userMapper.deleteUser(id);
    }

    @Override
    public void updateUser(UserE userE) {
        userMapper.updateUser(userE);
    }
}
