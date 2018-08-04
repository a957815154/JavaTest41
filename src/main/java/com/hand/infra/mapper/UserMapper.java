package com.hand.infra.mapper;

import com.hand.domain.entity.UserE;

public interface UserMapper {
    void insertUser(UserE userE );
    void deleteUser(int id );
    UserE queryUser(int id );
    void updateUser(UserE userE );
}
