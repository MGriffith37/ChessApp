import java.util.ArrayList;

public class Pawn extends Piece{

	public Pawn(PieceColour colour, int x, int y) {
		super(colour, x, y);
	}

	@Override
	ArrayList<int[]> getPossibleMoves() {
		return null;
	}

}
