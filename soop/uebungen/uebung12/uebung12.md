# Übungsblatt: Ausnahmebehandlung

## Aufgaben

---

### Aufgabe 1: Stacktrace analysieren

Die Klasse `java.lang.NullPointerException` beschreibt den Versuch, auf eine Referenzvariable zuzugreifen, in der statt eines Objektes die Referenz `null` abgelegt ist. 

Welche Informationen können Sie ohne Kenntnis des genauen Programmcodes aus folgender Programmausgabe ziehen?

```text
java.lang.NullPointerException
    at EineKlasse.problem(EineKlasse.java:6)
    at EineKlasse.main(EineKlasse.java:10)
```

---

### Aufgabe 2: OutOfMemoryError provozieren und abfangen

Schreiben Sie ein Programm, das einen `OutOfMemoryError` der Java Virtual Machine (JVM) hervorruft, diesen fängt und behandelt. 

> **Hinweis:** Überlegen Sie sich selbst oder recherchieren Sie im Internet, wie man einen solchen Error hervorrufen kann (z. B. durch wiederholtes oder exzessives Reservieren von Arbeitsspeicher).

---

### Aufgabe 3: Eingabevalidierung und Exception-Hierarchien

Das folgende Programm soll eine `double`-Fließkommazahl von der Tastatur einlesen, sie in einen String umwandeln und diesen wieder ausgeben. Falls die Umwandlung nicht möglich ist (weil der Benutzer z. B. „Schrott“ eingegeben hat), soll das Programm den Benutzer so lange zur Eingabe auffordern, bis er eine gültige Zahl eingibt.

```java
import java.io.*;

public class EingabeValidierung {
    // Eingabekanal von der Tastatur
    private static BufferedReader in = 
        new BufferedReader(new InputStreamReader(System.in));

    public static double readDouble() {
        String s;
        double d = 0.0;
        boolean korrekt = true;

        // String-Eingabe und Typumwandlung - zu vervollständigen:
        do {
            System.out.print("Bitte double-Zahl eingeben: ");
            s = in.readLine();          // Tastatureingabe entgegennehmen
            d = Double.parseDouble(s);  // Eingabestring in double wandeln
        } while (!korrekt);

        return d;
    }

    public static void main(String[] args) {
        double eingabe = readDouble();
        System.out.println("Eingabe: " + eingabe);
    }
}
```

In der `main`-Methode wird die Methode `readDouble` aufgerufen. Diese nimmt in der Anweisung `s = in.readLine();` eine Tastatureingabe entgegen und wandelt sie in `d = Double.parseDouble(s);` in eine `double`-Zahl um. Um diese Anweisungen herum ist eine `do-while`-Schleife angedeutet, die dafür sorgen soll, dass die Eingabe so oft angefordert wird, bis die Typumwandlung erfolgreich war.

Beim Versuch, das obige Programm zu kompilieren, erhalten wir folgende Meldung:

```text
EingabeValidierung.java:17: unreported exception java.io.IOException; must be caught or declared to be thrown
```

Sie weist darauf hin, dass die Methode `readLine` der Klasse `BufferedReader` eine `IOException` werfen kann, die jedoch noch nirgends gefangen wird. Die Methode `parseDouble` der Klasse `Double` kann wiederum eine `NumberFormatException` werfen, über die sich der Compiler jedoch nicht beschwert.

#### Teilaufgaben:

1. **Unterschied der Exception-Typen:**  
   Welcher Unterschied zwischen der `java.io.IOException` und der `java.lang.NumberFormatException` ist für die Compiler-Fehlermeldung verantwortlich? *(Tipp: Schlagen Sie die Exceptions in der Java API Specification nach.)*

2. **`try-catch`-Struktur einfügen:**  
   Ergänzen Sie den Inhalt der `do-while`-Schleife um eine `try-catch`-Struktur, die beide Arten von Exceptions abfängt.  
   * Lassen Sie den `catch`-Block für die `IOException` zunächst noch leer.  
   * Überlegen Sie sich, was im `catch`-Block für die `NumberFormatException` sowie im `try`-Block passieren muss, damit die Schleife so lange wiederholt wird, bis ein gültiger Wert eingegeben wurde.

3. **Reihenfolge der `catch`-Blöcke:**  
   Ist die Reihenfolge der `catch`-Blöcke in diesem Beispiel von Bedeutung? Warum bzw. warum nicht?

4. **Leere `catch`-Blöcke:**  
   Obwohl die `IOException` in unserem Beispiel kaum auftreten kann, ist ein leerer `catch`-Block extrem schlechter Programmierstil. Warum?

5. **Reaktionsmöglichkeiten:**  
   Welche drei prinzipiellen Möglichkeiten haben wir, auf eine `IOException` (bzw. auf jede Art von Exception) zu reagieren?

6. **Eigene Exception definieren (`InputException`):**  
   Erweitern Sie die Methode `readDouble` so, dass sie im Fall einer `IOException` eine neue, von Ihnen deklarierte `InputException` wirft. Deklarieren Sie `InputException` als Unterklasse von `Exception`.

7. **Behandlung in `main`:**  
   Der Compiler weist nun darauf hin, dass die von `readDouble` geworfene `InputException` in `main` noch nicht behandelt wird. Überlegen Sie, welche beiden Möglichkeiten Sie dafür haben, und implementieren Sie eine davon in `main`.

---

### Aufgabe 4: Robuster Text-Taschenrechner

Das Programm `SimpleTextCalculator.java` ist ein einfacher textbasierter Rechner. Nach der Eingabe einer einfachen arithmetischen Operation gibt das Programm das Rechenergebnis aus:

```text
Berechnung (Operand1 Operator Operand2): 3 + 5
3 + 5 = 8
```

Das Programm besitzt bisher keinerlei Fehlerbehandlung:

```java
import java.util.Scanner;

/**
 * Einfacher Rechner fuer ganzzahlige Berechnungen in den Grundrechenarten.
 * Basiert auf Liang 9th ed., Listing 9.5
 * 
 * @author Y. Daniel Liang
 * @author Thomas Richter
 */
public class SimpleTextCalculator {

    /** Main method */
    public static void main(String[] args) {
        // Berechnung einlesen
        System.out.print("Berechnung (Operand1 Operator Operand2): ");
        Scanner s = new Scanner(System.in);
        String aufgabe = s.nextLine();

        // Zwischenspeicher fuer das Ergebnis
        int result = 0;

        // Eingabe zerlegen fuer die Berechnung
        String[] ops = aufgabe.split(" ");

        // Operator bestimmen
        switch (ops[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(ops[0]) + Integer.parseInt(ops[2]);
                break;
            case '-':
                result = Integer.parseInt(ops[0]) - Integer.parseInt(ops[2]);
                break;
            case '*':
                result = Integer.parseInt(ops[0]) * Integer.parseInt(ops[2]);
                break;
            case '/':
                result = Integer.parseInt(ops[0]) / Integer.parseInt(ops[2]);
                break;
        }

        // Display result
        System.out.println(ops[0] + ' ' + ops[1] + ' ' + ops[2] + " = " + result);
    }
}
```

Beispiele für fehlerhafte Eingaben:
* `drei mal fuenf`
* `drei * fuenf`
* `3x + 5`
* `3+5`
* `3 5`
* `3 / 0`
* `3 w 5`

#### Teilaufgaben:
1. Erweitern Sie das Programm so, dass es bei fehlerhaften Eingaben die auftretenden Exceptions abfängt und eine verständliche Fehlermeldung ausgibt. Testen Sie vorab, welche Exceptions bei welchen Eingaben geworfen werden.
2. Es gibt auch Fehlerfälle, die keine Exception auslösen (z. B. unbekannte Operatoren). Behandeln Sie diese logischen Fehler ebenfalls geeignet.

---

### Aufgabe 5: Hexadezimal-zu-Dezimal-Konvertierung

Das folgende Programm `Hex2DecimalConversion.java` implementiert die Methode `hexToDecimal`, welche eine eingegebene Hexadezimalzahl in die entsprechende Dezimalzahl umwandelt. 

Die Methode akzeptiert derzeit *jeden* String, da die Umrechnung auf dem Zeichenwert (`char`) basiert. 

```java
import java.util.Scanner;

/**
 * Einfache Umwandlung von Hex nach Dezimal.
 * Quelle: Liang 9th ed., Listing 9.2
 * 
 * @author Y. David Liang
 */
public class Hex2DecimalConversion {

    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for the hex number " 
            + hex + " is " + hexToDecimal(hex));
    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        ch = Character.toUpperCase(ch); // In Großbuchstaben umwandeln
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else {
            // ch ist '0', '1', ..., oder '9'
            return ch - '0';
        }
    }
}
```

#### Teilaufgabe:
* Ändern Sie die Methode so ab, dass sie eine `NumberFormatException` wirft, sobald ein Zeichen im Eingabestring keine gültige Hexadezimalziffer (`0-9`, `A-F` bzw. `a-f`) darstellt.

---

## Musterlösung

*(Hier können die Musterlösungen oder Lösungshinweise eingetragen werden.)*