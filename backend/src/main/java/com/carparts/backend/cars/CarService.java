package com.carparts.backend.cars;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


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
        List<Car> ladas = carRepository.findByName(name);

        return ladas;}}
