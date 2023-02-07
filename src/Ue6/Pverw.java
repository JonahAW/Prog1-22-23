package Ue6;

import java.util.Scanner;

public class Pverw {

    // Personaldaten einlesen und Objekte erzeugen
    public void anlegenPersonal(int n, Personal objP){

        //Funktion scheiben, welche die Daten einliest und in Variablen speichert
        String[] strN = {" Hilbert", " Anja", " Klaus", " Sarah", " Anton"};
        int gj[] = {1900, 1910, 1820, 1830, 1840};
        double ge[] = {1000, 1200, 1400, 1600, 1800};
        String GS[] = {"m", "w", "m", "w", "m"};
        int pnr[] = {1,2,3,4,5};

        System.out.println(" Angelegte Person: " + strN[n-1]);

        objP.setName(strN[n-1]);
        objP.setGeburtsjahr(gj[n-1]);
        objP.setGehalt(ge[n-1]);
        objP.setGeschlecht(GS[n-1]);
        objP.setPNr(pnr[n-1]);
    }


    public Personal sucheAeltestePerson(Personal[] objP){							// Liste aller Personen an die Funktion �bergeben

        int gefunden = 0; 													// ist der Index des bislang �ltesten MA

        // Paarweiser Vergleich, wenn eine j�ngere Person gefunden wurde, dann deren Index merken
        for (int i = 0; i<4; i++){
            if (objP[gefunden].getGeburtsjahr() > objP[i+1].getGeburtsjahr()){			// Vergleiche zwei Personen aus der Liste...
                gefunden = i+1;											// ...und merke dir den �lteren von Beiden
            }
        }
        return objP[gefunden]; 												// Einfach Objekt zur�ckgeben
    }


    public void erhoeheFrauenGehalt(Personal[] objP) {								// Liste aller Personen an die Funktion �bergeben

        System.out.println("  ... Um wieviel % soll das Gehalt der Frauen erh�ht werden? ");
        Scanner scanner = new Scanner(System.in);
        double mehrGehalt = scanner.nextInt();

        for (int i = 0; i<5 ; i++) {											// Liste der Personen abarbeiten
            if (objP[i].getGeschlecht() == "w") {									// Wenn eine Frau gefunden wurde...
                objP[i].setGehalt((1.0 + mehrGehalt/100.0) * objP[i].getGehalt());   		//...dann Gehalt um X% erh�hen
                System.out.println("... Ge�nderter Datensatz: " + objP[i].gibDatensatz());  	// Ausgabe des neuen Datensatzes
            }
        }
    }


    public void gibDatenAus(Personal[] objP) {									// Liste aller Personen an die Funktion �bergeben

        for (int i = 0; i<5 ; i++) {											// Schleife für die Auflistung aller Daten
            System.out.println("... Gespeicherter Datensatz: " + objP[i].gibDatensatz());  	// Ausgabe der Personal-Daten
        }
    }


    // Nutzerwunsch einlesen und Ergebis ausgeben
    public int menue(){

        System.out.println(" ------------------------------------------------------------");
        System.out.println("  Bitte wählen Sie eine Funktion:");
        System.out.println("  1. Ältesten Mitarbeiter anzeigen");
        System.out.println("  2. Allen Frauen mehr Lohn geben");
        System.out.println("  3. Alle Daten ausgeben");
        System.out.println("  4. Ende");
        System.out.println(" ------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        int Eingabe = scanner.nextInt();

        switch (Eingabe) {  			// reagiert auf den Wert der Variable "Eingabe"
            case 1:					// case um einzelne Fälle aufzulisten
                System.out.println(" ... Ältesteste Mitarbeiter anzeigen");
                break;				// Verhindert die Ausführung der n�chsten Case-Zeile
            case 2:
                System.out.println(" ... Frauen mehr Lohn geben");
                break;
            case 3:
                System.out.println(" ... Alle Daten ausgeben");
                break;
            case 4:
                System.out.println(" ... Ende");
                break;
            default:					// Fehlerbehandlung erfolgt im Main-Programm
                ;
        }
        return Eingabe;
    }


    // Pverw anlegen und mit menue starten
    public static void main (String[] args){
        Pverw objPV = new Pverw();
        Personal[] lstPersonal = new Personal[5];	// Liste aller Personen werden statisch angelegt beim Programm-Start

        // Array mit Objekten erzeugen == Liste der Personen einlesen/anlegen
        lstPersonal[0] = new Personal();		// Objekt für eine Person erstellen
        objPV.anlegenPersonal(1, lstPersonal[0]); 	// Erste Person in der Personalliste anlegen

        lstPersonal[1] = new Personal();
        objPV.anlegenPersonal(2, lstPersonal[1]);

        lstPersonal[2] = new Personal();
        objPV.anlegenPersonal(3, lstPersonal[2]);

        lstPersonal[3] = new Personal();
        objPV.anlegenPersonal(4, lstPersonal[3]);

        lstPersonal[4] = new Personal();
        objPV.anlegenPersonal(5, lstPersonal[4]);

        int menu = objPV.menue();

        switch (menu) {
            case 1:
                // Älteste Person finden
                System.out.println(" ... Älteste Person: " + objPV.sucheAeltestePerson(lstPersonal).gibDatensatz());
                break;
            case 2:
                // Frauen das Gehalt erhöhen
                objPV.erhoeheFrauenGehalt(lstPersonal);
                break;
            case 3:
                // Alle Daten ausgeben
                objPV.gibDatenAus(lstPersonal);
                break;
            case 4:
                // Programm beenden
                System.out.println(" Programm wird beendet ");
                break;
            default:
                // Fehler im Menü
                System.out.println(" Unbekannte Funktion - Bitte w�hlen Sie einen Wert zwischen 1 und 4 ");
        }
    }
}

class Personal {

    private String name = "Hilbert";
    private int geburtsjahr = 1800;
    private double gehalt = 0.0;
    private String geschlecht = "m";
    private int pnr = -1;


    public String gibDatensatz(){						// Ein String der die Daten einer Person enthält
        return name + " " + geburtsjahr + " " + gehalt + " " + geschlecht + " " + pnr;
    } // alle Eigenschaften in einem String zurückgeben

    // Auflistung von Methoden, in welchen die Werte der Personen festgelegt werden (durch die Set-Anweisung), oder mit return ausgelesen werden
    public void setName(String strName ){
        name = strName;
    }

    public void setGeburtsjahr(int GJ ){
        geburtsjahr = GJ;
    }

    public void setGehalt(double dblGehalt ){
        gehalt = dblGehalt;
    }

    public void setGeschlecht(String strGeschlecht ){
        geschlecht = strGeschlecht;
    }

    public void setPNr (int PNr ){
        pnr = PNr;
    }

    public int getGeburtsjahr(){
        return geburtsjahr;
    }

    public String getGeschlecht(){
        return geschlecht;
    }

    public double getGehalt(){
        return gehalt;
    }
}
