# Bedingte Ausführung, Datentypen

## Aufgaben

### Aufgabe 1

Schreiben Sie ein Programm, das drei Zahlen einliest und diese in sortierter Reihenfolge wieder ausgibt.

> **Hinweis:** Sie müssen dazu keine Sortierfunktion implementieren. Überlegen Sie stattdessen, wie das Problem mit `if`-Anweisungen gelöst werden kann.

**Beispiel:**

```
Geben Sie drei Zahlen ein: -7 22 0
Die Reihenfolge lautet: -7 0 22
```

---

### Aufgabe 2

Schreiben Sie ein Programm, das vom Benutzer eine ganze Zahl einliest und die letzte Stelle als Zahlwort ausgibt.

**Beispiele:**

```
Zahl: 3642
3642 endet auf Zwei
```

```
Zahl: 170
170 endet auf Null
```

---

### Aufgabe 3

Die beiden Nullstellen einer quadratischen Gleichung der Form

$$ax^2 + bx + c = 0$$

können mit den folgenden Formeln ermittelt werden:

$$n_1 = \frac{-b + \sqrt{b^2 - 4ac}}{2a}$$

und

$$n_2 = \frac{-b - \sqrt{b^2 - 4ac}}{2a}$$

Den Term $b^2 - 4ac$ nennt man die **Diskriminante** der quadratischen Gleichung:
* Falls sie positiv ist ($> 0$), hat die Gleichung zwei Nullstellen.
* Falls sie gleich $0$ ist, hat die Gleichung eine Nullstelle.
* Falls sie negativ ist ($< 0$), hat die Gleichung keine reelle Nullstelle.

Schreiben Sie ein Programm, das von der Konsole die Werte für $a$, $b$ und $c$ einliest und nach Prüfung der Diskriminante die Nullstellen ausgibt.

**Beispiele:**

```
Geben Sie a, b, c ein: 1.0 3 1
Die Nullstellen sind -0.3819660112501051 und -2.618033988749895
```

```
Geben Sie a, b, c ein: 1.0 2.0 1.0
Die Nullstelle ist -1.0
```

```
Geben Sie a, b, c ein: 1 2 3
Die Gleichung hat keine reellen Nullstellen.
```

---

### Aufgabe 4

Schreiben Sie ein Programm, das vom Benutzer einen `double`-Wert einliest und auf zwei Nachkommastellen gerundet wieder ausgibt.

Verwenden Sie **nicht** die in Java eingebauten Rundungsfunktionen oder eine formatierte Ausgabe, sondern überlegen Sie sich mathematische Operationen und ggf. bedingte Ausdrücke, mit denen diese Aufgabe gelöst werden kann.

> **Achtung!** Es ist möglich, dass Ihr Computer / Java-System auf deutsche Lokalisierung eingestellt ist. Dann müssen `double`-Werte mit Komma statt mit Dezimalpunkt eingegeben werden.

**Beispiele:**

```
Zahl: 3.642
gerundet: 3.64
```

```
Zahl: 17.00732
gerundet: 17.01
```

---

### Aufgabe 5

Schreiben Sie ein Programm, das nacheinander an der Konsole persönliche Daten von zwei Personen einliest und wie im Beispiel formatiert wieder ausgibt. Achten Sie genau auf die Formatierung der Ausgabe im Beispiel.

Verwenden Sie zum Einlesen die verschiedenen `next...`-Methoden der Klasse `Scanner`. Recherchieren Sie dazu die Klasse `Scanner` in der Java-API.

**Beispiel:**

```
erste Person
Name: Winzig
Vorname: Willy
Geburtsdatum: 4.2.1983
Geschlecht: m
Guthaben: 52.45
zweite Person
Name: Sorglos
Vorname: Susi
Geburtsdatum: 12.11.1985
Geschlecht: w
Guthaben: -144.23

Person   Name             Geburtsdatum   Geschlecht   Guthaben
--------------------------------------------------------------
     1   Willy Winzig       4.2.1983         m           52.45
     2   Susi Sorglos     12.11.1985         w         -144.23
```

---
