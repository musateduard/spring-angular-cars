package com.carparts.backend.cars;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;


    public List<Car> getAllCars() {

        System.out.println("getting all cars");
        List<Car> carList = carRepository.findAll();

        return carList;}


//    public List<Car> getLada(String name) {
//
//        System.out.println("getting lada");
//        List<Car> ladas = carRepository.findByName(name);
//
//        return ladas;}


    public Car createCar(Car carObject) {

        System.out.println("validating data");

        // very complicated "business" logic
        if (carObject.getName().equals("dacia")) {
            System.out.println("creating dacia");}

        else {
            System.out.println("creating other car");}

        Car response = carRepository.save(carObject);

        return response;}


    public void deleteCar(Long carId) {
        // todo: throw exception if car id not found
        System.out.println("deleting car id: %d".formatted(carId));
        carRepository.deleteById(carId);
        return;}
}