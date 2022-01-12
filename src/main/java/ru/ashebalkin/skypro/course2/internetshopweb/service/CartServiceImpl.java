package ru.ashebalkin.skypro.course2.internetshopweb.service;

import org.springframework.stereotype.Service;
import ru.ashebalkin.skypro.course2.internetshopweb.resource.Cart;

import java.util.ArrayList;
import java.util.Map;

@Service
public class CartServiceImpl implements CartService {

    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void putItemsToCart(ArrayList<Integer> idList) {

        for (Integer id : idList) {
            if (cart.getItems().containsKey(id)) {
                cart.getItems().put(id, cart.getItems().get(id) + 1);
            } else {
                cart.getItems().put(id, 1);
            }
        }
    }

    @Override
    public Map<Integer, Integer> getItemsFromCart() {
        return cart.getItems();
    }

}
