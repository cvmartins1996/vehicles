package br.com.minerva.seller;

public class Name {
    private final String firstName;
    private final String lastName;

    public Name(String firstName, String lastName) {
        if(firstName == null || firstName.isEmpty() || firstName.isBlank()) throw new IllegalArgumentException("Name must be filled");
        if(lastName == null || lastName.isEmpty() || lastName.isBlank()) throw new IllegalArgumentException("Last Name must be filled");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return new StringBuilder(firstName).append(" ").append(lastName).toString();
    }
}
