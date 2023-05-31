import java.util.Scanner;

class HumanPlayer extends Player{

    HumanPlayer(String name, char mark){
        this.name = name;
        this.mark = mark;
    }
    void makeMove(){
        int row;
        int col;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter valid row & col : ");
            row = sc.nextInt();
            col = sc.nextInt();
        } while(!isValidMove(row, col));
        TicTacToe.placeMark(row, col, mark);
    }
}
