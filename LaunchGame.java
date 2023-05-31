
class LaunchGame {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        HumanPlayer p1 = new HumanPlayer("Rupdeep", 'X');
        AIPlayer p2 = new AIPlayer("chatGPT100", 'O');
//        HumanPlayer p2 = new HumanPlayer("Ayesha", '0');

        Player cp;
        cp = p1;
        int moves = 0;

        while(true){
            moves++;
            System.out.println(cp.name + "'s turn");
            cp.makeMove();
            TicTacToe.displayBoard();
            if(TicTacToe.checkRowWin() || TicTacToe.checkColWin() || TicTacToe.checkDiagWin()){
                System.out.println(cp.name + " has own.");
                break;
            }
            else{
                if(cp == p1){
                    cp = p2;
                }
                else{
                    cp = p1;
                }
            }
            if(moves == 9){
                System.out.println("Game is a draw.");
                break;
            }
        }
    }
}