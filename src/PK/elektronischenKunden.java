package PK;

class Kunde {
    String name;
    float gesamtRechnung;
    Produkt[] gekaufteProdListe;

    public Kunde(String n){
        name = n;
    }

    public void einkaufen(Produkt p, int anzahl){
        Produkt[] neu = new Produkt[gekaufteProdListe.length + anzahl];
        for(int i=0; i<gekaufteProdListe.length; i++) {
            neu[i] = gekaufteProdListe[i];
        }
        for(int i=gekaufteProdListe.length; i<new.length; i++) {
            neu[i] = p;
        }

        gekaufteProdListe = neu;

        float preis = p.gibPreis();
        if(gesamtRechnung > 100){
            preis = preis*0.9f;
        }

        float gesamt = preis * anzahl;
        gesamtRechnung += gesamt;
    }

    public void ausgeben(){
        System.out.println("Kundenname: "+ name + "Gesamtrechnung");
    }
}

class RabattProdukt extends Produkt{
    int rabatt;

    public RabattProdukt(String b, float p, int r){
        super(b,p);
        rabatt = r;
        preis -= rabatt;
    }
}
class Produkt {
    float preis;
    String bezeichnung;

    public Produkt(String b, float p){
        preis = p;
        bezeichnung = b;
    }

    public float gibPreis(){
        return preis;
    }
}

public class elektronischenKunden {
    public static void main(String [] args){
        Kunde k = new Kunde("Horst");
        k.einkaufen(new Produkt("Schuhe", 74.99F),2);
        k.einkaufen(new Produkt("Hose",120),3);
        k.einkaufen(new Produkt("Hemd",100),-1);
        k.ausgeben();
    }
}