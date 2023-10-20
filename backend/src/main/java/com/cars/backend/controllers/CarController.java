package com.cars.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.backend.models.Car;
import com.cars.backend.services.CarService;


@RestController
@RequestMapping(path="/api")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public List<Car> getCars() {
        return carService.getCars();}

    @GetMapping("/lada")
    public List<Car> getLada(String name) {
        return carService.getLada("lada");}}
