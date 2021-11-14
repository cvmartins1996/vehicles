package br.com.minerva;

import br.com.minerva.repository.memory.SellerRepositoryFake;
import br.com.minerva.seller.usecase.CreateSeller;
import br.com.minerva.seller.usecase.dto.CreateSellerInput;
import br.com.minerva.seller.usecase.dto.CreateSellerOutput;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/sellers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SellerResource {

    @POST
    public CreateSellerOutput create(SellerDTO sellerDTO) {
        CreateSeller createSeller = new CreateSeller(new SellerRepositoryFake());
        CreateSellerInput createSellerInput = new CreateSellerInput(sellerDTO.getFirstName(),
                                                                    sellerDTO.getLastName(),
                                                                    sellerDTO.getEmail(),
                                                                    sellerDTO.getAreaCode(),
                                                                    sellerDTO.getPhoneNumber());
        CreateSellerOutput output = createSeller.execute(createSellerInput);
        return output;
    }
}