package exception1;

import java.util.Scanner;

public class TryCatchBlock {
	Scanner sc = new Scanner(System.in);
	int a, b, c;
	void getData() {
		System.out.println("Enter first value:");
		a = sc.nextInt();
		System.out.println("Enter second value:");
		b = sc.nextInt();
		try {
			c = a/b;
			System.out.println("Division :"+c);
		}
		catch(ArithmeticException Ex){
			System.out.println("Arithmetic Exception :"+Ex);
			Ex.printStackTrace();
		}
		
		System.out.println("last line");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchBlock ob = new TryCatchBlock();
		ob.getData();

	}

}
