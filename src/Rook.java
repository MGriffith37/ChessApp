import java.util.ArrayList;

public class Rook extends Piece{

	public Rook(PieceColour colour, int x, int y) {
		super(colour, x, y);
	}

	@Override
	ArrayList<int[]> getPossibleMoves() {
		return null;
	}

}
