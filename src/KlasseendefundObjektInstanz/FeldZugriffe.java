package KlasseendefundObjektInstanz;


//Aufgabe1.3
public class FeldZugriffe {

	static int zaehlerAlsKlasseFeld;
	static int zaehlerAlsInstanzFeld;
	
	public FeldZugriffe() {
	
		zaehlerAlsInstanzFeld++;
		zaehlerAlsKlasseFeld++;
	}
	
	public void anzeigeKlsMeth() {
		System.out.println(zaehlerAlsKlasseFeld);
	}
	
	public void anzeigeInstMeth() {
		System.out.println(zaehlerAlsInstanzFeld);
	}
	
	public static void main(String[] args) {
		FeldZugriffe fz1 = new FeldZugriffe();
		fz1.anzeigeKlsMeth();
		fz1.anzeigeInstMeth();
	}
}
