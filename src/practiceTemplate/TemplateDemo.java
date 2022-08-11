package practiceTemplate;

public class TemplateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order o;
		
		System.out.println("Online Order: ");
		o = new Online();
		o.order();
		
		System.out.println("Offline Order: ");
		o = new Offline();
		o.order();

	}

}
