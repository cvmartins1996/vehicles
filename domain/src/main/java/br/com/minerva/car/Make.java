package br.com.minerva.car;

public class Make {
    private final String name;

    public Make(String name) {
        if(name == null || name.isEmpty()) throw new IllegalArgumentException("Name for make is invalid");
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
