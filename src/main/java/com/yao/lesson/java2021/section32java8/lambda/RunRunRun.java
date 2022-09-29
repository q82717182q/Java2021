package com.yao.lesson.java2021.section32java8.lambda;

public class RunRunRun {
	public static void main(String[] args) {
		System.out.println("testest");
		new RunRunRun().run();
	}

	private void run() {
		// TODO Auto-generated method stub
		Runnable r1 = () -> System.out.println("r1: " + this.getClass());

		Runnable r2 = new Runnable(){
		    public void run(){
			System.out.println("r2: " + this.getClass());
		    }
		};
		 
		new Thread(r1).start();
		new Thread(r2).start();
	}

	
}
