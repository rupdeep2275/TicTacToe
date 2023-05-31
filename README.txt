Tic-Tac-Toe Game:
This is a Java implementation of the classic Tic-Tac-Toe game. The code consists of several classes that work together to create a functional game.

Game Logic:
The TicTacToe class represents the game board and contains methods for initializing the board, displaying it, placing marks on the board, and checking for a win condition.

The board variable is a 2D array that represents the game board.
The initBoard() method initializes the board with empty spaces.
The displayBoard() method prints the current state of the board to the console.
The placeMark() method is used to place a mark ('X' or 'O') at a specific position on the board.
The checkColWin(), checkRowWin(), and checkDiagWin() methods check if a player has won the game by checking for matching marks in columns, rows, or diagonals.


Players:
The Player class is an abstract class representing a player in the game. It has a name and a mark (symbol).

The makeMove() method is an abstract method that must be implemented by the subclasses.
The isValidMove() method checks if a move is valid by ensuring the chosen position is within the board boundaries and not already occupied.


Human Player:
The HumanPlayer class extends the Player class and represents a human player. It prompts the user to enter a valid row and column for their move using the Scanner class.


AI Player:
The AIPlayer class extends the Player class and represents an AI player. It randomly selects a valid row and column for its move using the Random class.


Game Launch:
The LaunchGame class contains the main method to launch the Tic-Tac-Toe game.

It creates an instance of the TicTacToe class to represent the game board.
It creates instances of the players, either human or AI, and assigns them as the current player (cp).
The game proceeds with players taking turns, making moves, and the board being displayed.
The game ends when a player wins or when all positions on the board are filled, resulting in a draw.


Running the Game:
To run the Tic-Tac-Toe game:

Compile the Java source files using the following command:
javac LaunchGame.java

Run the compiled Java program with the following command:
java LaunchGame

Enjoy playing Tic-Tac-Toe and have fun competing against another player or challenging the AI player!