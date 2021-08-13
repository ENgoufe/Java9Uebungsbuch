package KlasseendefundObjektInstanz;

public class MethodenAufrufe1 {

	
	 void instMethode1() {
		System.out.println("1. Instanzmethode der Klassen MethodenAufrufe1");
		instMethode2();
		klsMethode1();
	}
	
	public void instMethode2() {
		System.out.println("2. Instanzmethode der Klassen MethodenAufrufe1");
	}
	
	public static void klsMethode1() {
		System.out.println("1. Klassenmethode der Klassen MethodenAufrufe1");
	}
	
	public static void klsMethode2() {
		System.out.println("2. Klassenmethode der Klassen MethodenAufrufe1");
		MethodenAufrufe1 mt1 = new MethodenAufrufe1();
		mt1.instMethode2();
		klsMethode1();
	}
}
