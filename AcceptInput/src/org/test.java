package org;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scanner=new Scanner(System.in);
			System.out.println("Please enter your name");
			String name=scanner.next();
			System.out.println("Hello "+name);
			System.out.println("Pleae enter your age");
			int age=scanner.nextInt();
			System.out.println("You are "+age+ " years old");
			System.out.println("Hello "+name+" !! You are "+age+ " years old ");
	}

}
