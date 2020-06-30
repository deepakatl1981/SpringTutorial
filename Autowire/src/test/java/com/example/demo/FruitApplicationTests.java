package com.example.demo;

import com.example.fruit.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ContextConfiguration(classes = {AppleJuice.class, OrangeJuice.class, Apple.class, Orange.class})
class FruitApplicationTests {

	@Autowired
	@Qualifier("appleJuice")
	private Juice appleJuice;
	@Autowired
	@Qualifier("orangeJuice")
	private Juice orangeJuice;


	@Test
	void makeAppleJuice() {
		assertThat(appleJuice.makeJuice()).isEqualTo(true);
	}

	@Test
	void makeOrangeJuice() {
		assertThat(orangeJuice.makeJuice()).isEqualTo(true);
	}
}
