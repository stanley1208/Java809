package package1;

class Customer{
	
	private String fName;
	private String lName;
	private static int count;
	
	public Customer(String first,String last) {
		fName=first;
		lName=last;
		++count;
	}
	
	static {
		count=2;
	}
	
	public static int getCount() {
		return count;
	}
	
	
}


public class ex1 {

	public static void main(String[] args) {
		Customer c1=new Customer("Larry","Smith");
		Customer c2=new Customer("Pedro","Gonzales");
		Customer c3=new Customer("Penny","Jonas");
		Customer c4=new Customer("Lars","Svenson");

		c4=null;
		c3=c2;
		
		System.out.println(Customer.getCount());
	}

}
