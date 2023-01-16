package Ue4;

public class Konkat {

    public static char[] verbinden(char[] f1, char[] f2) {
        char[] vek = new char[f1.length + f2.length];

        for (int a = 0; a < f1.length; a++) {
            vek[a] = f1[a];
        }
        for (int a = 0; a < f2.length; a++) {
            vek[a + (f1.length)] = f2[a];
        }
        return vek;
    }

    public static void main(String[] args) {
        char[] f1 = {'U', 'S', 'C'};
        char[] f2 = {'H', 'I'};
        char[] z = verbinden(f1, f2);
        String s = String.valueOf(z);
        for(int i=0;i<z.length;i++)
            System.out.print(z[i]);
        System.out.println("\n"+s);
    }
}

