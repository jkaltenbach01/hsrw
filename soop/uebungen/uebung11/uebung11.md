# Objektorientierte Programmierung 3

In dieser Übung soll eine Vorstufe einer 3D-Engine implementiert werden, bei der die Körper aus Kanten zusammengesetzt werden.

---

## Aufgaben

### Aufgabe 1: Klasse `Kante` und Tests

Implementieren Sie eine Klasse `Kante`, welche eine Kante mit Anfangs- und Endpunkt im $\mathbb{R}^3$ repräsentiert. Überlegen Sie jeweils, welche bereits vorhandenen Methoden Sie verwenden können.

**Komponenten der Klasse `Kante`:**
* **Attribute:** Private Attribute für Anfangs- und Endpunkt sowie passende Getter und Setter.
* **Konstruktoren:** Geeignete Konstruktoren zur Initialisierung.
* **Methoden:**
  * `public void bewege(double dX, double dY, double dZ)`: Verschiebt die Kante im Raum um die angegebenen Werte.
  * `public double laenge()`: Liefert die Länge der Kante.
  * `public boolean istParallel(Kante k)`: Stellt fest, ob zwei Kanten parallel im $\mathbb{R}^3$ liegen.
  * `public Punkt vektor()`: Liefert den Richtungsvektor der Kante vom Anfangs- zum Endpunkt zurück.
  * `public String toString()`: Gibt eine geeignete Textdarstellung der Kante zurück.

Implementieren Sie zudem eine Klasse `KanteTest`, mit der Sie Ihre Klasse und deren Funktionalitäten testen.

---

### Aufgabe 2: Anpassung der Klasse `Koerper`

* Ändern Sie die Klasse `Koerper` so, dass sie zusätzlich eine Anzahl von Kanten verwalten kann. 
* Überlegen Sie, welche Datenstruktur dafür geeignet ist, wenn die Anzahl der Kanten prinzipiell unbekannt ist.
* Passen Sie die Methode `toString()` in geeigneter Form an.
* Ändern Sie alle weiteren betroffenen Methoden so, dass sie zur neuen Struktur passen.

---

### Aufgabe 3: Anpassung der Klasse `MultiKoerper`

* Passen Sie gegebenenfalls die Klasse `MultiKoerper` an die neuen Gegebenheiten an.

---

### Aufgabe 4: Anpassung der Klasse `Wuerfel`

* Ändern Sie die Klasse `Wuerfel` so, dass sie die Kanten eines Würfels verwalten kann.
* Das Attribut `koordinate` soll als der Mittelpunkt des Würfels betrachtet werden.
* Erstellen Sie einen Konstruktor, der einen Mittelpunkt und die Kantenlänge entgegennimmt und die achsenparallelen Kanten entsprechend dieser Angaben erzeugt.
* Ändern Sie alle weiteren betroffenen Methoden so, dass sie zur neuen Struktur passen.

---

### Aufgabe 5: Anpassung der Klasse `Kugel`

Kugeln lassen sich im Rahmen dieser Übung nicht sinnvoll mit Kanten beschreiben. 

* Ändern Sie die Klasse `Kugel` so, dass sie drei Kanten verwaltet. Diese Kanten stellen die achsenparallelen Durchmesser der Kugel dar.
* Erstellen Sie einen Konstruktor, der einen Mittelpunkt und den Radius entgegennimmt und die Kanten entsprechend dieser Angaben erzeugt.
* Ändern Sie alle weiteren betroffenen Methoden so, dass sie zur neuen Struktur passen.

---

### Aufgabe 6: Sichtbarkeitsprüfung in der Klasse `Szene`

* Ändern Sie die Klasse `Szene` so, dass ein Körper (oder zusammengesetzter Körper) nur dann als sichtbar bewertet wird, wenn alle seine Kanten vollständig sichtbar sind.

---