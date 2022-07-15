package com.yao.demo.factory;

public class SoldierFactoryDemo {
	//
	public static void main(String[] args) {
		SoldierFactory soldierFactory = new SoldierFactory();
		ICamp archar1 = soldierFactory.getSoldier("archar");
		ICamp barbarian1 = soldierFactory.getSoldier("barbarian");
		
		
		archar1.describe();
		archar1.attack();
		barbarian1.describe();
		barbarian1.attack();
	}
}
