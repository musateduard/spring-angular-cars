package com.cars.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.backend.models.Car;
import com.cars.backend.repositories.CarRepository;


@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;


    public List<Car> getCars() {

        System.out.println("getting cars");
        List<Car> cars = carRepository.findAll();

        return cars;}


    public List<Car> getLada(String name) {

        System.out.println("getting lada");
        List<Car> lada = carRepository.findByName(name);

        return lada;}}
