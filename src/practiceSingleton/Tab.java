package practiceSingleton;

import java.util.*;

public class Tab {
	private static final Tab instance = new Tab();
	//private static Tab a = new Tab();
	
	private ArrayList<String> visitedList = new ArrayList<String>();

	public static Tab getInstance() {
		// TODO Auto-generated method stub
		return instance;
	}

	public void visitedURLs(String url) {
		// TODO Auto-generated method stub
		
		visitedList.add(url);
	}

	public void display() {
		// TODO Auto-generated method stub
		
		for(String i : visitedList ) {
			System.out.println("Visited URLs: " + i.toString());
		}
	}
	
}
