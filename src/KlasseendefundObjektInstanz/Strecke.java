package KlasseendefundObjektInstanz;

public class Strecke {
	private Punkt p;
	private  Punkt q;
	
	public Strecke(Punkt p, Punkt q) {
	
		this.p = p;
		this.q = q;
	}

	public Punkt getP() {
		return p;
	}

	public void setP(Punkt p) {
		this.p = p;
	}

	public Punkt getQ() {
		return q;
	}

	public void setQ(Punkt q) {
		this.q = q;
	}
	
	
	public double distanz() {
		double xp = p.getX();
		double yp = p.getY();
		double xq = q.getX();
		double yq = q.getY();
		
		return Math.round(Math.sqrt((xq- xp)*(xq- xp) + (yq- yp)*(yq- yp)));
		
	}
	public void geradenGleichung() {
		// TODO Auto-generated method stub
		double xp = p.getX();
		double yp = p.getY();
		double xq = q.getX();
		double yq = q.getY();
		
		System.out.println("y - " +yp+ " = (" +yq+ " - " +yp+ ")/(" +xq+ " - " +xp+ ")(X - "+xp+")");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
