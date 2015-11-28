package domain.tellers;

public class CyclischeTeller extends Teller {
	
	public CyclischeTeller() {
		
	}
	
	public CyclischeTeller (Character...waarden) {
		
		super(waarden);
		
	}

	@Override
	public void updateHuidigeWaarde() {
		int nieuweWaarde;
		if (this.getHuidigeIndex() == (this.getMogelijkeWaarden().length - 1))
		{
			nieuweWaarde = 0;
			
		}
		else
		{
			nieuweWaarde = (this.getHuidigeIndex())+1;
		}
		setHuidigeIndex(nieuweWaarde);
		
	}

}


