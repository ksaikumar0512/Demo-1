package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class Demo1ApplicationTests {

	@Autowired
	Add add;
	
	@Test
	void contextLoads() {
		int c= add.addition(3,4);
		Assert.isTrue(c<8);
	}
	@Test
	void contextLoads1() {
		int c= add.addition(3,4);
		Assert.isTrue(c>8);
	}
	@Test
	void contextLoads2() {
		int c= add.addition(3,4);
		Assert.isTrue(c==8);
	}
		
		
}
