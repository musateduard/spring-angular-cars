package com.cars.backend.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cars.backend.models.Car;


@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findByName(String name);
    List<Car> findByYear(Integer year);}
