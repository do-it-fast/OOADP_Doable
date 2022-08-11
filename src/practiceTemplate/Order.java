package practiceTemplate;

public abstract class Order {

	public void order() {
		selectItem();
		doPayment();
		doDelivery();
	}

	protected abstract void doDelivery();

	protected abstract void doPayment();

	protected abstract void selectItem();
	
	
}
