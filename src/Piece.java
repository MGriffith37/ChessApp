import java.util.ArrayList;

public abstract class Piece {
	
	protected PieceColour _colour;
	
	protected PieceType _type;
	protected ArrayList<int[]> _moves;
	protected int[] _currentPos = new int[2];
	
	public Piece(PieceColour colour, int x, int y){
		_colour = colour;
		_currentPos[0] = x;
		_currentPos[1] = y;
	}

	abstract ArrayList<int[]> getPossibleMoves();
	
	public PieceColour getColour(){
		return _colour;
	}
	
}
