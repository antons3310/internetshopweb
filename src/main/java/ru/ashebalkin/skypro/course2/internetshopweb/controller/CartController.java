package ru.ashebalkin.skypro.course2.internetshopweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ashebalkin.skypro.course2.internetshopweb.service.CartService;

import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("order/")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping
    public String helloMessage() {
        return "Страница заполнения корзины покупками";
    }

    @GetMapping("/add")
    public void putItemsToCart(@RequestParam(value = "id") ArrayList<Integer> idlist) {
        cartService.putItemsToCart(idlist);
    }

    @GetMapping("/get")
    public Map<Integer, Integer> getItemsFromCart() {
        return cartService.getItemsFromCart();
    }
}
