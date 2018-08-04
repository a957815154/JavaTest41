package com.hand.api.service;

import com.hand.domain.entity.UserE;

public interface UserService {

    void insertUser(UserE userE);


    void deleteUser(int id);


    UserE queryUser(int id);


    void updateUser(UserE userE);

}
