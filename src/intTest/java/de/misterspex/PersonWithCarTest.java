package de.misterspex;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonWithCarTest {
    @Test
    public void canConstructAPersonWithACar() {
	Car car = new Car("Audi");
        Person person = new Person("Leisure");
	person.setCar(car);
        assertEquals(car, person.getCar());	
        assertEquals(car.getName(), person.getCar().getName());	
    }
}
