package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Add {
	
	public int addition(int i,int j)
	{
		System.out.println(i+j);
		return i+j;
	}
}
