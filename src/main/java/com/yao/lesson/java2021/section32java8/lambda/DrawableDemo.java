package com.yao.lesson.java2021.section32java8.lambda;

public class DrawableDemo {
	public static void main(String[] args) {
		int width = 10;
		new DrawableDemo().drawWithOutLambda();
		System.out.println("------------------------------------------------------");
		new DrawableDemo().drawWithLambda();;

		

	}
	public void drawWithOutLambda() {
		Drawable drawable = new Drawable() {
			public void draw() {System.out.println("drawwwww!");};
		};
		drawable.draw();
	}
	
	public void drawWithLambda() {
		Drawable drawable = () ->{
			System.out.println("darw with lambda");
		};
		drawable.draw();
	}
	
}


@FunctionalInterface   //It is optional  有寫編譯器會提前檢查，跟@override差不多
interface Drawable{
	public void draw();
}
