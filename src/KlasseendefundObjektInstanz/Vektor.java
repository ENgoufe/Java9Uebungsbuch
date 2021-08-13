package KlasseendefundObjektInstanz;

public class Vektor {
	private int x;
	private int y; 
	private int z;
	
	public Vektor() {
		this(0, 0, 0);
	}
	public Vektor(int x, int z, int y){
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	public Vektor(Vektor v) {
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
	}
	public  void anzeige() {
		// TODO Auto-generated method stub
		System.out.println("(" +this.x+ ", " +this.y+ ", " +this.z+ ")");

	}
	
	public Vektor vektorObjekt(int x, int y, int z) {
		this.x += x;
		this.y += y;
		this.z += z;
		return this;
	}
	public Vektor vektorObjekt(Vektor v) {
		this.x += v.x;
		this.y += v.y;
		this.z += v.z;
		return this;

	}

	public static void main(String[] args) {
		Vektor V1 = new Vektor();
		V1.anzeige();
		Vektor v2 = new Vektor(4, 5, 2);
		v2.anzeige();
		Vektor v3 = new Vektor(v2);
		v3.anzeige();
		V1.vektorObjekt(3, 4, 6);
		V1.anzeige();
		
		v2.vektorObjekt(v3);
		v2.anzeige();

	}

}
