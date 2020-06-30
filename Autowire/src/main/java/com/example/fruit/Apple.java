package com.example.fruit;

import org.springframework.stereotype.Component;

@Component
public class Apple implements  FruitInterface{
    @Override
    public String ripe() {
        return "Ripen Apple";
    }

    @Override
    public String juice() {
        return "Apple Juice";
    }
    @Override
    public FruitType getType() {
        return FruitType.APPLE;
    }
}
