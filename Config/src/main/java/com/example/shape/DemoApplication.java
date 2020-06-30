package com.example.shape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired

	private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Shape shape1 = context.getBean(Rectangle.class);
		shape1.draw();
		Shape shape2 = context.getBean(Rectangle.class);
		shape2.draw();

		Shape triangle1 = context.getBean(Triangle.class);
		triangle1.draw();
		Shape triangle2 = context.getBean(Triangle.class);
		triangle2.draw();

		Brush rBrush = context.getBean(RectangleBrush.class);
		rBrush.paint();

	}
}
