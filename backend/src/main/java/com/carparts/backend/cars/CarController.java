package com.carparts.backend.cars;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


/** this is the car controller that includes methods for processing requests
 * for the cars component. */
@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="/api")
public class CarController {

    @Autowired
    private CarService carService;


    @GetMapping(value="/cars")
    public List<Car> getCars() {
        List<Car> carList = carService.getCars();
        return carList;}


    @GetMapping(value="/ladas")
    public List<Car> getLada(String name) {
        List<Car> ladaList = carService.getLada("lada");
        return ladaList;}


    @PostMapping(value="/cars")
    public List<Car> createCar(@RequestBody Car requestBody) {

        System.out.println("adding new car");
        System.out.println(requestBody);
        Car car = new Car(requestBody.getName(), requestBody.getColor(), requestBody.getYear());

        List<Car> createdCar = carService.createCar(requestBody);

        return createdCar;}
}
