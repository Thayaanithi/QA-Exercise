package domain;

public class test {
public static void main(String[] args)  {
	sample obj=new sample();
	obj.method1();
	try {
		obj.method2();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
