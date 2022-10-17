import java.util.List;
import java.util.stream.IntStream;
import SnackSlots;

public class Keypad {
	
	private List<SnackSlots>snackSlots;
	
	int [] numbers = new int [25] ;
	
	int [] keypadNumbers = IntStream.range(1, 5).toArray();
	
	char [] keypadChar = {'a','b','c','d','e'};
	
	String [] keypadSympol = new String[]{"Enter","Delete","Cancel"};
	
	

}
