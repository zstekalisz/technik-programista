package com.example.model;

public class Coffee {
    private String name;
    private String description;
    private int picture;

    public Coffee(String name, String description, int picture) {
        this.name = name;
        this.description = description;
        this.picture = picture;
    }

    @Override
    public String toString() {
        return name;
    }
}
