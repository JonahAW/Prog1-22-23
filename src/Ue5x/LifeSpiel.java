package Ue5x;
import java.util.Scanner;
/*
class LifeSpiel{
    int[][] brett;
    int zeilen, spalten;

    LifeSpiel(int rows, int cols){
        this.zeilen = zeilen;
        this.spalten = spalten;
        brett = new int[zeilen][spalten];
    }

    // Initialize the board with random values
    void init(){
        for(int i = 0; i < zeilen; i++){
            for(int j = 0; j < spalten; j++){
                brett[i][j] = (int)(Math.random() * 2);
            }
        }
    }

    // Print the current state of the board
    void printBoard(){
        for(int i = 0; i < zeilen; i++){
            for(int j = 0; j < spalten; j++){
                System.out.print(brett[i][j] + " ");
            }
            System.out.println();
        }
    }

    // User interface to insert new cells
    void insertCell(int x, int y) {
        if (x < 0 || x >= zeilen || y < 0 || y >= spalten) {
            System.out.println("Invalid cell position.");
            return;
        }
        brett[x][y] = 1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Anzahl der Zeilen eingeben: ");
        int zeile = sc.nextInt();
        System.out.print("Anzahl der Spalten eingeben: ");
        int spalten = sc.nextInt();
        LifeSpiel game = new LifeSpiel(zeile, spalten);
        game.init();
        while(true){
            game.printBoard();
            System.out.println("1. Insert new cell");
            System.out.println("2. Next generation");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter row: ");
                    int row = sc.nextInt();
                    System.out.print("Enter column: ");
                    int col = sc.nextInt();
                    game.insertCell(row, col);
                    break;
                case 2:
                    game.init();
                    break;
                case 3:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
*/