package practiceAdapter;

public class GST implements CalcTax {

	@Override
	public float taxAmount(int quantity, float price) {
		// TODO Auto-generated method stub
		return quantity * price * 0.18f;
	}

}
