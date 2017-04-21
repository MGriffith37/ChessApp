import java.util.ArrayList;

public class Bishop extends Piece{

	public Bishop(PieceColour colour, int x, int y) {
		super(colour, x, y);
	}

	@Override
	ArrayList<int[]> getPossibleMoves() {
		return null;
	}

}
