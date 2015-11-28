package domain;

import java.util.ArrayList;
import java.util.List;

import domain.tellers.Teller;

public class Slot {
	
	private String geheimeCode;
	
	private List<Teller> tellers;
	
	public Slot (List<Teller> tellers, String geheimeCode)
	{
		this.geheimeCode = geheimeCode;
		this.tellers = tellers;
	}
	
	public char getWaardeTeller(int teller) {
		return this.tellers.get(teller).getHuidigeWaarde();
	}
	
	public List<Teller> getTellers() {
		return tellers;
		
	}
	
	public String getSlotKombinatie() {
		StringBuilder slotKombinatie = new StringBuilder();
		slotKombinatie.append("");
		for (Teller t:tellers)
				{
			slotKombinatie.append(Character.toString(t.getHuidigeWaarde()));

				}
		return slotKombinatie.toString();
		
	}
	
	public void updateHuidigeWaardeTeller(int teller) {
		tellers.get(teller).updateHuidigeWaarde();
		
	}
	
	public int getAantalTellers() {
		return tellers.size();
	}
	
	public boolean isGeheimGevonden() {
		char[] geheimeCodeArray = this.geheimeCode.toCharArray();
		int codeCheck = 0;
		for (Teller t:tellers)
		{
			if (t.getHuidigeWaarde() != geheimeCodeArray[codeCheck])
			{
				return false;
			}
			codeCheck++;
		}
		return true;
	}
	
	public void resetTellers() {
		for (Teller t:tellers)
		{
			t.resetHuidigeWaarde();
		}
		
	}

}
