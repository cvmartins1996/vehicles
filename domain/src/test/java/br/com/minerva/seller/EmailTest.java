package br.com.minerva.seller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmailTest {

    @Test
    public void shouldCreateAValidEmail(){
        Email email = new Email("xpto@xpto.com.br");
        assertEquals("xpto@xpto.com.br", email.getAddress());
    }

    @Test
    public void shouldThrowsErrorForInvalidEmail(){
        assertThrows(IllegalArgumentException.class, () -> new Email("trezze.@..."));
    }
}
