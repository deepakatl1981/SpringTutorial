package com.example.shape;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShapeConfiguration {

    @Bean
    public Rectangle rectangle1() {
        System.out.println("Rectangle bean creating");
        return new Rectangle();
    }

    @Bean
    public Triangle triangle() {
        return new Triangle();
    }

    @Bean
    public TriangleBrush tBrush() {
        return new TriangleBrush();
    }

    @Bean
    public RectangleBrush rBrush() {
        return new RectangleBrush();
    }
}