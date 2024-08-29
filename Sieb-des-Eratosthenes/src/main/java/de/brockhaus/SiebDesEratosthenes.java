package de.brockhaus;

import java.util.ArrayList;
import java.util.List;

public class SiebDesEratosthenes {

    private final int n;
    private int position = 0;
    private Zahl[] zahlen;
    private List<Integer> primzahlen;

    public SiebDesEratosthenes(int n) {
        // Der Sieb soll direkt beim Erstellen der Instanz ausgeführt werden
        // und die Primzahlen in einer Liste speichern.

        this.n = n;
        erstelleArrayUndListe();
        sieben();
        primesRausschreiben();
    }

    private void hinschreiben(int zahl) {
        zahlen[position] = new Zahl(zahl);
        position++;
    }

    private void durchstreichen(int zahl) {
        zahlen[zahl - 1].streicheDurch();
    }

    private boolean istDurchgestrichen(int zahl) {
        return zahlen[zahl - 1].istDurchgestrichen();
    }

    private void erstelleArrayUndListe() {
        // Hier musst du die Liste, sowie das zahlen Array erzeugen.
        // Das zahlen Array muss aufsteigend mit Zahlen von 1 bis n gefüllt werden.

        // TODO: Implementiere die Methode erstelleArrayUndListe()
    }

    private void sieben() {
        // Hier musst du den eigentlichen Sieb des Eratosthenes Algorithmus implementieren.
        // Du kannst die Methoden durchstreicheVielfache() und isDurchgestrichen() benutzen.

        // TODO: Implementiere die Methode sieben()
    }

    private void primesRausschreiben() {
        // Hier musst du die Primzahlen in die Liste primzahlen schreiben.

        // TODO: Implementiere die Methode primesRausschreiben()
    }

    private void durchstreicheVielfache(int zahl) {
        // Hier musst du die Vielfachen einer Zahl durchstreichen.
        // Du kannst die Methode durchstreichen() benutzen.

        // TODO: Implementiere die Methode durchstreicheVielfache()
    }

    public List<Integer> berechnePrimzahlen() {
        return primzahlen;
    }
}