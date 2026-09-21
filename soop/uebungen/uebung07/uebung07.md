# Arrays, Diverses

## Aufgaben

### Aufgabe 1

Schreiben Sie ein Programm, das vom Benutzer zehn Zahlen einliest und die geraden und ungeraden Zahlen voneinander getrennt wieder ausgibt.

Beispiel der Programmausführung:

```
Geben Sie zehn Zahlen ein: 3 19 44 27 5 9 109 64 19 73
Gerade Zahlen: 44 64
Ungerade Zahlen: 3 19 27 5 9 109 19 73
```

### Aufgabe 2

Schreiben Sie ein Programm, das eine zuvor festgelegte Anzahl von Zahlen einliest und die größte Zahl, die kleinste Zahl, deren Indizes sowie den Durchschnitt wieder ausgibt.

Beispiel der Programmausführung:

```
Wie viele Zahlen wollen Sie einlesen? 13
Geben Sie 13 Zahlen ein: 3 19 44 27 5 4 8 33 9 109 64 19 73
Größte Zahl: 109 an Stelle 9
Kleinste Zahl: 3 an Stelle 0
Durchschnitt: 32.0769...
```

Versuchen Sie, insgesamt nur zwei Schleifen zu verwenden: eine für das Einlesen der Zahlen und eine weitere für die Analyse des Arrays.

### Aufgabe 3

Schreiben Sie eine Methode `public static int[] filtereMehrfache(int[] a)`, die ein Array mit ganzen Zahlen entgegennimmt und ein neues Array zurückliefert, in dem keine mehrfachen Einträge mehr enthalten sind.

Beispiel:

```
Eingabe: {3, 19, 44, 19, 3, 5, 9, 19, 64, 73}
Rückgabe: {3, 19, 44, 5, 9, 64, 73}
```

### Aufgabe 4

Schreiben Sie eine Methode `public static boolean istPalindrom(int n)`, die für die Zahl n feststellt, ob diese ein Palindrom ist. Palindrome ergeben vorwärts und rückwärts gelesen denselben Wert: 34743 ist ein Palindrom, 762 ist kein Palindrom.

Überlegen Sie, wie Sie die Methode `zahlRueckwaerts` aus einer früheren Übung zur Lösung nutzen können.

### Aufgabe 5

Schreiben Sie ein Programm, das Klausurpunkte einliest und Noten auf der Basis dieses Schemas berechnet:

* Note 1: 90 oder mehr Punkte
* Note 2: 75 - 89 Punkte
* Note 3: 60 - 74 Punkte
* Note 4: 50 - 59 Punkte
* Note 5: 49 oder weniger Punkte

Das Programm fordert den Benutzer zuerst auf, die Anzahl der Studenten einzugeben, liest danach die eingegebenen Punkte in ein Array ein und gibt die Noten sowie die Durchschnittsnote aus.

Beispiel:

```
Anzahl der Studenten: 5
Punktzahlen: 60 70 35 90 55
Bewertung:
Student 1: 60 Punkte Note 3
Student 2: 70 Punkte Note 3
Student 3: 35 Punkte Note 5
Student 4: 90 Punkte Note 1
Student 5: 55 Punkte Note 4
Durchschnittsnote: 3.2
```

### Aufgabe 6

In Grundzügen haben Sie den Datentyp `char` (Zeichen) schon in der Veranstaltung GDI kennengelernt. Erarbeiten Sie sich selbständig die Eigenschaften des Datentyps `char`. Nutzen Sie als Quelle beispielsweise das Buch *Introduction to Java Programming* von David Liang (Kapitel 2.17), welches Sie in der Bibliothek finden.

Implementieren Sie - in Anlehnung an die Vorlesung - einen endlichen Automaten mit dem Eingabealphabet $\{a, b, c, e\}$, der alle Worte akzeptiert, die aus Folgen von doppelten Konsonanten oder aus Folgen von abwechselnden Konsonanten und Vokalen bestehen. Die Worte sollen mindestens aus zwei Zeichen bestehen.

* Beispiele für akzeptierte Worte: `ccbbccbbcccc`, `bb`, `bbccbbbbcc`, `abecebebab`, `cabacabe`, `ab`, `eba`, `bab`
* Beispiele für nicht akzeptierte Worte: `bbaabbcc`, `aeac`, `cabeab`, `abc`, `bcbbbcc`, `e`, `c`

Programmieren Sie den endlichen Automat in einer Methode `public static boolean automat(char[] eingabe)`, die ein `char`-Array als Eingabe einliest und `true` zurückliefert, wenn der Automat das Wort akzeptiert.

### Aufgabe 7

Schreiben Sie eine Methode `public static double endKapital(double k0, double z, int t)`, welche den Endwert einer Investition für ein gegebenes Startkapital $k_0$, den jährlichen Zins $z$ und die Laufzeit $t$ in Jahren berechnet und zurückliefert. Verwenden Sie die folgende Formel:

$$
\text{endwert} = k_0 \cdot \left(1 + \frac{z}{100}\right)^t
$$

Testen Sie Ihre Methode, indem Sie in der Methode `main` das Startkapital und den Zins vom Benutzer einlesen und mittels einer Schleife eine Tabelle der folgenden Form für die ersten 30 Jahre ausgeben. Achten Sie darauf, dass die Werte rechtsbündig ausgegeben werden (`System.out.printf`).

```
Anfangsinvestition: 1000
jährlicher Zins: 9
Jahre         Endkapital
   1            1090.00
   2            1188.10
        ...
  29           12172.18
  30           13267.68
```

Wegen möglicher Rundungsfehler verwendet man für finanzmathematische Berechnungen möglichst keine Gleitkommazahlen. Statt dessen verwendet man Ganzzahlen, die das Zehntausendfache des jeweiligen Betrages darstellen. Mit dem zehntausendfachen werden vier Nachkommastellen abgebildet. Beispiel: Für den Geldbetrag 12,3449 € wird die Ganzzahl 123449 in einer Variablen vom Typ `long` gespeichert.

Schreiben Sie eine Methode `public static long endKapLong(long k0, double z, int t)`, welche den Endwert einer Investition analog Aufgabe 7.1 berechnet. Testen Sie Ihre Methode analog Aufgabe 7.1.

### Aufgabe 8: Weizenkornlegende

Schreiben Sie eine Methode `public static void schachbrett(int n)`, welche ein "Schachbrett" der Größe $n \times n$ als `double[][] schachbrett` anlegt. Weisen Sie dem ersten Feld des Schachbretts den Wert eins, dem zweiten den Wert zwei, dem dritten den Wert vier, dem vierten den Wert acht usw. zu. Stellen Sie die entstandene Datenstruktur sinnvoll auf der Konsole dar. Die Zahlen werden ggfs. sehr groß, so dass Rundungsfehler schon bei $n = 8$ zu erwarten sind.