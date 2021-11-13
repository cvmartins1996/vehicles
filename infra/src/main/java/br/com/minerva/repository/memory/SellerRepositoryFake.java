package br.com.minerva.repository.memory;

import br.com.minerva.seller.Seller;
import br.com.minerva.seller.repository.SellerRepository;

import java.util.ArrayList;
import java.util.List;

public class SellerRepositoryFake implements SellerRepository {

    private static List<Seller> sellers = new ArrayList<>();

    @Override
    public void create(Seller seller) {
        sellers.add(seller);
    }
}
