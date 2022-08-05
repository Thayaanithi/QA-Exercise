package Exception;

import java.util.Scanner;

public class Cal {

		int x; 
		int y;
		
		public int plus()
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter first no.");
			x=scn.nextInt();
			System.out.println("Enter second number");
			y=scn.nextInt();
			return x+y;
		}
		public int minus() {
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter first no.");
			x=scn.nextInt();
			System.out.println("Enter second number");
			y=scn.nextInt();
			return x-y;
			}
			
			
			
			
		public int division() {
			try {
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter first no.");
			x=scn.nextInt();
			System.out.println("Enter second number");
			y=scn.nextInt();
			
			return x/y;
		
			}catch (ArithmeticException e) {
				System.out.println("Cannot devided by Zero " + e);
				Scanner scn=new Scanner(System.in);
				System.out.println("Start Again and Enter your first no.");
				x=scn.nextInt();
				System.out.println("Enter second number");
				y=scn.nextInt();
				
			}return x/y;
			
					
		}
		public int multiply()
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter first no.");
			x=scn.nextInt();
			System.out.println("Enter second number");
			y=scn.nextInt();
			return x*y;
		}
		public int exit( ) {
			Scanner scn=new Scanner(System.in);
			System.out.println("Thank you");
			return x;
		}
	}


