package main.pojos;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;


public class Car {

    private String name;
    private int age;
    private Color color;
    private List<String> properties;
    private boolean isOkayToAbroad;
    private Optional<List<String>> countryName;

    public Car(String name, int age, Color color, List<String> properties,boolean isOkayToAbroad) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.properties = properties;
        this.isOkayToAbroad=isOkayToAbroad;
        if(this.isOkayToAbroad==true)
        {
            countryName=Optional.of(new ArrayList<>());
        }
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    public boolean isOkayToAbroad() {
        return isOkayToAbroad;
    }

    public void setOkayToAbroad(boolean okayToAbroad) {
        isOkayToAbroad = okayToAbroad;
    }

    public Optional<List<String>> getCountryName() {
        return countryName;
    }

    public void setCountryName(Optional<List<String>> countryName) {
        if(this.isOkayToAbroad())
            this.countryName = countryName;
        else
            this.countryName=null;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color=" + color +
                ", properties=" + properties +
                '}';
    }
}
