package customizedexception;

import java.util.Scanner;

public class SuperMarketQuantityCheck {
	Scanner sc = new Scanner(System.in);
	String productName;
	int quantity;
	void getData() throws QuantityCheck {
		System.out.println("Enter product name:");
		productName = sc.next();
		System.out.println("Enter quantity:");
		quantity = sc.nextInt();
		if(quantity>5) {
			throw new QuantityCheck("we're sorry only 5 units max allowed ");
		}
		else {
			System.out.println("Happy shopping");
		}
		System.out.println("last line");
	}

	public static void main(String[] args) throws QuantityCheck {
		
		SuperMarketQuantityCheck list = new SuperMarketQuantityCheck();
		try {
			list.getData();
		}catch(QuantityCheck ex){
			System.out.println(ex);
			System.out.println(ex.getMessage());
//			ex.printStackTrace();
		}
		/*
		 * 
		 * 	Enter product name:
			almonds
			Enter quantity:
			6
			customizedexception.QuantityCheck: we're sorry only 5 units max allowed 
			we're sorry only 5 units max allowed
		 * 
		 * 
		 */

	}

}
