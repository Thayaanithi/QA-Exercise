package com;

public class Test {
	public static void main(String[] args) {
		//Addition ad1=()-> {System.out.println("This adds two numbers"); };
		//ad1.add();
		/*
		Addition ad1=(x,y)-> {
			int sum=x+y;
			System.out.println("The result is "+ sum);
		};
		ad1.add(100, 200); */
		 
		Addition ad1=(x,y)->{return x+y;};
		int result=ad1.add(20, 30);
		System.out.println(result);
		System.out.println(ad1.add(400, 25));
	}

}