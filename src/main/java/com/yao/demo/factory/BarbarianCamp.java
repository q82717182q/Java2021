package com.yao.demo.factory;

public class BarbarianCamp implements ICamp{

	@Override
	public void describe() {
		System.out.println("Barbarian is here.");
		
	}

	@Override
	public void attack() {
		System.out.println("Smash it!");
		
	}

}
