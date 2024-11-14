package com.sui.api_transport.interfaces;

import com.sui.api_transport.pojo.Car;

import java.util.List;

public interface ICarService {
    Car create(Car car);
    Car update(String id, Car car);
    void delete(String id);
    List<Car> cars();
    Car findCar(String id);
}
