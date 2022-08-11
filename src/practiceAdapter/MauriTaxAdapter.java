package practiceAdapter;

public class MauriTaxAdapter implements CalcTax {

	MauriTax mt = new MauriTax();
	
	@Override
	public float taxAmount(int quantity, float price) {
		// TODO Auto-generated method stub
		return mt.MauriTaxAmount(quantity, price);
	}

}
