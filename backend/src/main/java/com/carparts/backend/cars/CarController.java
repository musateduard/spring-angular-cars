package com.carparts.backend.cars;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="/api")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public List<Car> getCars() {
        return carService.getCars();}

    @GetMapping("/ladas")
    public List<Car> getLada(String name) {
        return carService.getLada("lada");}}
