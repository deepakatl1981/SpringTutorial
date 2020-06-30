package com.example.fruit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrangeJuice implements Juice{

    @Autowired
    @Qualifier("orange")
    FruitInterface fruit;
    public boolean makeJuice(){
        if(fruit.getType() !=  FruitType.ORANGE){
            return false;
        }
        System.out.println(fruit.ripe());
        System.out.println(fruit.juice());
        return true;
    }
}
