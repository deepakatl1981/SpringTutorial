package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class LiveBean implements SimpleInt{
    public String getMessage(){
        return "This is Live Bean";
    }
}
