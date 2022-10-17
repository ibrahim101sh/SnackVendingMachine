import java.security.PublicKey;

import javax.swing.ComponentInputMap;

import NoteSlots;
import CoinSlots;
import SnackVendingMachine;

public class PaymentMehod {
	
	private SnackVendingMachine sVM;
	
	String paymentmethod;
	
	public String whatPaymentMethod(int n) {
		
		if (n==1) 
			paymentmethod = "CASH";
		
		else if (n==2) {
			paymentmethod = "CARD";
			
		}
		
		else {
			paymentmethod = "not recogonized !!";
		}
		
		return paymentmethod;	
	}
	
	public void payment(PaymentMehod) {
		if (paymentmethod == "CASH") {
			
			System.out.println("chose 1 for Coins or 2 for Notes ");
			
			Scanner cashchoice = new Scanner(System.in);
			int choice = method.nextInt();
			
			if (choice==1) {
				NoteSlots note = new NoteSlots();
				
				System.out.println("Enter Note ");
				
				Scanner note = new Scanner(System.in);
				int notevalue = method.nextInt();
				note.getNote(notevalue);
				
			
			}
			
			else 
				CoinSlots coin = new CoinSlots();
			System.out.println("Enter coin ");
			
			Scanner coin = new Scanner(System.in);
			int coinvalue = method.nextInt();
				coin.getCoin(coinvalue);
		
			
		}
		
	}
	
	public boolean isCash(PaymentMehod) {
		
		if (paymentmethod== "CASH") 
			return true;
		 
		else 
		return false;
			
	}
	
	public boolean isCard(PaymentMehod) {
		
		if (paymentmethod=="CARD") 
			return true;
		else 
			return false;
		
	}

}
