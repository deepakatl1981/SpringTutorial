package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Radio {
    @Autowired
    @Qualifier("liveBean")
    private SimpleInt device;

    public String play(){
        return device.getMessage();
    }
}
