package com.example.model;

import com.example.myapplication.CoffeeActivity;

public class Coffee {

    private int id;
    private String name;
    private String description;
    private int picture;

    public Coffee(int id,String name,String description,int picture){
        this.id = id;
        this.name = name;
        this.description = description ;
        this.picture = picture ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return name;
    }
}
