# Methoden

## Aufgaben

### Aufgabe 1

Schreiben Sie eine Methode `public static int max(int a, int b)`, die zwei Ganzzahlen entgegennimmt und die größere der beiden Zahlen zurückgibt.

### Aufgabe 2

Schreiben Sie eine Methode `public static int minmax(int a, int b, boolean max)`, die zwei Ganzzahlen und einen booleschen Wert `max` entgegennimmt und in Abhängigkeit des Wertes `max` Folgendes zurückgibt:

* Die **größere** der beiden Zahlen, wenn `max` den Wert `true` hat.
* Die **kleinere** der beiden Zahlen, wenn `max` den Wert `false` hat.

### Aufgabe 3

Schreiben Sie eine Methode `public static int quersumme(int n)`, welche die Quersumme der natürlichen Zahl $n$ berechnet und zurückliefert. Die Quersumme einer Zahl ist die Summe ihrer einzelnen Ziffern.

> **Hinweis:** Dies stellt keine Konsolenausgabe dar, sondern zeigt Beispiele für Parameter und Rückgabewerte:
> * $n = 7 \implies \text{Quersumme} = 7$
> * $n = 247 \implies \text{Quersumme} = 13$
> * $n = 1000 \implies \text{Quersumme} = 1$

### Aufgabe 4

Schreiben Sie eine Methode `gauss`, welche eine natürliche Zahl $n$ entgegennimmt und die Summe der Zahlen von $1$ bis $n$ zurückliefert. Verwenden Sie dazu die Gaußsche Summenformel:

$$
s = \frac{n \cdot (n + 1)}{2}
$$

### Aufgabe 5

Schreiben Sie eine Methode `zahlRueckwaerts`, die eine natürliche Zahl als Parameter entgegennimmt und eine natürliche Zahl zurückliefert, welche die Ziffern des Parameters in umgekehrter Reihenfolge enthält.

> **Hinweis:** Dies stellt keine Konsolenausgabe dar, sondern zeigt Beispiele für Parameter und Rückgabewerte:
> * $\text{Parameter} = 23 \implies \text{Ergebnis} = 32$
> * $\text{Parameter} = 483 \implies \text{Ergebnis} = 384$
> * $\text{Parameter} = 1760 \implies \text{Ergebnis} = 671$

### Aufgabe 6

Schreiben Sie eine Methode `public static double abstand(double x1, double y1, double x2, double y2)`, welche den geometrischen (euklidischen) Abstand der beiden Punkte $(x_1, y_1)$ und $(x_2, y_2)$ zurückliefert. 

Der geometrische Abstand berechnet sich nach der Formel:

$$
d = \sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}
$$
 ---