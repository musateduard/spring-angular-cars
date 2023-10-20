package com.cars.backend.models;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
@Table(name="car")
public class Car {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="color")
    private String color;

    @Column(name="year")
    private Integer year;

    Car() {}

    Car(String name, String color, Integer year) {
        this.name = name;
        this.color = color;
        this.year = year;
        return;}

    public long getId() {
        return this.id;}

    public String getName() {
        return this.name;}

    public void setName(String name) {
        this.name = name;}

    public String getColor() {
        return this.color;}

    public void setColor(String color) {
        this.color = color;}

    public Integer getYear() {
        return this.year;}

    public void setYear(Integer year) {
        this.year = year;}

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", color='" + getColor() + "'" +
            ", year='" + getYear() + "'" +
            "}";}}
