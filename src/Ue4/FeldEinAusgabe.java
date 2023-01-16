package Ue4;
import java.util.Scanner;

public class FeldEinAusgabe {

    private float x,y,p,q;
    private static char [][] feld;
    private static int s;
    static Scanner scanner = new Scanner(System.in);

    public static void einlesen() {
        String o = ".";
        String l = "x";
        System.out.println("Bitte geben Sie die gewünschte Breite ein");
        int x = scanner.nextInt();
        System.out.println("Bitte geben Sie die gewünschte Länge ein");
        int y = scanner.nextInt();
        feld = new char[x][y];
        for (int a = 0; a < x; a++) {
            for (int b = 0; b < y; b++) {
                feld[a][b] = o.charAt(0);
            }
        }
        while (s == 0) {
            System.out.println("Möchten Sie ein x setzen? [0 = ja/1 = nein]");
            int s = scanner.nextInt();
            if (s == 0) {
                // Einlesen für Koordinaten vom Kreuz, von den Kreuzen
                System.out.println("Bitte geben Sie die gewünschte Zeile ein"); // Horizontal
                int p = scanner.nextInt();
                System.out.println("Bitte geben Sie die gewünschte Spalte ein"); // Vertikal
                int q = scanner.nextInt();

                feld[p][q] = l.charAt(0);

            } else if (s == 1) {
                return;
            }
        }
    }



    public static void ausgeben() {
        // Erstelle feld aus .
        for (int zeile = 0; zeile < feld.length; zeile++) {
            for (int spalte = 0; spalte < feld[zeile].length; spalte++) {
                System.out.print(String.valueOf(feld[zeile][spalte]));
            }
            System.out.println("");
        }

    }

    public static void main(String args[]) {
        FeldEinAusgabe feldEinAusgabe = new FeldEinAusgabe();
        einlesen();
        ausgeben();

    }

}
