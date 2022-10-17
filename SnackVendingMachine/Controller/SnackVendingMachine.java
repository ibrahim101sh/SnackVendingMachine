import java.awt.*;
import java.util.*;
import java.util.List;
import java.lang.*;
import java.applet.*;
import java.SnackSlots;
import java.PaymentMethod;
import Keypad;

public class SnackVendingMachine {
	private List<PaymentMethod>paymentMethods;
	//private List<SnackSlots>snackSlots;
	private List<MoneySlots>moneySlots;
	private Keypad key;
	
	
	String num;
	SnackSlots sl = new SnackSlots();
	
	public  public SnackVendingMachine(String num) {
		// TODO Auto-generated constructor stub
		
		this.num = num;
		
	}
		
	

	public boolean getQuantity() {
		if (sl.snackquantity > 0) {
			return true;
			else {
				return false;	
				}
		}
	}
	
	public double getPrice() {
		//here we will display the price on the 
		//screen we were taken from the inventory !!
		
	}
	
	public boolean moneyValidate() {
		//call the validate func from the 
		//payment method class which (1--*)
		
	}
	
	public double moneyDisplay() {
		//this will return and display the money that user has entered
		
	}
	
	public boolean isEnough() {
		//will check and compare the entered money 
		//if it equals or more than the snack price 
		//and return true if yes and false if not !
	}
	
	public boolean isThereChange() {
		//it can call the (isEnough) func and if its result 
		//true we can subtract the entered money from the snack price
		// if that result was zero there is no change if else the result is the change 
		
	}
	
	

}
