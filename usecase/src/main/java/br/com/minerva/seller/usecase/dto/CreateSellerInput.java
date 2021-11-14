package br.com.minerva.seller.usecase.dto;

import br.com.minerva.seller.usecase.CreateSeller;

public class CreateSellerInput {

    private String firstName;
    private String lastName;
    private String email;
    private String areaCode;
    private String cellPhone;


    public CreateSellerInput(String firstName, String lastName, String email, String areaCode, String cellPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.areaCode = areaCode;
        this.cellPhone = cellPhone;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCellPhone() {
        return cellPhone;
    }


}
