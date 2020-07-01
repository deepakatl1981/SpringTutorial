package com.example.demo;

import com.example.dispenser.Dispenser;
import com.example.dispenser.PetrolDispenser;
import com.example.dispenser.TenantScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class DemoApplication implements CommandLineRunner {
	@Autowired
	ApplicationContext context;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		PetrolDispenser pDispenser1= context.getBean(PetrolDispenser.class);
		pDispenser1.dispense();
		PetrolDispenser pDispenser2= context.getBean(PetrolDispenser.class);
		pDispenser2.dispense();

	}
}
