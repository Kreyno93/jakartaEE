package com.example.test;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Stateful;

import java.util.ArrayList;
import java.util.List;

@Stateful
public class Service {

    private final List<String> list = new ArrayList<>();

    @PostConstruct
    public void init() {

        list.add(new com.example.test.Person("Jan", "Kowalski", 20).toString());
        list.add(new com.example.test.Person("Adam", "Nowak", 30).toString());
        list.add(new com.example.test.Person("Piotr", "Kowalski", 40).toString());

    }
    public List<String> getList() {
        return list;
    }

}
