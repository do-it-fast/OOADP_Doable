package practiceStrategy;

public class SCCustomer extends Customer {

	public SCCustomer(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
		
		this.d = new SCDiscount();
		this.typeOfCust = "Senior Customer";
	}

}
