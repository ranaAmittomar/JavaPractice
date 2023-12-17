package TicTacToe.model;

public class PlayingPiece {
    //this will be our class which will pass the symbol by which we want to play.
    public PieceType pieceType; //USING ENUM

    PlayingPiece(PieceType pieceType) { //constructor -> which ever class want to call this.
        this.pieceType = pieceType; //for now its, X & O.
    }
}
