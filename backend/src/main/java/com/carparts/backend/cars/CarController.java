package com.carparts.backend.cars;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


/** this is the car controller that includes methods for processing requests
 * for the cars component. */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/cars")
public class CarController {

    @Autowired
    private CarService carService;


    @PostMapping
    public ResponseEntity<Car> createCar(@RequestBody Car requestBody) {
        Car createdCar = carService.createCar(requestBody);
        return ResponseEntity.ok(createdCar);}


    @GetMapping
    public ResponseEntity<List<Car>> getAllCars() {
        List<Car> carList = carService.getAllCars();
        return ResponseEntity.ok(carList);}


    @GetMapping(value = "/{carId}")
    public ResponseEntity<Car> getById(@PathVariable Long carId) {
        Car carResponse = carService.getCarById(carId);
        return ResponseEntity.ok(carResponse);}


    @PutMapping(value = "/{carId}")
    public ResponseEntity<Car> updateCar(
        @PathVariable Long carId,
        @RequestBody Car requestBody) {

        Car response = carService.updateCar(carId, requestBody);
        return ResponseEntity.ok(response);}


    @DeleteMapping(value = "/{carId}")
    public ResponseEntity<Void> deleteCar(@PathVariable Long carId) {
        carService.deleteCar(carId);
        return ResponseEntity.noContent().build();}
}