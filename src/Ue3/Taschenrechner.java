package Ue3;

import java.util.Scanner;

public class Taschenrechner {
    String o;
    int w1;
    int w2;
    int erg;
    boolean berechne;
    Scanner eingabe = new Scanner(System.in);
    public void einlesen() {
        System.out.println("Bitte geben Sie ein Operant (a=Addition, s=Subtration, m=Multiplikation & d=Division) ein.");
        o = eingabe.nextLine();
        System.out.println("Bitte geben Sie den ersten Wert ein.");
        w1 = eingabe.nextInt();
        System.out.println("Bitte geben Sie den zweiten Wert ein.");
        w2 = eingabe.nextInt();
    }

    /*
    public boolean berechne() {
        if (o == "a") {
            erg = w1 + w2;
            return true;
        } else if (o == "s") {
            erg = w1 - w2;
            return true;
        } else if (o == "m") {
            erg = w1 * w2;
            return true;
        } else if (o == "d") {
            erg = w1 / w2;
            return true;
        } else if (o == "") {
            System.out.println("Bitte geben Sie ein Operanten ein.");
            return true;
        } else {
            System.out.println("Bitte geben Sie ein Wert von oben ein.");
        }
        return false;
    }
    */
    public void berechne() {
        if (o == "a") {
            erg = w1 + w2;
        } else if (o == "s") {
            erg = w1 - w2;
        } else if (o == "m") {
            erg = w1 * w2;
        } else if (o == "d") {
            erg = w1 / w2;
        } else {
            erg = w1 + w2;
        }
    }

    public void ausgeben() {

        //    System.out.println("Ihre Berechnung war:" + w1 + o + w2);
            System.out.println("Ihr Ergebnis lautet:" + erg);
    }

    public static void main(String[] args) {
        Taschenrechner taschenrechner = new Taschenrechner();
        taschenrechner.einlesen();
        taschenrechner.berechne();
        taschenrechner.ausgeben();
    }
}
