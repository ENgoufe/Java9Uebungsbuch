package KlasseendefundObjektInstanz;

public class Buch {
	private int  naechsteSeite;
	
	public Buch(int a) {
		// TODO Auto-generated constructor stub
		this.naechsteSeite= 0;
	}
	
	public void rueckblaettern(int seitenNummer) {
		// TODO Auto-generated method stub

	}
	public void vorwaertsBlaettern(int seitenNummer) {
		// TODO Auto-generated method stub
		if (naechsteSeite) {
			
		}

	}
	

	public int getNaechsteSeite() {
		return naechsteSeite;
	}

	public void setNaechsteSeite(int naechsteSeite) {
		this.naechsteSeite = naechsteSeite;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
