package com.clean.code.springboot.service;

import com.clean.code.springboot.model.Car;
import com.clean.code.springboot.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CarService  {
    @Autowired
    CarRepository carRepository;

    public Car save(Car car){
        Car car1 = carRepository.save(car);
        return car1;
    }

    public   Car findByid(Integer id){
        Car car = carRepository.findByid(id);
        return car;
    }
    public Car findByname(String name) {
        Car car = (Car) carRepository.findByName(name);
        return car;
    }

    public List<Car> getAll(){
        List<Car>carList = carRepository.findAll();
        return carList;
    }

    public Car update(Car car){
        Car car1 = carRepository.save(car);
        car1.setId(car.getId());
        car1.setPlate(car.getPlate());
        car1.setModel(car.getModel());
        car1.setColor(car.getColor());
        return car1;
    }

    public void  delete(Car car){
        carRepository.delete(car);
    }











}
