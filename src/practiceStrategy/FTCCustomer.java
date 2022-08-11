package practiceStrategy;

public class FTCCustomer extends Customer {

	public FTCCustomer(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
		
		this.d = new FTCDiscount();
		typeOfCust = "First Time Customer";
	}

}

