package Ue4;

public class Arraybeispiel {

    // Fehler:
    // NullPointerException: (Wenn ich kein Wert eingegeben habe oder die Länge des
    //                        Arrays Null ist)
    // NegativeArrayException: (Wenn ich eine Größe des Arrays ins negative geht)
    // OutOfBoundsException: (Wenn ich versuche vek[5] auszugeben, wenn der Array [5] ist)

    static int[] vek = new int[5];

    public static void main(String args[]) {
        vek[0] = -23;
        vek[1] = vek[0] + 25;
        vek[vek[1]] = -4;
        vek[4] = 2 * vek[1] + vek[2];
        System.out.println("Letzter Wert: \" + vek[4]");
    }
}

