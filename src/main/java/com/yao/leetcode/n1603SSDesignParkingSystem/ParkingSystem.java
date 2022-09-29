package com.yao.leetcode.n1603SSDesignParkingSystem;

public class ParkingSystem {
	private int big,medium,small;
	public ParkingSystem(int big, int medium, int small) {
		this.big = big;
		this.medium = medium;
		this.small = small;
	}

	public boolean addCar(int carType) {

		switch (carType) {
		case 1:
			if (big>=1) {
				big--;
				return true;
			}else {
				return false;
			}
		case 2:
			if (medium>=1) {
				medium--;
				return true;
			}else {
				return false;
			}
		case 3:
			if (small>=1) {
				small--;
				return true;
			}else {
				return false;
			}
		default:
			break;
		}
		return false;
	}
}
