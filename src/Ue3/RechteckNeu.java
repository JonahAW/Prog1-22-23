package Ue3;

import java.util.Scanner;

public class RechteckNeu {
    // Wert Höhe
    int h;
    // Wert Breite
    int b;
    // Füllelement
    String fe;
    // Scanner
    Scanner scanner = new Scanner(System.in);

    public void eingabe() {
        System.out.println("Bitte geben Sie die Höhe ein.");
        h = scanner.nextInt();
        System.out.println("Bitte geben Sie die Breite ein.");
        b = scanner.nextInt();
        System.out.println("Bitte geben Sie ein Zeichen für die Füllung ein.");
        fe = scanner.next();
    }

    public void zeichne() {
        int i = 0;
        int j = 0;

        while (b > 1) {
            if (i > b) {
                String m = "-";
            } else if (i == b) {
                String p = "+";
            }
        }
        System.out.println("+");
    }

    public static void main(String[] args) {
        RechteckNeu rechteck = new RechteckNeu();
        rechteck.eingabe();
        rechteck.zeichne();
    }
}
