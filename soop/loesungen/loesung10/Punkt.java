

public class Punkt {
	public double x, y, z;
	public static boolean DEMO = false;
	
	public Punkt(double x, double y, double z) {
		log("Punkt(double, double, double)");
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void bewege(double dX, double dY, double dZ){
		log("bewege()");
		this.x += dX;
		this.y += dY;
		this.z += dZ;
	}
	
	public double abstand(Punkt p) {
		log("abstand(Punkt)");
		return Math.sqrt( (p.x - this.x) * (p.x - this.x)
				          + (p.y - this.y) * (p.y - this.y)
				          + (p.z - this.z) * (p.z - this.z));
	}
	
	public String toString(){
		log("toString()");
		return("("+this.x+", "+this.y+", "+this.z+")");
	}

	protected void log(String methodName) {
		if (DEMO) {
			System.out.println("Klasse: " + this.getClass().getSimpleName() +
					           " - Methode: " + methodName);
		}		
	}
}
