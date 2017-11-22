package com.jrest.JRest.repository;

import com.jrest.JRest.domain.RandomCity;
import org.springframework.data.repository.CrudRepository;

public interface RandomCityRepository extends CrudRepository<RandomCity, Long> {
}
