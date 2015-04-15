package de.misterspex;

public class Person {
    private final String name;
    private Car car;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCar(Car car){
	this.car = car;
    }

    public Car getCar(){
	return car;
    }
}
