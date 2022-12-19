package Ue3;

import java.util.Scanner;

public class Taschenrechner {
    char o;
    int w1;
    int w2;
    float erg;
    boolean berechne;
    Scanner eingabe = new Scanner(System.in);
    public void einlesen() {
        System.out.println("Bitte geben Sie ein Operant (a=Addition, s=Subtration, m=Multiplikation & d=Division) ein.");
        o = eingabe.next().charAt(0);
        System.out.println("Bitte geben Sie den ersten Wert ein.");
        w1 = eingabe.nextInt();
        System.out.println("Bitte geben Sie den zweiten Wert ein.");
        w2 = eingabe.nextInt();
    }

    public boolean berechne() {

        switch (o) {
            case 'a':
                erg = w1 + w2;
                break;
            case 's':
                erg = w1 - w2;
                break;
            case 'm':
                erg = w1 * w2;
                break;
            case 'd':
                if (w2 == 0) {
                    System.out.println("Fehler: Division durch 0 ist nicht möglich!");
                    return false;
                }
                erg = w1 / w2;
                break;
            default:
                System.out.println("Den Operator kenne ich nicht");
                einlesen();
                return false;
        }
        return true;
    }

    public void ausgeben() {
        if (o == 'a') {
            System.out.println("Ihre Berechnung war:" + w1 + " + " + w2);
        } else if (o == 's') {
            System.out.println("Ihre Berechnung war:" + w1 + " - " + w2);
        } else if (o == 'm') {
            System.out.println("Ihre Berechnung war:" + w1 + " * " + w2);
        } else if (o == 'd') {
            System.out.println("Ihre Berechnung war:" + w1 + " / " + w2);
        }
        System.out.println("Ihr Ergebnis lautet:" + erg);
    }

    public static void main(String[] args) {
        // Scanner eingabe muss neu erschaffen werden, da main-Methode static ist
        Scanner eingabe = new Scanner(System.in);
        Taschenrechner taschenrechner = new Taschenrechner();
        boolean weiter = true;
        taschenrechner.einlesen();
        if (taschenrechner.berechne()) {
            taschenrechner.ausgeben();
        }
        do {
            // Abfrage, ob wiederholt werden soll
            System.out.println("Weiter? (j/n)");
            char antwort = eingabe.next().charAt(0);
            weiter = (antwort == 'j');
            taschenrechner.einlesen();
            if (taschenrechner.berechne()) {
                taschenrechner.ausgeben();
            }
        } while (weiter);
    }
}
