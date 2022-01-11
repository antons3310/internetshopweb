package ru.ashebalkin.skypro.course2.internetshopweb.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
@SessionScope
public class CartServiceImpl implements CartService {

    Map<Integer, Integer> items = new HashMap<>();

    @Override
    public void putItemsToCart(ArrayList<Integer> idList) {

        for (Integer id : idList) {
            if (items.containsKey(id)) {
                items.put(id, items.get(id) + 1);
            } else {
                items.put(id, 1);
            }
        }
    }

    @Override
    public Map<Integer, Integer> getItemsFromCart() {
        return items;
    }

}
