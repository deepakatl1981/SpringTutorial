package com.example.fruit;

import org.springframework.stereotype.Component;

@Component
public class Orange implements FruitInterface{
    @Override
    public String ripe() {
        return "Ripen Orange";
    }

    @Override
    public String juice() {
        return "Orange Juice";
    }

    @Override
    public FruitType getType() {
        return FruitType.ORANGE;
    }
}
