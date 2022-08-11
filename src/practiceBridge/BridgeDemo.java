package practiceBridge;

public class BridgeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1 = new RCCustomer("Modi", 61, new Discount1());
		c1.printBill(100);
		
		c1.setDiscount(new Discount2());
		c1.printBill(100);
		
		c1.setDiscount(new Discount3());
		c1.printBill(100);
		
		c1.setDiscount(new Discount4());
		c1.printBill(100);
		
		Customer c2 = new FTCCustomer("Kalam", 83, new Discount1());
		c2.printBill(100);
		
		c2.setDiscount(new Discount2());
		c2.printBill(100);
		
		c2.setDiscount(new Discount3());
		c2.printBill(100);
		
		c2.setDiscount(new Discount4());
		c2.printBill(100);
		
	}

}
