import AppModel;
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
		AppModel.getWindow().setTitle("Chess");
		GridPane grid = new GridPane();
	    grid.setHgap(0);
	    grid.setVgap(0);
	    
	    Image whiteRook = new Image("File:media/whiteRook.png");
	    Button whiteRook1 = new Button(" ");
	    whiteRook1.setMinHeight(100);
	    whiteRook1.setMinWidth(100);
	    whiteRook1.setStyle("-fx-background-color: transparent");
	    whiteRook1.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					// Gets the level that the button corresponds to
					System.out.println("button pressed");
				}
			});
	    grid.add(new ImageView(whiteRook), 0, 0 );
	    
//	    BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("/media/whiteRook.png").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
//        Background background = new Background(backgroundImage);
//
//        Button button = new Button( "Click me!");
//        button.setBackground(background);
        
	    grid.add(whiteRook1, 0, 0);
	    
	    Button whiteKnight1 = new Button("Knight goes here");
	    
	    grid.add(whiteKnight1, 1, 0);
	    
	    grid.setBackground(AppModel.getBackground());
	    return new Scene(grid, AppModel.getWidth(), AppModel.getHeight());
	    
	    
		
	}
	public static void setScene() {
		Scene mainMenuScene = build();
		AppModel.setScene(mainMenuScene);
	}

}
