package br.com.minerva.car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MakeTest {

    @Test
    public void shouldCreateAValidMake(){
        Make make = new Make("Audi");
        assertEquals("Audi", make.getName());
    }

    @Test
    public void shouldThrowsErrorWhenCreateAnInvalidCar(){
        assertThrows(IllegalArgumentException.class, () -> new Make(""));
    }
}
