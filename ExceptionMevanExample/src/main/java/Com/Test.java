package Com;

public class Test {
public static void main(String[] args) {
	Eligibility obj=new Eligibility();
	try {
		obj.checkEligibility(20);
	}catch (InvalidAgeException e) {
		e.printStackTrace();
	}
	
	ValidCC obj1=new ValidCC();
	try {
		obj1.checkValidity("1234567891234567");
	}catch (ValidCCException e) {
		System.out.println(e.getMessage());
	}
}
}
