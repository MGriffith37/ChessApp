import java.util.ArrayList;

public class Queen extends Piece{

	public Queen(PieceColour colour, int x, int y) {
		super(colour, x, y);
	}

	@Override
	ArrayList<int[]> getPossibleMoves() {
		return null;
	}

}
