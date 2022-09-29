package com.yao.demo.json;

public class BuyList {
	private Integer id;
	private Client client;
	
	public static class Client{
		private Integer id;
		private String name;
		
		
		//..可以繼續往內層包其他東西
	}

}
