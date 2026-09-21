

public class Punkt {
	public double x, y, z;
	
	public Punkt(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void bewege(double dX, double dY, double dZ){
	   this.x += dX;
	   this.y += dY;
	   this.z += dZ;
	}
	
	public double abstand(Punkt p) {
		return Math.sqrt( (p.x - this.x) * (p.x - this.x)
				          + (p.y - this.y) * (p.y - this.y)
				          + (p.z - this.z) * (p.z - this.z));
	}
	
	public String toString(){
	   return("("+this.x+", "+this.y+", "+this.z+")");
	}
}
