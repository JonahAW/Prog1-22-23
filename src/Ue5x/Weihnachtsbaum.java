package Ue5x;

class Baum{
    char[][] baum;
    Schmuck[] schmuckSorte;
    void schmücken(Schmuck s){
        for(int i = 0; i < baum.length; i++){
            for(int j = 0; j < baum[i].length; j++){
                if(baum[i][j] == 'x'){
                    s.anhängen(i, j, baum);
                }
            }
        }
    }
}

abstract class Schmuck{
    abstract void anhängen(int x, int y, char[][] baum);
}

class Kugel extends Schmuck{
    char[][] bild;
    void anhängen(int x, int y, char[][] baum){
        for(int i = 0; i < bild.length; i++){
            for(int j = 0; j < bild[i].length; j++){
                if(bild[i][j] != ' '){
                    baum[x+i][y+j] = bild[i][j];
                }
            }
        }
    }
}

class Kerze extends Schmuck{
    char[][] bild;
    void anhängen(int x, int y, char[][] baum){
        for(int i = 0; i < bild.length; i++){
            for(int j = 0; j < bild[i].length; j++){
                if(bild[i][j] != ' '){
                    baum[x+i][y+j] = bild[i][j];
                }
            }
        }
    }
}

class Weihnachtsbaum(){

    public static void main(String[] a){
        Baum baum = new Baum();
        Kugel kugel = new Kugel();
        Kerze kerze = new Kerze();
        baum.schmücken(kugel);
        baum.schmücken(kerze);
    }
}