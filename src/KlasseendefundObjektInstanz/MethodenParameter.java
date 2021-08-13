package KlasseendefundObjektInstanz;

public class MethodenParameter {

	
	
	public void methode1(int x, int[] y){
		x = 0;
		y[1] = 0;
	}
	public void methode2(Punkt x, Punkt[] y){
		x.setX(0);
		x.setY(0);
		y[1].setX(0);
		y[1].setY(0);
	}
	public void methode3(Punkt x){
		x = new Punkt(3, 5);
		
	}
	
	public static void main(String[] args) {
		
		int a = 2;
		int [] arr = {2, 3, 5};
		Punkt p1 = new Punkt(2, 5);
		Punkt[] parr = {new Punkt(4, 1), new Punkt(7, 6)};
		
	}

}
