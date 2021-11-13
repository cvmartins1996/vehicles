package br.com.minerva.seller.usecase;

import br.com.minerva.seller.CellPhone;
import br.com.minerva.seller.Email;
import br.com.minerva.seller.Name;
import br.com.minerva.seller.Seller;
import br.com.minerva.seller.repository.SellerRepository;
import br.com.minerva.seller.usecase.dto.CreateSellerInput;
import br.com.minerva.seller.usecase.dto.CreateSellerOutput;

public class CreateSeller {
    private final SellerRepository repository;

    public CreateSeller(SellerRepository repository) {
        this.repository = repository;
    }

    public CreateSellerOutput execute(CreateSellerInput createSellerInput){
        try{
            Name name = new Name(createSellerInput.getFirstName(), createSellerInput.getLastName());
            Seller seller = new Seller(name,    new Email(createSellerInput.getEmail()),
                                                new CellPhone(createSellerInput.getAreaCode(), createSellerInput.getCellPhone()));
            repository.create(seller);
            return new CreateSellerOutput(createSellerInput.getEmail(), "OK");
        }catch (Exception e){
            return new CreateSellerOutput(createSellerInput.getEmail(), "ERROR");
        }

    }


}
