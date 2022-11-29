package Ue3;

import java.util.Scanner;

public class Taschenrechner {
    public static String o;
    public static int w1;
    public static int w2;
    public static int erg;
    static boolean berechne;
    static Scanner eingabe = new Scanner(System.in);
    public static void einlesen() {
        System.out.println("Bitte geben Sie ein Operant (a=Addition, s=Subtration, m=Multiplikation & d=Division) ein.");
        String o = eingabe.nextLine();
        System.out.println("Bitte geben Sie den ersten Wert ein.");
        String w1 = eingabe.nextLine();
        System.out.println("Bitte geben Sie den zweiten Wert ein.");
        String w2 = eingabe.nextLine();
    }

    public static boolean berechne() {
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
        }
        return false;
    }

    public static void ausgeben() {

        if (berechne == true) {
            System.out.println("Ihre Berechnung war:" + w1 + o + w2);
            System.out.println("Ihr Ergebnis lautet:" + erg);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        einlesen();
        berechne();
        ausgeben();
    }
}
