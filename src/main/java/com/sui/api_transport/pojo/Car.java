package com.sui.api_transport.pojo;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "car")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String brand;

    @Column
    private String model;

    @Column
    private int year;

    @Column
    private String matriculation;
}
