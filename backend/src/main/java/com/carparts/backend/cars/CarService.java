package com.carparts.backend.cars;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.server.ResponseStatusException;


@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;


    public Car createCar(Car carObject) {

        System.out.println("validating data");

        if (carObject.getName().equals("dacia")) {
            System.out.println("creating dacia");}

        else {
            System.out.println("creating car");}

        Car response = carRepository.save(carObject);

        return response;}


    public List<Car> getAllCars() {

        System.out.println("getting all cars");
        List<Car> carList = carRepository.findAll();

        return carList;}


    public Car getCarById(Long carId) throws ResponseStatusException {

        System.out.println("getting car: %d".formatted(carId));
        Car car = carRepository.findById(carId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        return car;}


    public Car updateCar(Long carId, Car requestBody) throws ResponseStatusException {

        System.out.println("updating car: %d".formatted(carId));

        // check if car exists
        Car carToUpdate = carRepository.findById(carId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        // update fields of old car with request body
        if (requestBody.getName() != null) {carToUpdate.setName(requestBody.getName());}
        if (requestBody.getYear() != null) {carToUpdate.setYear(requestBody.getYear());}
        if (requestBody.getColor() != null) {carToUpdate.setColor(requestBody.getColor());}

        // save car to database
        Car response = carRepository.save(carToUpdate);

        return response;}


    public void deleteCar(Long carId) throws ResponseStatusException {

        System.out.println("deleting car: %d".formatted(carId));
        carRepository.findById(carId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        carRepository.deleteById(carId);

        return;}
}