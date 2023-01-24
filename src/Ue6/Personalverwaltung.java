package Ue6;
import java.util.Scanner;
class PVerw {
    Scanner scanner = new Scanner(System.in);
    static String[] liste = new String[5];
    public void anlegenPersonal(String Name, int Geburtsjahr, double Gehalt, String Geschlecht, int PNr) {
        System.out.println("Bitte ein Name eingeben!");
        Name = scanner.nextLine();
        System.out.println("Bitte ein Geburtsjahr eingeben!");
        Geburtsjahr = scanner.nextInt();
        System.out.println("Bitte ein Gehalt eingeben!");
        Gehalt = scanner.nextDouble();
        System.out.println("Bitte ein Geschlecht eingeben! w=weiblich, m=männlich, d=divers");
        Geschlecht = scanner.nextLine();
        System.out.println("Bitte eine Personalnummer eingeben!");
        PNr = scanner.nextInt();

        // Einfügen der Eingaben als eine Person
    }

    public void menue() {

    }
}

class Personal {
    // Eigenschaften, Konstruktor, getter und setter, KEIN “IO”
    public String gibDatensatz(){
        return null;
    } // alle Eigenschaften in einem String zurückgeben
}

// Aufgabe 2
class Manager extends Personal {

}

public class Personalverwaltung {
    // Eigenschaften, Konstruktor, getter und setter ERBEN!
    public String gibDatensatz() {

        return null;
    }
    // alle Eigenschaften in einem String zurückgeben, aber statt “Gehalt” nur “geheim”
}
