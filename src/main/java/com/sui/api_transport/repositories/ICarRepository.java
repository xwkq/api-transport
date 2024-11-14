package com.sui.api_transport.repositories;

import com.sui.api_transport.pojo.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarRepository extends JpaRepository<Car, Long> {

}
