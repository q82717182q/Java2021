package com.yao.demo.factory;

public class ArcharCamp implements ICamp{

	@Override
	public void describe() {
		System.out.println("Archar completed.");
	}

	@Override
	public void attack() {
		System.out.println("Bull's-eye.");
		
	}

}
