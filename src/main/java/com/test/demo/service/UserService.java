package com.test.demo.service;

import com.test.demo.response.UserResponse;

public interface UserService {

    UserResponse findUserById(Long id) throws Exception;
}
