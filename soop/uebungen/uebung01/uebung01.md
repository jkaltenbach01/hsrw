# Einführung / Collatz

## Aufgabe 1

- Lesen Sie die Ausführungen zu Eclipse.
- Installieren Sie Eclipse auf Ihrem Computer, richten Sie einen Workspace ein und nehmen Sie die genannten Grundeinstellungen vor.
- Machen Sie sich mit der Benutzeroberfläche von Eclipse vertraut.
- Achten Sie unbedingt darauf, dass Ihr Eclipse auf UTF-8 eingestellt ist.

## Aufgabe 2

In der Vorlesung wurde ein Algorithmus für das Collatz-Problem vorgestellt:

```text
lies x ein
setze z auf 0
solange x ungleich 1 tue
    falls x gerade
        halbiere x
    sonst
        verdreifache x und erhöhe um 1
    erhöhe z um 1
gib z aus
```

Erstellen Sie die Traces für die Variable $x$ für alle Eingaben im Intervall $[1, 25]$. Erstellen Sie dabei eine Darstellung ähnlich der in der Vorlesung vorgestellten: Sobald der aktuelle Trace einen Wert für $x$ erreicht, der in einem der vorherigen Traces schon aufgetreten ist, schreiben Sie den Wert nicht in den aktuellen Trace, sondern zeichnen Sie eine Verbindung zum entsprechenden Wert des vorherigen Traces. Jede Zahl taucht also höchstens einmal auf.

Wie kann aus dieser Darstellung der Traces für eine beliebige Eingabe im Intervall $[1, 25]$ das Ergebnis (letzter Wert von $z$) ermittelt werden?

---
