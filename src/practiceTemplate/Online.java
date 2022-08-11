package practiceTemplate;

import java.util.*;

public class Online extends Order {

	Scanner sc =  new Scanner(System.in);
	int choice;
	
	@Override
	protected void doDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Online Delivery: Pay for shipping and provide Delivery address");
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
		System.out.println("OnlinePayment: Do Payment of " + value + " through Options: \n 1. NetBanking");                   
	}

	@Override
	protected void selectItem() {
		// TODO Auto-generated method stub
		
		System.out.println("Online: Select Items: \n 1. Item1: Rs100 \n 2. Item2: Rs200");
		//int choice = sc.nextInt();
		choice = sc.nextInt();
	}

}
