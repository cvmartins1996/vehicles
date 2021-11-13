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
public class SellerResource {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String create(CreateSellerInput createSellerInput) {
        CreateSeller createSeller = new CreateSeller(new SellerRepositoryFake());
        CreateSellerOutput output = createSeller.execute(createSellerInput);
        return output.getStatus();
    }
}