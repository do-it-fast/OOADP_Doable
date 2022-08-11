package practiceAbstractFactory;

import java.util.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abstractFactory af;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Gender: \n 1. Male \t 2. Female ");
		int choice = Integer.parseInt(sc.nextLine());
		if(choice == 1) {
			af = new Male();
			af.getPerson();
			af.getSport();
			af.display();
		}
		
		if(choice == 2) {
			af = new Female();
			af.getPerson();
			af.getSport();
			af.display();
		}
	}

}
