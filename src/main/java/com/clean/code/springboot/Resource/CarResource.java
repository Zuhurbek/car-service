package com.clean.code.springboot.Resource;

import com.clean.code.springboot.model.Car;
import com.clean.code.springboot.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/car")
public class CarResource {

    private final Logger log = LoggerFactory.getLogger(Resource.class);

    @Autowired
    CarService carService;

    @PostMapping("/create")
    public Car create(@RequestBody Car car){
        log.info("the create method was used");
        Car car1 = carService.save(car);
        return  car1;
    }
    @GetMapping("/getbyid/{id}")
    public ResponseEntity getbyid(@PathVariable (value = "id") Integer id){
        log.info("the getbyid method was used");
        Car car = carService.findByid(id);
        return ResponseEntity.ok(car);
    }
    @GetMapping("/getbyname/{name}")
    public  ResponseEntity getbyname(@PathVariable (value = "model") String model){
        log.info("the getbyid method was used");
        Car car = carService.findByname(model);
        return ResponseEntity.ok(car);
    }
    @GetMapping("/getall")
    public List<Car> getAll(){
        List<Car> carList = carService.getAll();
        return carList;
    }

    @PutMapping("/update")
    public  Car update(@RequestBody Car car){
        Car car1 = carService.update(car);
        return car1;

    }

    @DeleteMapping("delete{id}")
    public  ResponseEntity delete(@PathVariable Integer id){
        carService.delete(carService.findByid(id));
        return  ResponseEntity.ok("Car removed ");
    }

}
