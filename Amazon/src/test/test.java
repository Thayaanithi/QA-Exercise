package test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		c1.cid=1001;
		c1.name="David";
		c1.address="UK";
		c1.email="d@gmail.com";
		c1.display();
		Customer c2=new Customer();
		c2.cid= 1002;
		c2.name="Ron";
		c2.email="r@gmail.com";
		c2.address="USA";
		c2.display();
		Book b1=new Book();
		b1.bid=3001;
		b1.title="Tell me your dreams";
		b1.price=12.55f;
		b1.author="Sydney Sheldon";
		b1.show();
		Employee e1=new Employee();
		e1.Eid=01;
		e1.name="Thayaa";
		e1.address="India";
				
	}

}
