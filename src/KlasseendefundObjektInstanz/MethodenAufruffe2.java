package KlasseendefundObjektInstanz;


public class MethodenAufruffe2 {

	public void instMethode() {
		// TODO Auto-generated method stub
		System.out.println("Inst Klassen MethodenAufruffe2");
		MethodenAufrufe1 inst1 = new MethodenAufrufe1();
		inst1.instMethode1();
		MethodenAufrufe1.klsMethode2();
		
	}
	
	public static void klsMethode() {
		// TODO Auto-generated method stub
		System.out.println("Kls Klassen MethodenAufruffe2");
		MethodenAufrufe1 inst2 = new MethodenAufrufe1();
		inst2.instMethode1();
		MethodenAufrufe1.klsMethode2();
	}
	
	public static void main(String[] args) {
		MethodenAufruffe2.klsMethode();
		MethodenAufruffe2 ma2 = new MethodenAufruffe2();
		ma2.instMethode();
		
		
	}
}
