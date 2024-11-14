package com.sui.api_transport.controllers;

import com.sui.api_transport.interfaces.ICarService;
import com.sui.api_transport.pojo.Car;
import com.sui.api_transport.routing.ApiPath;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = ApiPath.API_PATH + ApiPath.CAR_CONTROLLER_PATH)
public class CarController {
    private ICarService carService;

    @GetMapping("/cars")
    public List<Car> cars(){
        return null;
    }

    @GetMapping("/car/{id}")
    public Car car(@PathVariable("id") String id){
        return null;
    }

    @PostMapping("/car")
    public ResponseEntity<Car> create(@RequestBody Car car){
        return null;
    }

    @PutMapping("/car/{id}")
    public ResponseEntity<Car> update(@PathVariable("id") String id){
        return null;
    }

    @DeleteMapping("/car/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") String id){
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
