# Arrays, Diverses

## Aufgaben

### Aufgabe 1

Hinweis: Die folgende Aufgabe kennen Sie inhaltlich bereits aus Übung 3 Aufgabe 3. In den folgenden Aufgaben soll die gegebenenfalls bereits vorhandene Lösung angepasst werden.

Die beiden Nullstellen einer quadratischen Gleichung der Form

$$
ax^2 + bx + c = 0
$$

können mit der folgenden Formel ermittelt werden:

$$
n_1 = \frac{-b + \sqrt{b^2 - 4ac}}{2a}
$$

und

$$
n_2 = \frac{-b - \sqrt{b^2 - 4ac}}{2a}
$$

$b^2 - 4ac$ nennt man die Diskriminante der quadratischen Gleichung. Falls sie positiv ist hat die Gleichung zwei Nullstellen. Falls sie 0 ist hat die Gleichung eine Nullstelle. Falls sie negativ ist hat die Gleichung keine Nullstelle.

Schreiben Sie ein Programm, das von der Konsole die Werte für $a$, $b$ und $c$ einliest und nach Prüfung der Diskriminante die Nullstellen ausgibt.

Beispiele:

```
Geben Sie a, b, c ein: 1.0 3 1
Die Nullstellen sind -0.3819660112501051 und -2.618033988749895
```

```
Geben Sie a, b, c ein: 1.0 2.0 1.0
Die Nullstelle ist -1
```

```
Geben Sie a, b, c ein: 1 2 3
Die Gleichung hat keine reellen Nullstellen.
```

### Aufgabe 2

Schreiben Sie eine Methode `public static double[] nullstellen(double a, double b, double c)`, welche die Nullstellen aus a, b und c entsprechend Aufgabe 1 berechnet und ein Array mit den Nullstellen zurückgibt. In Abhängigkeit der Anzahl der Nullstellen hat das zurückgegebene Array die Länge 0, 1, oder 2.

Wandeln Sie Ihre Lösung zu Aufgabe 1 so ab, dass in der main-Methode die Methode nullstellen verwendet wird, um die Berechnungen durchzuführen. Nehmen Sie die Ausgaben auf der Basis der Länge des zurückgegebenen Arrays vor.

Quellcode-Beispiel:

```java
double[] nst = nullstellen(1, 2, 1);
// Das Array nst müsste jetzt die Länge 1 haben und in der
// ersten Zelle (Index 0) den Wert -1.0 enthalten.
```

### Aufgabe 3

Schreiben Sie ein Programm, das mittels geschachtelter Schleifen alle möglichen 3-stelligen Kombinationen der Ziffern 0 und 1 ausgibt. Anmerkung: Diese Kombinationen entsprechen den Eingabewerten von Wahrheitstabellen aus der Logik (fragen Sie ggf. die Suchmaschine Ihrer Wahl).

Ausgabe:

```
0 0 0
0 0 1
0 1 0
...
1 1 0
1 1 1
```

Erweitern Sie Ihre Lösung auf 4 Stellen.

Erweitern Sie Ihre Lösung so, dass der Benutzer die Anzahl der Stellen eingeben kann.

### Aufgabe 4

Schreiben Sie eine Methode `public static boolean viererfolge(int[] zahlen)`, die true zurückgibt, wenn das übergebene Array aufeinanderfolgend mindestens vier gleiche Zahlen enthält (z. B. `{2, -1, 7, 3, 3, 3, 3, 3, 9, 0}`).

### Aufgabe 5

Schreiben Sie eine Methode `doppelt`, die ein Array mit ganzen Zahlen als Parameter entgegennimmt und ein neues Array zurückliefert, das die doppelten Werte des übergebenen Arrays enthält.

Beispiel

```
Eingabe: [2,4,7,-3,5]
Ausgabe: [4,8,14,-6,10]
```

### Aufgabe 6

Schreiben Sie eine Methode `quadrate`, die ein Array mit ganzen Zahlen als Parameter entgegennimmt und ein Array zurückliefert, das alle Quadratzahlen (und nur diese) des übergebenen Arrays enthält.

Achtung! Sie sollen nicht die Eingabe quadrieren, sondern die Zahlen der Eingabe heraussuchen, die bereits Quadratzahlen sind und diese als Array zurückliefern.

### Aufgabe 7

Schreiben Sie eine Methode `public static boolean istPrim(long x)`, die für eine übergebene Zahl feststellt, ob diese eine Primzahl ist und in diesem Fall true zurückliefert. Hinweis: Das Sieb des Eratosthenes ist hier nicht geeignet, da die zu testende Zahl sehr groß sein könnte.

### Aufgabe 8

Schreiben Sie eine Methode `public static long[] primfaktoren(long x)`, die für eine übergebene Zahl ein Array mit den Primfaktoren zurückliefert. Überlegen Sie, ob Sie für ein Teilproblem die Methode istPrim aus der vorherigen Aufgabe verwenden können.

Beispiele

```
Eingabe 1: 42
Ausgabe 1: [2,3,7]
```

```
Eingabe 2: 1400
Ausgabe 2: [2,2,2,5,5,7]
```