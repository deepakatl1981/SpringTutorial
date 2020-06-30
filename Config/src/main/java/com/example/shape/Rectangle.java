package com.example.shape;

public class Rectangle  implements Shape{
    @Override
    public float area() {
        return 0;
    }

    @Override
    public boolean draw() {
        System.out.println("Rectangle drawn" + this);
        return false;
    }
}
