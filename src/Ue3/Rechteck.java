package Ue3;

import java.util.Scanner;

public class Rechteck {
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

        b = b - 1;
        h = h - 1;

        for (int y = 0; y <=h; y++) {

            if (y == 0 || y == h) {
                // Erste Zeile und letzte Zeile
                for (int x = 0; x <= b; x++) {
                    if (x == 0) {
                        System.out.print("+");
                    } else if (x < b) {
                        System.out.print("-");
                    } else if (x == b) {
                        System.out.print("+\n");
                    }
                }
            } else if (y < h) {
                // Zwischenzeile
                for (int x = 0; x <= b; x++) {
                    if (x == 0) {
                        System.out.print("-");
                    } else if (x < b) {
                        System.out.print(fe);
                    } else if (x == b) {
                        System.out.print("-\n");
                    }
                }
            }
        }

        /*for (int i = 0; i < h; i++) {
            for (int j = 0; j < b; j++) {
                if (i % h == 0 || j % b == 0 || (i + j) % 6 == 5 || (h - i + j) % 6 == 5) {
                    System.out.print("-");
                } else {
                    System.out.print(fe);
                }
            }
        }

         */
    }

    public static void main(String[] args) {
        Rechteck rechteck = new Rechteck();
        rechteck.eingabe();
        rechteck.zeichne();
    }
}