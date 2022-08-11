package practiceAbstractFactory;

import java.util.Scanner;

public class Male implements abstractFactory {

	Sport s;
	Person p;
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void getPerson() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Person: 1. Differently Abled \t 2. Abled");
		int ch = Integer.parseInt(sc.nextLine());
		if(ch == 1) {
			this.p = new DifferentlyAbled("DifferntlyAbled");
		}
		if(ch == 2) {
			this.p = new Abled("Abled");
		}
	}

	@Override
	public void getSport() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Sport: 1. IndoorRegular \n 2. OutdoorRegular \n 3. OutdoorAdventure");
		int ch = Integer.parseInt(sc.nextLine());
		if(ch == 1) {
			this.s = new IndoorRegular("IndoorRegular");
		}
		if(ch == 2) {
			this.s = new OutdoorRegular("OutdoorRegular");
		}
		if(ch == 3) {
			this.s = new OutdoorAdventure("OutdoorAdventure");
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Sport: " + s.name + "\n Person: " + p.name);
	}

}
