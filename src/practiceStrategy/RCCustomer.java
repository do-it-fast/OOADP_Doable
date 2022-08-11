package practiceStrategy;

public class RCCustomer extends Customer {

	public RCCustomer(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
		
		d = new RCDiscount();
		typeOfCust = "Regular Customer";
	}

}
