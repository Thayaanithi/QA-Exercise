package Org;

import java.util.Scanner;

public class Sample {

	public static void action1() {
		System.out.println("Hello");
		//return
	}
	public static void action2() {
		System.out.println("Hello world");
	}
	public static void action3() {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter first name");
		String fName=scn.next();
		System.out.println("enter last name");
		String lName=scn.next();
		String fullName=fName+" "+lName");
		System.out.println("Hello "+fName+" "+lName);
		System.out.println("Hello "+fullName);
		
	public static int action4() {
		
	}
	}
	//Execution point
	public static void main(String[] args) {
		String name="John";
		action1();
		action2();
		action3();
	}
}