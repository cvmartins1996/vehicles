package br.com.minerva.seller.usecase.dto;

public class CreateSellerOutput {

    private final String email;
    private final String status;

    public CreateSellerOutput(String email, String status){
        this.email = email;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getEmail() {
        return email;
    }
}
