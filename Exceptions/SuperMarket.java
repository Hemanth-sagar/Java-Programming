package exception1;

import java.io.IOException;
import java.util.Scanner;

public class SuperMarket {
	
	Scanner sc = new Scanner(System.in);
	String productName;
	int quantity;
	void getData() throws IOException {
		System.out.println("Enter product name:");
		productName = sc.next();
		System.out.println("Enter quantity:");
		quantity = sc.nextInt();
		if(quantity>5) {
			throw new IOException("we're sorry only 5 units max allowed ");
		}
		else {
			System.out.println("Happy shopping");
		}
		System.out.println("last line");
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		SuperMarket ob = new SuperMarket();
		ob.getData();
		/*
		 *	Enter product name:
			almonds
			Enter quantity:
			6
			Exception in thread "main" java.io.IOException: we're sorry only 5 units max allowed 
			at Project1/exception1.SuperMarket.getData(SuperMarket.java:17)
			at Project1/exception1.SuperMarket.main(SuperMarket.java:28)
 
		 */

	}

}
