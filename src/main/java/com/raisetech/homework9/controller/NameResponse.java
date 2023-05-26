package com.raisetech.homework9.controller;

import com.raisetech.homework9.entity.Name;

public class NameResponse {

    private int id;
    private String name;

    public NameResponse(Name name) {
        this.id = name.getId();
        this.name = name.getName();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.id = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
