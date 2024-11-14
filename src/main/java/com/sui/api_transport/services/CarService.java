package com.sui.api_transport.services;

import com.sui.api_transport.interfaces.ICarService;
import com.sui.api_transport.pojo.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements ICarService {
    /**
     * @param car
     * @return
     */
    @Override
    public Car create(Car car) {
        return null;
    }

    /**
     * @param id
     * @param car
     * @return
     */
    @Override
    public Car update(String id, Car car) {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void delete(String id) {

    }

    /**
     * @return
     */
    @Override
    public List<Car> cars() {
        return List.of();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Car findCar(String id) {
        return null;
    }
}
