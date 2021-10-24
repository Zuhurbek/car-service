package com.clean.code.springboot.repository;


import com.clean.code.springboot.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findByName(String name);

    List<Car> findByNameAndLastname(String name, String lastname);

    void delete(Car car);

    Car findByid(Integer id);
}
