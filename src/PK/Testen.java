package PK;

class Lebewesen {
    double gewicht;
    int alter;

    Hirn h;

    public Lebewesen(double g) {
        gewicht = g;
        System.out.println("geboren mit "+gewicht+"/"+alter);
        h = new Hirn();
    }
}
class Hirn {
    public Hirn() {
        System.out.println("ich bin!");
    }
}

class Hund extends Lebewesen {
    public Hund() {
        super(20.2e2);
        System.out.println("wuff!");
    }
}

class Person extends Lebewesen {
    Lebewesen hausTier;
    public Person () {
        super(3000.5);
        System.out.println("Bäää");
    }

    class TierSchonDaException extends Exception {
        TierSchonDaException() {
            super("Das Tier ist schon vorhanden");
        }
    }

    boolean addTier(Lebewesen l1) throws TierSchonDaException {
        if(hausTier==null || hausTier==l1) {
            return true;
        } else {
            throw new TierSchonDaException();
        }
    }
}

/*
boolean addTier(Lebewesen l1) throws TierSchonDaException {
    if(hausTier==null || hausTier==l1) {
        return true;
    } else {
        throw new TierSchonDaException;
    }
}
*/

public class Testen {
    public static void main(String[] args) {
        Lebewesen l1 = new Hund();
        Person x = new Person();
        /*
        if (x.addTier((new Hund()))) {
            System.out.println("schön");
        }
        if (x.addTier(l1)) {
            System.out.println("super");
        } else {
            System.out.println("schade");
        }
        */
        try {
            if (x.addTier(new Hund())) {
                System.out.println("schön");
            }
        } catch (Person.TierSchonDaException e) {
            System.out.println(e);
        }
    }
}