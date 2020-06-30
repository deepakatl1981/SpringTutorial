package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired

	private  ApplicationContext context;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Started Application..." );
	}

	@Override
	public void run(String...args) throws Exception {

		Radio radio = context.getBean(Radio.class);
		//System.out.println(radio.play());
	}


}
