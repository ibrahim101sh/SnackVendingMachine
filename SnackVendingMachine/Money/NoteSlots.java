import java.util.List;
import MoneySlots;

public enum NoteSlots implements MoneySlots{
	TWENTYDOLARS(20),FIFTYDOLARS(50);

	private MoneySlots moneySlot;
	
int money;
	
	NoteSlots(int money){
		this.money=money;
	}
	
	public int getValue() {
		return money;
		
	}
	
	public NoteSlots getNote(int money) {
		switch (money) {
		
		
		case 20: 
			return TWENTYDOLARS;
		
		case 50: 
			return FIFTYDOLARS;
		
		}
}

}