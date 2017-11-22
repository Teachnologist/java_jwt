package com.jrest.JRest.repository;

import com.jrest.JRest.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends CrudRepository<User, Long> {
        User findByUsername(String username);
        }
