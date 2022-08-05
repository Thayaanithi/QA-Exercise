package domain;

public class sample {
	public void method1() {// handling the exception
		try {
			int x = 10;
			int y = 0;
			int z = x / y;
		} catch (Exception e) {
			System.out.println("something went wrong");
		}
	}

	public void method2() throws Exception { // declaring the exception
		int x = 10;
		int y = 0;
		int z = x / y;

	}
}
