package com.clean.code.springboot.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public
class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "plate")
    private String plate;

    @Column(name = "model")
    private String model;
    @Column(name = "color")
    private String color;

    public Car(Integer id, String concern, String name, String model) {
        this.id = id;
        this.plate = plate;
        this.model = model;
        this.color = color;
    }

    public Car() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


