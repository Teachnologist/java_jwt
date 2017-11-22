package com.jrest.JRest.service.impl;

import com.jrest.JRest.domain.RandomCity;
import com.jrest.JRest.domain.User;
import com.jrest.JRest.repository.RandomCityRepository;
import com.jrest.JRest.repository.UserRepository;
import com.jrest.JRest.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenericServiceImpl implements GenericService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RandomCityRepository randomCityRepository;

    @Override
    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers(){
        return (List<User>)userRepository.findAll();
    }

    @Override
    public List<RandomCity> findAllRandomCities(){
        return (List<RandomCity>)randomCityRepository.findAll();
    }
}
