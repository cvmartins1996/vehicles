package br.com.minerva.seller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellPhoneTest {

    @Test
    public void shouldCreateAValidCellPhoneNumber(){
        CellPhone cellPhone = new CellPhone("13", "987146789");
        assertEquals("13", cellPhone.getAreaCode());
        assertEquals("987146789", cellPhone.getNumber());
    }

}
