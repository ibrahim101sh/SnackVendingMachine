
import java.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import Inventory;
import SnackVendingMachine;
import Keypad;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class SnackSlots {

	private SnackVendingMachine sVM;
	private Inventory inventory;
	private Keypad keypad;

	String[][][] snackItems = new String[5][5][5];
	
	String[] snackTypes = new String[] {"Meat snack","biscut snack", "potato snack","savoury snack", "snack nuts"};
	int no = snackTypes.length;
	double snackPrice ;
	String snacknumper;
	String snackName;
	int snackquantity=5;
	
//	For(int i =0 ;i < no ; i++ ){
//		
//	}
	public String getSnackName(String snacknumber) {
		
		switch (snacknumber{
		case "a1": {
			
			snackName = snackTypes[0];
			 
			case "a2" :
				
				snackName = snackTypes[1];
				
			case "a3" :
				
				snackName = snackTypes[2];
				
			case "a4" :
	
				snackName = snackTypes[3];
				
			case "a5" :
				
				snackName = snackTypes[4];
			
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + snacknumber);
		}
		
	}
	
	public double getPrice(String [][][] snackItem ) {
		
		switch (snackItem) {
		case Meat snack: {
			
			snackPrice= 7.50;
			
			case biscut snack:
				snackPrice = 4.30;
				
			case potato snack :
				snackPrice = 3.10;
				
			case savoury snack:
				snackPrice = 6.40;
				
			case snack nuts:
				snackPrice = 9.70;
					
				
		}
		return snackPrice;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}
		
	}
	
public String getNumber(String [][][] snackItem ) {
		
		switch (snackItem) {
		case Meat snack: {
			
			snacknumper= "a1";
			
			case biscut snack:
				snacknumper = "a2";
				
			case potato snack :
				snacknumper = "a3";
				
			case savoury snack:
				snacknumper = "a4";
				
			case snack nuts:
				snacknumper = "a5";
					
				
		}
		return snacknumper;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}
		
	}
	
	}

