package com.example.shape;

public class Triangle implements Shape{
    @Override
    public float area() {
        return 0;
    }

    @Override
    public boolean draw() {
        System.out.println("Triangle drawn" + this);
        return false;
    }
}
