import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;

public class GameScene {

	
	private static Scene build(){
		
		Piece[][] piecePositions = AppModel.getPiecePositions();
		
		AppModel.getWindow().setTitle("Chess");
		GridPane grid = new GridPane();
	    grid.setHgap(0);
	    grid.setVgap(0);
	    
	    for(int i = 0; i < 8; i++){
	    	for(int j = 0; j< 8; j++){
	    		Piece piece = piecePositions[i][j];
	    		if(piece != null){
	    			String pieceName = piece.getClass().getSimpleName();
	    			System.out.print(pieceName);
	    			String pieceColour = piece.getColour().toString();
	    			System.out.print(pieceColour);
	    		
	    		Image pieceImg = new Image("File:media/" + pieceColour + "/" + pieceName + ".png");
	    		grid.add(new ImageView(pieceImg), j, i);
	    		}
	    		Button btn = new Button();
	    		btn.setMinHeight(100);
	    		btn.setMinWidth(100);
	    		btn.setStyle("-fx-background-color: transparent");
	    		
	    		btn.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						// Gets the level that the button corresponds to
						System.out.println("button pressed");
					}
				});
	    		
	    		grid.add(btn, j, i);
	    	
	    	}
	    }
//	    Image whiteRook = new Image("File:media/whiteRook.png");
//	    Button whiteRook1 = new Button(" ");
//	    whiteRook1.setMinHeight(100);
//	    whiteRook1.setMinWidth(100);
//	    whiteRook1.setStyle("-fx-background-color: transparent");
//	    whiteRook1.setOnAction(new EventHandler<ActionEvent>() {
//				@Override
//				public void handle(ActionEvent event) {
//					// Gets the level that the button corresponds to
//					System.out.println("button pressed");
//				}
//			});
//	    grid.add(new ImageView(whiteRook), 0, 0 );
//
//        
//	    grid.add(whiteRook1, 0, 0);
//	    
//	    Button whiteKnight1 = new Button("Knight goes here");
//	    
//	    grid.add(whiteKnight1, 1, 0);
	    
	    grid.setBackground(AppModel.getBackground());
	    return new Scene(grid, AppModel.getWidth(), AppModel.getHeight());
	    
	    
		
	}
	public static void setScene() {
		Scene mainMenuScene = build();
		AppModel.setScene(mainMenuScene);
	}

}
