package KlasseendefundObjektInstanz;


public class QuadratDefinition {
	int a;
	
	public QuadratDefinition(int a) {
		this.a = a;
	}
	
	public double flaesche() {
		return a*a;
	}
	
	public static double flaesche(QuadratDefinition qd) {
		return qd.a*qd.a;
	}
	
	
	public static void main(String[] args) {
		QuadratDefinition instDefinition= new QuadratDefinition(5);
		System.out.println(instDefinition.flaesche());
		System.out.println(QuadratDefinition.flaesche(instDefinition));
	}

}
