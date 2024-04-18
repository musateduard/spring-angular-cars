package com.carparts.backend.cars;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
@Table(name = "cars", schema = "main")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255, nullable = false)
    private String name;

    @Column(length = 255, nullable = false)
    private String color;

    @Column(nullable = false)
    private Integer year;

    @Column(nullable = false)
    private Integer horsepower;

    @Column(nullable = false)
    private Integer mileage;

//     todo: mark field as reference to Owners table
//     private Long current_owner;

    public Car(String name, String color, Integer year, Integer horsepower, Integer mileage) {

        this.name = name;
        this.color = color;
        this.year = year;
        this.horsepower = horsepower;
        this.mileage = mileage;

        return;}

    public Car() {}

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public Integer getYear() {return year;}

    public void setYear(Integer year) {this.year = year;}

    public Integer getHorsepower() {return horsepower;}

    public void setHorsepower(Integer horsepower) {this.horsepower = horsepower;}

    public Integer getMileage() {return mileage;}

    public void setMileage(Integer mileage) {this.mileage = mileage;}

    @Override
    public String toString() {
        String carString = "Car [id=%d, name=%s, color=%s, year=%d, horsepower=%d, mileage=%d]".formatted(id, name, color, year, horsepower, mileage);
        return carString;}
}