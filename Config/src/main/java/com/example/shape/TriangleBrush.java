package com.example.shape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TriangleBrush implements  Brush{

    @Autowired
    @Qualifier("triangle")
    private Shape shape;
    @Override
    public boolean paint() {
        return shape.draw();
    }
}
