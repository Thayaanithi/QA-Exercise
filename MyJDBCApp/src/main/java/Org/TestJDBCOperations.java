package Org;

import java.util.Scanner;

public class TestJDBCOperations {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		JDBCOperation ops = new JDBCOperation();
		char ans='y';
		System.out.println("Hello welcome to my application");
		System.out.println("----------------------");
		System.out.println("What would you like to do? please enter a number");
		System.out.println("1.Read Records");
		System.out.println("2.Add record");
		///while (ans) {
		int choice = scn.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Good choice- reading record");
			ops.readData();
			break;
		case 2:
			System.out.println("Good choice- add record");
			ops.addData();
			break;
		case 3:
			System.out.println("Good choice- add record");
			ops.addData();
			break;
		default:
			System.out.println("Enter correct choice");
		}
		
		
	}

}
