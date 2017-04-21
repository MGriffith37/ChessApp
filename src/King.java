import java.util.ArrayList;

public class King extends Piece{

	public King(PieceColour colour, int x, int y) {
		super(colour, x, y);
	}

	@Override
	ArrayList<int[]> getPossibleMoves() {
		return null;
	}

}
