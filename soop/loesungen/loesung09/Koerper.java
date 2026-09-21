

public class Koerper {
	public String farbe;
	public Punkt koordinate;
	
	public Koerper(String f, double x, double y, double z) {
		this.farbe = f;
		this.koordinate = new Punkt(x, y, z);
	}
	
	public Koerper(){
	   this("schwarz", 0, 0, 0);
	}
	
	public double volumen(){
	   return(0.0);
	}
	
	public double flaeche(){
	   return(0.0);
	}
	
	public double abstand(Koerper k) {
		return this.koordinate.abstand(k.koordinate);
	}
	
	public String toString(){
	   return("Körper@"+this.koordinate.toString()+ ", Farbe: " + this.farbe);
	}
}
