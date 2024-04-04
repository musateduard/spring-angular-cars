package com.carparts.backend.cars;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


/** this is the car controller that includes methods for processing requests
 * for the cars component. */
@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="/api/cars")
public class CarController {

    @Autowired
    private CarService carService;


    @GetMapping
    public ResponseEntity<List<Car>> getAllCars() {
        List<Car> carList = carService.getAllCars();
        return ResponseEntity.ok(carList);}


//    @GetMapping(value="/ladas")
//    public List<Car> getLada(String name) {
//        List<Car> ladaList = carService.getLada("lada");
//        return ladaList;}


    @PostMapping
    public ResponseEntity<Car> createCar(@RequestBody Car requestBody) {
        Car createdCar = carService.createCar(requestBody);
        return ResponseEntity.ok(createdCar);}


    @DeleteMapping(value="/{carId}")
    public ResponseEntity<Void> deleteCar(@PathVariable Long carId) {
        // todo: add error handling if car id not found
        carService.deleteCar(carId);
        return ResponseEntity.noContent().build();}
}