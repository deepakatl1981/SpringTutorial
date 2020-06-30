package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SampleBean implements SimpleInt{
    public String getMessage(){
        return "Hello World";
    }
}
