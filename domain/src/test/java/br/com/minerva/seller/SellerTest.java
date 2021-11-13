package br.com.minerva.seller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SellerTest {

    @Test
    public void shouldCreateSeller(){
        Seller seller = new Seller(new Name("Vendedor", "Melhor"), new Email("vender@melhor.com"), new CellPhone("13", "987146789"));
        assertEquals("Vendedor Melhor", seller.getName());
        assertEquals("vender@melhor.com", seller.getEmail());
        assertEquals("13987146789", seller.getCellPhone());
    }

}
