package com.ddabadi.backoffice.service.impl;

import com.ddabadi.backoffice.domain.UserLogin;
import com.ddabadi.backoffice.repository.UserLoginRepository;
import com.ddabadi.backoffice.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements CustomService<UserLogin> {

    @Autowired
    private UserLoginRepository repository;

    @Override
    public UserLogin findById(Integer id) {
        return repository.getOne(id);
    }

    @Override
    public List<UserLogin> findAll() {
        return null;
    }

    public UserLogin findByNameAndPassword(String userName, String password){
        Optional<UserLogin> userLoginOptional = repository.findByUserNameAndPassword(userName, password);
        return ( (userLoginOptional.isPresent() ) ? userLoginOptional.get() : new UserLogin() );
    }

}
