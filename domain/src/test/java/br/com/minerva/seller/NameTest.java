package br.com.minerva.seller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameTest {

    @Test
    public void shouldCreateSeller(){
        Name name = new Name("Xpto", "Fulano");
        Assertions.assertEquals("Xpto Fulano", name.getFullName());
    }

    @Test
    public void shouldThrowsErrorWhenNotFilledFirstName(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Name("", "Fulano"));
    }

    @Test
    public void shouldThrowsErrorWhenNotFilledLastName(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Name("Fulano", null));
    }

}
