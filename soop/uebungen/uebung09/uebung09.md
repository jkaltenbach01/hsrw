# Objektorientierte Programmierung

## Aufgaben

### Aufgabe 1
Implementieren Sie eine Klasse `Bruch`, welche die grundsätzlichen Operationen der Bruchrechnung bereitstellt.

Komponenten der Klasse `Bruch`:

* ganzzahlige Attribute für Zähler und Nenner
* Konstruktor mit zwei ganzzahligen Parametern für Zähler und Nenner
* Konstruktor mit einem ganzzahligen Parameter. Bedeutung: Der Konstruktor erzeugt einen Eintel-Bruch (z. B. $\frac{1}{3}$). Rufen Sie im Konstruktor den oben genannten Konstruktor für Zähler und Nenner mit zwei geeigneten Werten auf.  
  *Beispiel:* Wenn der Parameter 3 lautet, soll der Zähler den Wert 1 und der Nenner den Wert 3 annehmen.
* Methode `public String toString()`, welche den Bruch als Zeichenkette zurückliefert.  
  *Beispiel:* Wenn der Wert des Zählers 3 und der Wert des Nenners 4 ist, liefert die Methode die Zeichenkette `"3 / 4"` zurück.
* Methode `public void addiere(Bruch b)`. Die Methode ändert dieses (`this`) Objekt, indem sie das Objekt `b` dazuaddiert.  
  *Beispiel:* Es gibt zwei Objekte des Typs `Bruch` mit den Namen `a` und `b`. Das Objekt `a` hat den Wert $\frac{1}{3}$ und das Objekt `b` den Wert $\frac{1}{4}$. Nach dem Aufruf `a.addiere(b)` hat das Objekt `a` den Wert $\frac{7}{12}$ und der Wert des Objekts `b` ist unverändert.
* Methode `public void subtrahiere(Bruch b)` analog der Methode `addiere`. Die Methode ändert dieses (`this`) Objekt, indem sie das Objekt `b` davon subtrahiert.
* Methode `public void multipliziere(Bruch b)` analog der Methode `addiere`. Die Methode ändert dieses (`this`) Objekt, indem sie das Objekt `b` dazumultipliziert.
* Methode `public void dividiere(Bruch b)` analog der Methode `addiere`. Die Methode ändert dieses (`this`) Objekt, indem sie es durch das Objekt `b` dividiert.
* Methode `public double wert()`, welche den Wert des Bruchs als Gleitkommazahl zurückliefert.  
  *Beispiel:* Wenn dieses (`this`) Objekt den Wert $\frac{1}{4}$ hat, liefert der Aufruf der Methode den Wert `0.25` zurück.
* Methode `public void kuerze()`, welche diesen Bruch kürzt. Überlegen Sie, wie Sie die bekannten Verfahren zur Ermittlung des ggT nutzen können. Implementieren Sie die Ermittlung des ggT als private Methode der Klasse `Bruch`.  
  *Beispiel:* Ein Objekt des Typs `Bruch` habe den Wert $\frac{2}{4}$. Nach dem Aufruf der Methode `kuerze` hat sich der Wert des Objekts auf $\frac{1}{2}$ geändert.  
  Ändern Sie Ihre Berechnungsmethoden so ab, dass das Ergebnis am Ende immer mit dieser Methode gekürzt wird. Vergleichen Sie auch, wie die Ergebnisse aussehen, wenn Ihre Methoden am Ende nicht die Methode `kuerze` aufrufen.
* Methode `public static Bruch addiere(Bruch a, Bruch b)`. Diese Methode ist eine statische Methode der Klasse `Bruch`, welche kein Objekt ändert, sondern ein neues Objekt des Typs `Bruch` erzeugt und zurückliefert.  
  *Beispiel:* Es gibt zwei Objekte des Typs `Bruch` mit den Namen `a` und `b`. Das Objekt `a` hat den Wert $\frac{1}{3}$ und das Objekt `b` den Wert $\frac{1}{4}$. Der Aufruf `Bruch.addiere(a, b)` liefert ein neues Objekt des Typs `Bruch` mit dem Wert $\frac{7}{12}$ zurück. Die Werte der Objekte `a` und `b` sind unverändert.
* Methode `public static Bruch subtrahiere(Bruch a, Bruch b)` analog der Methode `addiere(Bruch a, Bruch b)`.
* Methode `public static Bruch multipliziere(Bruch a, Bruch b)` analog der Methode `addiere(Bruch a, Bruch b)`.
* Methode `public static Bruch dividiere(Bruch a, Bruch b)` analog der Methode `addiere(Bruch a, Bruch b)`.

Implementieren Sie eine Klasse `BruchTest`, mit der Sie Ihre Klasse testen (entweder mit JUnit oder in der `main`-Methode).

---

### Aufgabe 2
Implementieren Sie eine Klasse `Punkt`, welche einen Punkt im $\mathbb{R}^3$ (dreidimensionaler Raum) repräsentiert.

Komponenten der Klasse `Punkt`:

* Öffentliche `double` Attribute `x`, `y` und `z`, welche die Koordinate des Punktes im Raum repräsentieren.
* Ein Konstruktor mit drei `double`-Parametern zum Erzeugen von `Punkt`-Objekten.
* Methode `public void bewege(double dX, double dY, double dZ)`, welche den Punkt im Raum um die angegebenen Werte verschiebt.
* Methode `public double abstand(Punkt p)`, liefert den Abstand zwischen den Positionen dieses Punkt und des Punkt `p` in euklidischer Metrik.
* Methode `public String toString()`, welche eine Zeichenkette der Form `(x, y, z)` zurückliefert.

Implementieren Sie eine Klasse `PunktTest`, mit der Sie Ihre Klasse testen.

---

### Aufgabe 3
Implementieren Sie eine Klasse `Koerper`, welche dreidimensionale geometrische Körper im $\mathbb{R}^3$ repräsentiert.

Komponenten der Klasse `Koerper`:

* Öffentliches Attribut `String farbe`, das die Farbe des Körpers speichert
* Öffentliches Attribut `koordinate` vom Typ `Punkt`
* Konstruktor mit vier Parametern: für die Koordinate und die Farbe
* Parameterloser Konstruktor, der die Farbe auf den Wert `schwarz` setzt und den Körper im Koordinatenursprung platziert. Der parameterlose Konstruktor verwendet den anderen, parametrisierten Konstruktor.
* Methode `public double volumen()`, liefert das Volumen dieses `Koerper`. Da bei einer allgemeinen Form nicht klar ist, wie groß das Volumen ist, wird `0.0` geliefert.
* Methode `public double flaeche()`, liefert den Oberflächeninhalt dieses `Koerper`. Da bei einer allgemeinen Form nicht klar ist, wie groß der Flächeninhalt ist, wird `0.0` geliefert.
* Methode `public double abstand(Koerper k)`, liefert den Abstand zwischen den Positionen dieses `Koerper` und des `Koerper k` in euklidischer Metrik. Verwenden Sie die Methode `abstand` der Klasse `Punkt`.
* Methode `public String toString()`, liefert alle Datenfelder des `Koerper` in einem String zurück. Ist diese Methode neu oder überschrieben? Wenn sie überschrieben ist, von welcher Klasse erbt `Koerper` sie und welche Informationen liefert sie beim Aufruf in der Superklasse?

Implementieren Sie eine Klasse `KoerperTest`, mit der Sie Ihre Klasse testen.

---

### Aufgabe 4
Leiten Sie von der Klasse `Koerper` eine Klasse `Kugel` ab, welche eine Kugel im $\mathbb{R}^3$ repräsentiert. Das Attribut `koordinate` repräsentiert den Mittelpunkt der Kugel.

Weitere Komponenten der Klasse `Kugel`:

* Attribut `private double radius`, das den Radius der Kugel speichert.
* Konstruktor, der geeignete Parameter für alle Attribute enthält.
* Methode `public void setRadius()` mit der der Radius gesetzt werden kann. Es handelt sich hierbei um eine sogenannte Setter-Methode. Recherchieren Sie selbständig, was Getter- und Setter-Methoden sind.
* Überschreiben Sie die Methoden `volumen` und `flaeche` in der für Kugeln spezifischen Weise. Die Konstante $\pi$ ist in der Klasse `Math` der Java-API enthalten.
* Falls die Methode `abstand` eine Kugel übergeben bekommt, soll sie den korrekten Abstand zwischen dieser Kugel und der übergebenen Kugel liefern. Hier ist der Abstand zwischen den Kugeloberflächen gemeint.
* Ansonsten liefert sie den Abstand zwischen dem Mittelpunkt dieser Kugel und der `koordinate` des übergebenen `Koerper`.  
  *Hinweis:* Sie müssen in der Methode nicht herausfinden, welchen Typ der Parameter hat sondern können sich die objektorientierten Prinzipien von Vererbung und Überladen zunutze machen. Recherchieren Sie selbständig, was Überladen bedeutet. Achtung: Im Buch 'Java ist auch eine Insel' wird Überladen am Beispiel von zwei Methoden derselben Klasse erläutert. Das Prinzip gilt aber ebenso für Methoden aus Ober- und Unterklassen (vererbende und erbende Klassen).
* Überschreiben Sie die Methode `toString` so, dass auch das neue Attribut zurückgeliefert wird.

Implementieren Sie eine Klasse `KugelTest`, mit der Sie Ihre Klasse testen.

---

### Aufgabe 5
Leiten Sie von der Klasse `Koerper` eine Klasse `Wuerfel` ab, welche einen Würfel im $\mathbb{R}^3$ repräsentiert. Der Würfel liegt achsenparallel zum Koordinatensystem. Das Attribut `koordinate` repräsentiert die vordere linke untere Ecke des Würfels.

Weitere Komponenten der Klasse `Wuerfel`:

* Attribut `private double laenge`, das die Kantenlänge des Würfels speichert
* Getter- und Setter-Methoden für das Attribut `laenge`
* Konstruktor, der geeignete Parameter für alle Attribute enthält.
* Überschreiben Sie die Methoden `volumen` und `flaeche` in der für Würfel spezifischen Weise.
* Überschreiben Sie die Methode `toString` so, dass auch das neue Attribut zurückgeliefert wird.
* Falls die Methode `abstand` einen `Wuerfel` übergeben bekommt, soll sie den korrekten Abstand zwischen den Mittelpunkten dieses und des übergebenen `Wuerfel` liefern.
* Ansonsten liefert sie den Abstand zwischen den Koordinaten dieses `Wuerfel` und des übergebenen `Koerper`.

Implementieren Sie eine Klasse `WuerfelTest`, mit der Sie Ihre Klasse testen.

---