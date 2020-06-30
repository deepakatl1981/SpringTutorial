package com.example.fruit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AppleJuice implements Juice{

    @Autowired
    @Qualifier("apple")
    private FruitInterface fruit;
    public boolean makeJuice(){
        if(fruit.getType() !=  FruitType.APPLE){
            return false;
        }
        System.out.println(fruit.ripe());
        System.out.println(fruit.juice());
        return true;
    }
}
