package ru.ashebalkin.skypro.course2.internetshopweb.service;

import org.springframework.stereotype.Service;
import ru.ashebalkin.skypro.course2.internetshopweb.resource.Cart;

import java.util.ArrayList;
import java.util.Map;

@Service
public class CartServiceImpl implements CartService {

    private Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void putItemsToCart(ArrayList<Integer> idList) {

        for (Integer id : idList) {
            if (cart.items.containsKey(id)) {
                cart.items.put(id, cart.items.get(id) + 1);
            } else {
                cart.items.put(id, 1);
            }
        }
    }

    @Override
    public Map<Integer, Integer> getItemsFromCart() {
//        Map<Integer, Integer> items = configurationClass.createCart();
        return cart.items;
    }

}
