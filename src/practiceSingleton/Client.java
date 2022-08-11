package practiceSingleton;

import java.util.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Tab t = Tab.getInstance();
		
		while(true) {
			System.out.println("Enter Choice: \n 1.Visit URL \t 2. Display History \t 3. Exit");
			int choice = Integer.parseInt(sc.nextLine());
			if(choice == 1) {
				System.out.println("Enter URL: ");
				String url = sc.nextLine();
				t.visitedURLs(url);
			}
			else if(choice == 2) {
				t.display();
			}
			else {
				break;
			}
		}
	}

}
