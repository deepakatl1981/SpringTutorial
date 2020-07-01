package com.example.dispenser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PetrolDispenser {

    @Autowired
    private Dispenser dispenser;

    public void dispense(){
        dispenser.print();
    }
}
