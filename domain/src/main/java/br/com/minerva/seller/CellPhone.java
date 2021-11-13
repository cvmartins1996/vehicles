package br.com.minerva.seller;

public class CellPhone {
    private final String areaCode;
    private final String number;

    public CellPhone(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getNumber() {
        return number;
    }

    public String getPhoneAddress(){
        return new StringBuilder(areaCode).append(number).toString();
    }
}
