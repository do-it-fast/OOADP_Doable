package practiceTemplate;

import java.util.*;

public class Offline extends Order {
	
	Scanner sc = new Scanner(System.in);
	int choice;
	
	@Override
	protected void doDelivery() {
		// TODO Auto-generated method stub
		
		System.out.println("OfflineDelivery: collect items at the counter");
	}

	@Override
	protected void doPayment() {
		// TODO Auto-generated method stub
		
		int value;
		if(choice == 1) {
			value = 100;
		}
		else {
			value = 200;
		}
		System.out.println("OfflinePayment: Pay cash of " + value + " at Counter");
	}

	@Override
	protected void selectItem() {
		// TODO Auto-generated method stub
		
		System.out.println("Offline: Select Items: \n 1. Item1 : Rs100 \n 2. Item2 : Rs200");
		choice = sc.nextInt();
	}

}
