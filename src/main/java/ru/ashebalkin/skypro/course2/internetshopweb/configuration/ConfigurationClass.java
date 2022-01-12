package ru.ashebalkin.skypro.course2.internetshopweb.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;
import ru.ashebalkin.skypro.course2.internetshopweb.resource.Cart;

@Configuration
public class ConfigurationClass {

    @Bean
    @SessionScope
    public Cart createCart(){
        return new Cart();
    }


}
