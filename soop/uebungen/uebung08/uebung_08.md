# Rekursion

## Aufgaben

### Aufgabe 1

Gegeben sei folgende rekursiv definierte Funktion:

$$
f(n) =
\begin{cases}
  1, & \text{für } n = 1 \\
  f(n-1) + 2n - 1, & \text{sonst}
\end{cases}
$$

* Implementieren Sie eine rekursive Java-Methode, die $f(n)$ berechnet.
* Was berechnet $f(n)$?
* Geben Sie eine nicht-rekursive Implementierung von $f$ an.

### Aufgabe 2

Schreiben Sie eine rekursive Methode, welche die folgende Reihe berechnet:

$$
m(i) = 1 + \frac{1}{2} + \frac{1}{3} + \dots + \frac{1}{i}
$$

Schreiben Sie ein Testprogramm, das $m(i)$ für $i = 1, 2, \dots, 10$ ausgibt.

### Aufgabe 3

Schreiben Sie eine rekursive Methode, welche die folgende Reihe berechnet:

$$
m(i) = \frac{1}{2} + \frac{2}{3} + \dots + \frac{i}{i+1}
$$

Schreiben Sie ein Testprogramm, das $m(i)$ für $i = 1, 2, \dots, 10$ ausgibt.

### Aufgabe 4

Erstellen Sie ein Programm, das die $n$-te Fibonacci-Zahl rekursiv berechnet. Verwenden Sie dazu die Methode `fibonacci` aus dem Skript.

* Schreiben Sie ein Testprogramm, das `fibonacci(n)` für $n = 1, 2, \dots, 40$ berechnet und jeweils die Laufzeit (s. u.) ausgibt.
* Erweitern Sie das Programm so, dass es die Anzahl der Aufrufe der Methode `fibonacci` bestimmt und am Ende ausgibt. Sie benötigen dafür evtl. eine statische Klassenvariable.
* Implementieren Sie die Berechnung der Fibonacci-Zahlen iterativ und vergleichen Sie die Laufzeiten für $n = 1 \dots 40$.

> **Hinweis:** Sie können die aktuelle Systemzeit mit `System.currentTimeMillis()` ermitteln.

### Aufgabe 5

Schreiben Sie eine rekursive Methode `public static int quersumme(long n)`, welche die Quersumme des übergebenen Parameters zurückliefert.

* **Beispiel:** Der Aufruf `quersumme(234)` liefert das Ergebnis `9` ($2 + 3 + 4$).

### Aufgabe 6

Implementieren Sie eine rekursive Methode `public static String reverse(String s)`, welche den übergebenen String rückwärts zurückliefert.

* **Beispiel:** Der Aufruf `reverse("abcd")` liefert `"dcba"` zurück.

---