

public class Koerper {
	public String farbe;
	public Punkt koordinate;
	public static boolean DEMO = false;
	
	public Koerper(String f, double x, double y, double z) {
		log("Koerper(double, double, double, String)");
		this.farbe = f;
		this.koordinate = new Punkt(x, y, z);
	}
	
	public Koerper(){
		this("schwarz", 0, 0, 0);
		log("Koerper()");
	}
	
	public double volumen(){
		log("volumen()");
		return(0.0);
	}
	
	public double flaeche(){
		log("flaeche()");
	    return(0.0);
	}
	
	public double abstand(Koerper k) {
		log("abstand(Koerper)");
		return this.koordinate.abstand(k.koordinate);
	}
	
	public String toString(){
		log("toString()");
	    return("Körper@"+this.koordinate.toString()+ ", Farbe: " + this.farbe);
	}

	protected void log(String methodName) {
		if (DEMO) {
			System.out.println("Klasse: " + this.getClass().getSimpleName() +
					           " - Methode: " + methodName);
		}		
	}
}
