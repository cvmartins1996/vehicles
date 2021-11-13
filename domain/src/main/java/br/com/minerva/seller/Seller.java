package br.com.minerva.seller;

public class Seller {


    private final Name name;
    private final Email email;
    private final CellPhone cellPhone;

    public Seller(Name name, Email email, CellPhone cellPhone) {
        this.name = name;
        this.email = email;
        this.cellPhone = cellPhone;
    }

    public String getName() {
        return name.getFullName();
    }

    public String getEmail() {
        return email.getAddress();
    }

    public String getCellPhone() {
        return cellPhone.getPhoneAddress();
    }
}
