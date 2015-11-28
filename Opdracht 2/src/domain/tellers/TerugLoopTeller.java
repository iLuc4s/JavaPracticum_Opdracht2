package domain.tellers;

public class TerugLoopTeller extends Teller {

	private boolean oplopend;

	public TerugLoopTeller(){

	}

	public TerugLoopTeller(Character...waarden) {
		super (waarden);
		this.oplopend = true;

	}

	@Override
	public void updateHuidigeWaarde() {

		int nieuweWaarde;

		if (this.oplopend == true)
		{
			if (this.getHuidigeIndex() == (this.getMogelijkeWaarden().length - 1))
			{
				nieuweWaarde = (this.getMogelijkeWaarden().length) - 2;
				this.oplopend = false;

			}
			else
			{
				nieuweWaarde = (this.getHuidigeIndex())+1;
			}
		}
		else
		{
			if (this.getHuidigeIndex()==0)
			{
				nieuweWaarde = 1;
				this.oplopend = true;
			}
			else
			{
				nieuweWaarde = (this.getHuidigeIndex())-1;
			}
		}

		setHuidigeIndex(nieuweWaarde);

	}

}




