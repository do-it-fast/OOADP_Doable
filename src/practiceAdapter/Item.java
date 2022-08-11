package practiceAdapter;

public class Item {

	String name;
	int quantity;
	float price;
	CalcTax ct;
	
	public Item(String name, int quantity, float price, CalcTax ct) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.ct = ct;
	}
	
	void setTax(CalcTax ct) {
		this.ct = ct;
	}
	
	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	void displayItem() {
		System.out.println("\n Name: " + name);
		System.out.println("Quantity: " + quantity);
		System.out.println("Price: " + price);
		float tax = ct.taxAmount(quantity, price);
		float billAmount = quantity * price + tax;
		System.out.println("Tax Amount: " + tax);
		System.out.println("Bill Amount: " + billAmount) ;
	}
	
}
