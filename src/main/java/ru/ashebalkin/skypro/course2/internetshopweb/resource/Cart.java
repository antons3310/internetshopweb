package ru.ashebalkin.skypro.course2.internetshopweb.resource;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


public class Cart {
    public HashMap<Integer, Integer> items;

    @PostConstruct
    public void serviceUP() {
        System.out.println("Service!!!");
    }

    public Cart() {
        this.items = new HashMap<>();
    }

}
