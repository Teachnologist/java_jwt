package com.jrest.JRest.service;

import com.jrest.JRest.domain.RandomCity;
import com.jrest.JRest.domain.User;

import java.util.List;

public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}
