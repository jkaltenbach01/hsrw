# Probeklausur Strukturierte und objektorientierte Programmierung

**Hinweise:** Verwenden Sie die Methode main in den jeweiligen Klassen, um Ihre Lösung zu testen. Die teilweise bereits vorhandenen Tests sind nur Beispiele, nicht die tatsächlich verwendeten Tests Verändern Sie nicht die Signaturen der vorgegebenen Methoden.

**Hinweis Probeklausur:** Die in der Prüfung über Eclipse bereitgestellten Klassen finden Sie im Verzeichnis [src](/src).

## Aufgabe 1

Vervollständigen Sie in der Klasse `Klausurnoten` die Methode `berechneNote`. Die Methode erhält eine ganzzahlige Punktzahl im Intervall [0, 100] und soll die Klausurnote entsprechend der Tabelle zurückgeben. Falls eine Punktzahl übergeben wird, die nicht im Intervall [0, 100] liegt, soll -1 zurückgegeben werden.

| Punkte | Note |
| ------ | ------ |
| 0 - 49 | 5 |
| 50 - 54 | 4 |
| 55 - 69 | 3 |
| 70 - 84 | 2 |
| 85 - 100 | 1 |

Beispiel:
```
Eingabe = 72
Rückgabe = 2
```

## Aufgabe 2

Vervollständigen Sie in der Klasse `ArrayDelete` die Methode `deleteElements`. Die Methode nimmt ein Array und einen Wert entgegen und soll eine Kopie des übergebenen Arrays zurückgeben, in dem alle Vorkommen des Wertes nicht mehr enthalten sind. Die Methode soll das Originalarray unverändert lassen.

Beispiel:
```
Eingabe = {4, -3, 17, 6, 0, -3, 4, 9}, -3
Rückgabe = {4, 17, 6, 0, 4, 9}
```

## Aufgabe 3

Vervollständigen Sie in der Klasse `Zeichenzaehler` die Methode `zaehleZeichen`. Die Methode soll zurückgeben, wie häufig in dem übergebenen String das ebenfalls übergebene Zeichen vorkommt.

Beispiele:
```
Eingabe = "Hallo Welt", 'l' ---> Rückgabe = 3
Eingabe = "Heute scheint die Sonne", 's' ---> Rückgabe = 1
```

## Aufgabe 4

In dieser Aufgabe geht es darum, verschiedene Methoden vorgegebener Klassen aufzurufen und Klassen um eigene Methoden zu erweitern.

Betrachten Sie zunächst die Klasse `Konto`, welche ein Bankkonto mit Kontonummer, Guthaben und Dispokredit darstellt.

Die Klasse `Konto` verfügt über folgende Elemente:


- **Attribut nummer** Kontonummer, wird automatisch vom Konstruktor vergeben
- **Attribut guthaben** Gleitkommazahl, stellt das Guthaben (ggf. negativ) auf dem Konto dar
- **Attribut dispo** Gleitkommazahl, stellt die Höhe des Dispokredits dar. Der Wert wird immer positiv angegeben und beschreibt den Geldbetrag, um den das Gutachten höchstens unter Null liegen darf.
- **getNummer, getGuthaben, getDispo** Getter für die privaten Attribute
- **zubuchen** Bucht den übergebenen Betrag auf das Konto
- **abbuchen** Bucht den übergebenen Betrag vom Konto ab, falls das Konto ausreichend gedeckt ist (Guthaben und Dispo)
- **toString** Gibt eine formatierte Stringdarstellung des Kontos zurück.

Betrachten Sie außerdem die Klasse `Bank`. Sie enthält im Array `konten` alle Konten einer Bank. Implementieren Sie die folgenden Methoden in der Klasse `Bank`.

**ACHTUNG!** Die Methoden geben nichts aus, sondern Ergebnisse **zurück!**


1. Die Methode `toString` soll alle Konten der Bank als Zeichenkette zurückliefern, so dass die Konten untereinander stehen, wenn diese Zeichenkette ausgegeben wird.
2. Die Methode `getKonto` soll das Konto-Objekt mit der übergebenen Kontonummer aus dem
Array konten zurückliefern.
3. Die Methode `ueberweisen` soll den übergebenen Betrag vom Senderkonto auf das Empfängerkonto umbuchen. Gibt zurück, ob die Überweisung erfolgreich war (Senderkonto ausreichend gedeckt).
4. Die Methode `bilanzsumme` liefert die Bilanzsumme, d. h. die Summe aller Guthaben aller Konten der Bank.
5. Die Methode `abrechnen` bucht jedem Konto mit positivem Guthaben 2% des Guthabens zu (Guthabenzinsen) und bucht von jedem Konto mit negativem Guthaben 10% des Guthabens ab (Überziehungszinsen).
6. Die Methode `risikoKonten` liefert ein Array mit allen Konten, deren Guthaben negativ ist und deren Dispokredit um mehr als die Hälfte ausgeschöpft ist.
7. Implementieren Sie die Klasse `Guthabenkonto` so, dass sie eine spezialisierte `Konto`-Klasse ist, deren Guthaben nicht negativ werden kann (Dispokredit ist 0). Verwenden Sie Vererbung.

