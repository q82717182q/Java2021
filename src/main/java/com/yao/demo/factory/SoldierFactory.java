package com.yao.demo.factory;

public class SoldierFactory {
	public ICamp getSoldier(String unitType) {
		if (unitType == null) {
			return null;
		}

		if (unitType == "archar") {
			return new ArcharCamp();
		}else if (unitType == "barbarian") {
			return new BarbarianCamp();
		}else {
			return null;
		}
	}
}
