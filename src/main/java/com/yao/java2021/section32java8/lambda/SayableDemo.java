package com.yao.java2021.section32java8.lambda;

public class SayableDemo implements Sayable1{

	public static void main(String[] args) {
		SayableDemo dm = new SayableDemo();
		dm.say();
		dm.sayMore("Hello Jack");
		
		//VVVVV  EX3:static關鍵字，靜態是直接呼叫物件類別，不是實體類
		Sayable1.sayLouder("Say Louder!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		//_____  EX3:static關鍵字
		
	}
	@Override
	public void sayMore(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

	//VVVVV  EX2:覆寫介面的方法
	@Override
	public void say() {
		System.out.println("Hello world!!!!!! this is main method.");
	}
	//_____  EX2:覆寫介面的方法


}

interface Sayable1{
	default void say() {
		System.out.println("Hello world!!!!!! this is default method.");
	}
	void sayMore(String msg);
	
	//VVVVV  EX3:static關鍵字
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
	//_____  EX3:static關鍵字
	
}