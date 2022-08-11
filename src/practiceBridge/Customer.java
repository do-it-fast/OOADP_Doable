package practiceBridge;

public class Customer {
	
	String name, typeOfCust;
	int age;
	Discount d;
	
	public Customer(String name, int age, Discount d) {
		this.name = name;
		this.age = age;
		this.d = d;
	}
	
	void setDiscount(Discount d) {
		this.d = d;
	}
	
	void printBill(float amount) {
		System.out.println("\n Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Type of Customer: " + typeOfCust);
		System.out.println("Total Amount: " + amount);
		System.out.println("Discount: " + d.calcDiscount(amount));
		System.out.println("Payable amount: " + (amount - d.calcDiscount(amount)));
	}
}
