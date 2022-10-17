import java.util.List;
import java.util.stream.IntStream;
import MoneySlots;

public enum CoinSlots implements MoneySlots {
	TENCENTS(10),TWENTYCENTS(20),FIFTYCENTS(50),ONEDOLAR(100);
	
	private MoneySlots moneySlot;
	int money;
	
	CoinSlots(int money){
		this.money=money;
	}
	
	public int getValue() {
		return money;
		
	}
	
	public CoinSlots getCoin(int money) {
		switch (money) {
		case 10: 
			return TENCENTS;
		
		case 20:
			return TWENTYCENTS;
		
		case 50:
			return FIFTYCENTS;
		
		case 100:
			return ONEDOLAR;
		
		
		
		}
		
	}

}



