# Schleifen

## Aufgaben

### Aufgabe 1

Schreiben Sie ein Programm, das vom Benutzer eine positive Ganzzahl abfragt und die Summe der Zahlen von 1 bis zu dieser Ganzzahl ausgibt.

**Beispiel der Programmausführung:**

```
Zahl: 8
Summe 1 .. 8 = 36
```

---

### Aufgabe 2

Schreiben Sie ein Programm, das Eingaben des Benutzers entgegennimmt und diese aufaddiert. Sobald die Summe den Wert 100 überschritten hat, soll die Summe ausgegeben und das Programm beendet werden.

**Beispiele des Programmablaufs:**

*Durchlauf 1:*
```
Zahl: 40
Zahl: 31
Zahl: 34
Summe = 105
```

*Durchlauf 2:*
```
Zahl: 60
Zahl: 10
Zahl: 15
Zahl: 7000
Summe = 7085
```

---

### Aufgabe 3

Schreiben Sie ein Programm, das vom Benutzer ein Intervall abfragt und alle ganzen Zahlen im gegebenen Intervall auflistet.

**Beispiel der Programmausführung:**

```
Untere Grenze: 3
Obere Grenze: 8
Die Reihe lautet: 3 4 5 6 7 8
```

---

### Aufgabe 4

Schreiben Sie ein Programm, das vom Benutzer ein Intervall abfragt und alle Zahlen dieses Intervalls ausgibt, die entweder durch 3 oder durch 4 teilbar sind, aber nicht durch beide.

**Beispiel der Programmausführung:**

```
Untere Grenze: 15
Obere Grenze: 31
Die Reihe lautet: 15 16 18 20 21 27 28 30
```

---

### Aufgabe 5

Schreiben Sie ein Programm, das vom Benutzer zwei Zahlen als Höhe und Breite eines Rechtecks abfragt und das Rechteck wie im Beispiel dargestellt ausgibt.

**Beispiele der Programmausführung:**

*Durchlauf 1:*
```
Höhe: 3
Breite: 4
****
****
****
```

*Durchlauf 2:*
```
Höhe: 3
Breite: 2
**
**
**
```

---

### Aufgabe 6

Schreiben Sie ein Programm, das vom Benutzer zwei Zahlen als Höhe und Breite eines Rechtecks abfragt und das Rechteck wie im Beispiel dargestellt ausgibt.

**Beispiele der Programmausführung:**

*Durchlauf 1:*
```
Höhe: 4
Breite: 3
***
* *
* *
***
```

*Durchlauf 2:*
```
Höhe: 4
Breite: 5
*****
*   *
*   *
*****
```

---

### Aufgabe 7

Gegeben sei die Reihe

$$
\sum_{i=1}^{n} \frac{1}{2i} = \frac{1}{2} + \frac{1}{4} + \dots + \frac{1}{2n}
$$

Schreiben Sie ein Programm, das die Zahl $n$ vom Benutzer abfragt und die Summe ermittelt.

**Beispiel der Programmausführung:**

```
Zahl n: 5
Summe = 1.141666666666667
```

---

### Aufgabe 8

Gegeben sei die Leibnizsche Reihendarstellung der Kreiszahl $\pi$:

$$
\pi = 4 \cdot \left( \frac{1}{1} - \frac{1}{3} + \frac{1}{5} - \frac{1}{7} + \frac{1}{9} \mp \dots \right)
$$

Schreiben Sie ein Programm, das mit der oben genannten Formel und einer Schleife einen Näherungswert für $\pi$ berechnet. Das Programm soll vom Benutzer den maximalen Fehler $\epsilon$ abfragen und mit der Berechnung enden, sobald der im aktuellen Schleifendurchlauf berechnete Näherungswert für $\pi$ sich um weniger als $\epsilon$ vom Näherungswert des vorherigen Schleifendurchlaufs unterscheidet.

**Beispiel der Programmausführung:**

```
Epsilon eingeben: 0.0001
Pi = 3.1416426510898874
```

> **Hinweis:** Beachten Sie, dass bei sehr kleinem $\epsilon$ (etwa ab $< 10^{-6}$) die Laufzeit entsprechend der Rechenleistung Ihres Computers durchaus im Minuten- oder gar Stundenbereich liegen kann. Lassen Sie sich ggf. je Schleifendurchlauf den aktuellen Näherungswert für $\pi$ ausgeben, um das Programm zu beobachten.

---
