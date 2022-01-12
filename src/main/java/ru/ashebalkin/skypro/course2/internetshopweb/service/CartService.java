package ru.ashebalkin.skypro.course2.internetshopweb.service;

import ru.ashebalkin.skypro.course2.internetshopweb.resource.Cart;

import java.util.ArrayList;
import java.util.Map;

public interface CartService {
    void putItemsToCart(ArrayList<Integer> idList);

    Map<Integer, Integer> getItemsFromCart();


}
