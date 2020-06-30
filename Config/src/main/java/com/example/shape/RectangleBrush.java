package com.example.shape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class RectangleBrush implements Brush{
    @Autowired
    @Qualifier("rectangle1")
    private Shape shape;
    @Override
    public boolean paint() {
        return shape.draw();
    }
}
