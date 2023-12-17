package TicTacToe;

import TicTacToe.model.*;

import java.awt.font.GlyphMetrics;
import java.util.*;

import com.sun.tools.javac.util.Pair;

public class Game {
    Deque<Player> players; //getting players.
    Board gameBoard; // board .

    public Game() {
        initialiseGame();
    }

    public void initialiseGame() {
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("player1", crossPiece); //two fields-> playerName , pieceType.
        PlayingPiece noughtPiece = new PlayingPieceO();
        Player player2 = new Player("player2", noughtPiece);
        //adding players and their data to DeQue ,using LinkedList.
        players.add(player1);
        players.add(player2);

        //initializing board size.
        gameBoard = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true; //in beginning there is no winner.So , it's true.
        while (noWinner) {

            //picking the first player whose turn is ,and adding back to list.
            Player playerTurn = players.removeFirst();
            //get free space from board.
            gameBoard.printBoard();
            List<Pair<Integer, Integer>> freeSpace = gameBoard.getFreeCells();
            if (freeSpace.isEmpty()) {
                noWinner = false;
                continue;
            }
            // read input.
            System.out.println("Player " + playerTurn.name + " Enter the row , col: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputCol = Integer.valueOf(values[1]);
            //place the piece
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputCol, playerTurn.playingPiece);
            if (!pieceAddedSuccessfully) {
                //player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputCol, playerTurn.playingPiece.pieceType);
            if (winner) {
                return playerTurn.name;
            }
        }
        return "tie";
    }

    private boolean isThereWinner(int row, int column, PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for (int i = 0; i < gameBoard.size; i++) {

            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for (int i = 0; i < gameBoard.size; i++) {

            if (gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}


