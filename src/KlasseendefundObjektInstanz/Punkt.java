package KlasseendefundObjektInstanz;

public class Punkt {
	private double x;
	private double y;
	
	public Punkt(double x, double y) {
		// TODO Auto-generated constructor stub
		this.x= x; 
		this.y = y;
	}
	
	

	public double getX() {
		return x;
	}



	public void setX(double x) {
		this.x = x;
	}



	public double getY() {
		return y;
	}



	public void setY(double y) {
		this.y = y;
	}
	
	public void anzeige() {
		System.out.println("(" +getX()+ ", " +getY()+ ")");
	}



	public static void main(String[] args) {
		Punkt p1 = new Punkt(6, 4);
		p1.anzeige();

	}

}
