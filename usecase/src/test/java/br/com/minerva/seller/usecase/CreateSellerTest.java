package br.com.minerva.seller.usecase;

import br.com.minerva.repository.memory.SellerRepositoryFake;
import br.com.minerva.seller.usecase.dto.CreateSellerInput;
import br.com.minerva.seller.usecase.dto.CreateSellerOutput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateSellerTest {


    @Test
    public void shouldCreateSeller(){
        CreateSeller createSeller = new CreateSeller(new SellerRepositoryFake());
        CreateSellerOutput output = createSeller.execute(new CreateSellerInput("Vendedor",
                                                                                "Melhor",
                                                                                "melhor@vendedor.com",
                                                                        "13", "987456123"));
        assertEquals("OK", output.getStatus());
    }

}
