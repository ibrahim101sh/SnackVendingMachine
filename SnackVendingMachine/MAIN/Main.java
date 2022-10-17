import java.util.Scanner;
import java.*;
import java.lang.*;
import SnackVendingMachine;
import PaymentMethod;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a char from 'a' to 'e' ");
		
		char first = sc.next().charAt(0);
		
		if (first != 'a'|'b'|'c'|'d'|'e') {
			
			System.out.println("You enterd wrong char );

		}
		
		Scanner num = new Scanner(System.in);

		System.out.println("Please enter a number from '1' to '5' ");

		int second = num.nextInt();
		
		String number =first+ Integer.toString(second);
		
		SnackVendingMachine vm = new SnackVendingMachine(number);
		
		if (vm.getQuantity()) {
			
			System.out.println("This snack is available");
			System.out.println(vm.getPrice);
			
			else {
				System.out.println("Not available");
			}
			
		}
		
		System.out.println("chose your payment method 1=cash / 2= card ");
		
		Scanner method = new Scanner(System.in);
		int paymethod = method.nextInt();
		
		PaymentMehod payment = new PaymentMethod();
		
		String pay = payment.whatPaymentMethod(paymethod);
		
		payment.payment(pay);
		
		
		

	}

}
