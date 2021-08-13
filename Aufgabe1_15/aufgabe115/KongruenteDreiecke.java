package aufgabe115;

public class KongruenteDreiecke {
	public static double winkeldeg(double winkel) {
		return winkel * 180 / 3.14;
	}
	public static double winkelrad(double winkel) {
		return winkel * 3.14 / 180 ;
	}
	private double x;
	
	private double y;
	
	private double z;

	public KongruenteDreiecke(double x, double y, double z) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setZ(double z) {
		this.z = z;
	}

	public KongruenteDreiecke sss() {
		double winkel1 = Math.round(winkeldeg(Math.acos((y*y + z*z - x*x)/ 2*y*z)));
		
		double winkel2 = Math.round(winkeldeg(Math.acos((x*x + z*z - y*y)/2*x*z)));
		
		double winkel3 = Math.round(winkeldeg(Math.acos((x*x + y*y - z*z)/2*x*y)));
		
		return new KongruenteDreiecke(winkel1, winkel2, winkel3);
		
	}
	
public KongruenteDreiecke ssw() {
	double winkel1 = Math.round(winkeldeg(Math.asin(x* Math.sin(winkelrad(z))/y)));
	
	double w2 = 180-z-winkel1;
	double s = Math.round(y * Math.sin(winkelrad(w2))/ Math.sin(winkelrad(z)));
	return new KongruenteDreiecke(winkel1, w2, s);
}
public KongruenteDreiecke sws() {
	double s = Math.sqrt(x*x + z*z - 2 * x * z * Math.cos(winkelrad(y)));
	
	this.x = Math.sqrt(y*y + z*z - 2 * y * z * Math.cos(x));
	
	this.z = Math.sqrt(x * x + y * y - 2 * x * y * Math.cos(z));
	return new KongruenteDreiecke(x, s, z);
		
	}
public KongruenteDreiecke wsw() {
	double winkel = 180-z-x;
	double s1 = Math.round(y * Math.sin(winkelrad(x))/ Math.sin(winkelrad(winkel)));
	double s2 = Math.round(y * Math.sin(winkelrad(z))/ Math.sin(winkelrad(winkel)));
	return new KongruenteDreiecke(s1, winkel, s2);
}

}
