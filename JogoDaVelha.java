import java.util.Scanner;

public class JogoDaVelha {
    static Scanner input = new Scanner(System.in);
    static String[][] board = new String[3][3];
    static String player;

    public static void main(String[] args) {
        player = "X";
        startBoard();
        showBoard();

        while (true) {
            match();
            changePlayer();
        }
    }

    public static void match() {
        int linha, coluna;
        System.out.println("Vez do jogador " + player);
        System.out.println("Linha: ");
        linha = input.nextInt();
        System.out.println("Coluna: ");
        coluna = input.nextInt();

        if (board[linha][coluna] == "X" || board[linha][coluna] == "O") {
            System.out.println("Jogada Inválida");
        } else {
            board[linha][coluna] = player;
            showBoard();
        }
    }

    public static void changePlayer() {
        if (player == "X") {
            player = "O";
        } else {
            player = "X";
        }
    }

    public static void startBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "-";
            }
        }
    }

    public static void showBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}