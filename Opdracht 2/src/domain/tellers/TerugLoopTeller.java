package domain.tellers;
// Doel van deze teller: 1 -> 2 -> 3 -> 4 -> 5 -> 4 -> 3 -> 2 -> 1 -> 2 -> ...
public class TerugLoopTeller extends Teller {
	
	private boolean oplopend;
	
	public TerugLoopTeller() {
		
	}

	public TerugLoopTeller(Character[] charLijst) {
		
	}
	
	@Override
	public void updateHuidigeWaarde() {
		// TODO Auto-generated method stub
		
	}
}
