package KlasseendefundObjektInstanz;


public class Kreis {
	private Strecke pq;
   private static final double PI = Math.PI;
	
	public Strecke getPq() {
		return pq;
	}

	public void setPq(Strecke pq) {
		this.pq = pq;
	}

	public double flaesche() {
		// TODO Auto-generated method stub
		return  PI * getPq().distanz() * getPq().distanz();

	}
	
	public double umfang() {
		// TODO Auto-generated method stub
		return 2 * PI * getPq().distanz();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
