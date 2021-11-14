package br.com.minerva.car;

import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void shouldCreateACar(){
        Car car = new Car(new Make("BMW"), "320i", 400000d, Year.of(2020));
        assertEquals("BMW", car.getMake());
    }


}
