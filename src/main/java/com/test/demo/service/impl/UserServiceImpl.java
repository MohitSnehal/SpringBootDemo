package com.test.demo.service.impl;

import com.test.demo.model.UserModel;
import com.test.demo.repository.UserRepository;
import com.test.demo.response.UserResponse;
import com.test.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.OptionalInt;

@Service
public class UserServiceImpl implements UserService {

    private Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponse findUserById(Long id) throws Exception{
        LOGGER.debug("started findUserById : {} " , id);
        Optional<UserModel> userModel = userRepository.findById(id);
        if(userModel.isPresent()){
            return UserResponse.from(userModel.get()) ;
        }
        //since nothing was found for the specified userId we throw InvalidRequestException status code : 400
        throw new Exception("Found no matching values for userId : " + id);
    }
}
