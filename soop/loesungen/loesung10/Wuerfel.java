

public class Wuerfel extends Koerper
{
   private double laenge;
   
   public Wuerfel(String f, double x, double y, double z, double l){
      super(f, x, y, z);
      log("Wuerfel(String, double, double, double, double)");
      this.laenge = l;
   }
   
   public Wuerfel(){
      super();
      log("Wuerfel()");
      this.laenge = 0.0;
   }
   
   public void setLaenge(double l){
      log("setLaenge(double)");
      this.laenge = l;
   }
   
   public double getLaenge(){
      log("getLaenge()");
      return this.laenge;
   }

   @Override
   public double volumen(){
      log("volumen()");
      return Math.pow(this.laenge, 3);
   }
   
   @Override
   public double flaeche(){
      log("flaeche()");
      return 6 * (laenge * laenge);
   }
   
   public double abstand(Wuerfel w){
      log("abstand(Wuerfel)");
      Punkt p= new Punkt(w.koordinate.x,w.koordinate.y,w.koordinate.z);
      Punkt p2= new Punkt(this.koordinate.x,this.koordinate.y,this.koordinate.z);
      p2.bewege(this.laenge/2, this.laenge/2, this.laenge/2);
      p.bewege(w.laenge/2, w.laenge/2, laenge/2);
      return p.abstand(p2);
	      
	   }
   
   public String toString() {
      log("toString()");
      return "Würfel@" + this.koordinate + ", Farbe: " + this.farbe + ", Länge: " + this.laenge;
   }
   
}
