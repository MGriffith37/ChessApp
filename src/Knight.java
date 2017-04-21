import java.util.ArrayList;

public class Knight extends Piece{

	public  Knight(PieceColour colour, int x, int y){
		super(colour, x, y);
	}

	@Override
	ArrayList<int[]> getPossibleMoves() {
		ArrayList<int[]> possibleMoves = new ArrayList<int[]>();

		int x = _currentPos[0];
		int y = _currentPos[1];

		//modifiers to coordinates for each possible move
		int[] xCoordinates = new int[]{-1, -2, 1, 2, -1, -2, 1, 2};
		int[] yCoordinates = new int[]{-2, -1, 2, 1, 2, 1, -2, -1};

		for(int i =0; i <8; i++){
			//calculate each possible position for knight
			int possX = x + xCoordinates[i];
			int possY = y + yCoordinates[i];
			//determine if position is off board
			if(!(possX < 0 || possX > 7 || possY < 0 || possY >7)){
				possibleMoves.add(new int[]{possX, possY});
			} 
		}
		
		//determine whether possible position contains a piece already
			Piece[][] piecePositions = AppModel.getPiecePositions();
			for(int i = 0; i < possibleMoves.size();i++){
			if(piecePositions[possibleMoves.get(i)[0]][possibleMoves.get(i)[1]].getClass().equals(Piece.class)){
				possibleMoves.remove(i);
			}
			}
			return possibleMoves;
		}
}