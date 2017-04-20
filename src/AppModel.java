import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.stage.Stage;

public class AppModel extends Application {

	// settings variables
	private static Boolean _isFirstTime;
	private static int _levelsUnlocked;
	private static String _voice;

	// GUI variables
	private static Stage _window;
	//private static QuizModel _quizModel;
	private static Background _background;
	
	private static Piece[][] boardPieces = new Piece[8][8];

	// Default GUI dimensions
	private final static int DEFAULT_WIDTH = 800;
	private final static int DEFAULT_HEIGHT = 800;

	/**
	 * Reads in the 3 settings values from .settings.txt file. These values will
	 * persist even if the application is closed. Sets up file model class to
	 * parse in word information from external txt files
	 */
	private static void setup() {
		// Initialise files

		// Read settings info from external txt file
			_isFirstTime = true;
			setBackground();
			
			if (_isFirstTime){
				boardPieces[0][0] = Piece.wROOK;
				boardPieces[0][1] = Piece.wKNIGHT;
				boardPieces[0][2] = Piece.wBISHOP;
				boardPieces[0][3] = Piece.wKING;
				boardPieces[0][4] = Piece.wQUEEN;
				boardPieces[0][5] = Piece.wBISHOP;
				boardPieces[0][6] = Piece.wKNIGHT;
				boardPieces[0][7] = Piece.wROOK;
				
				for(int i = 0; i <8; i++){
					boardPieces[1][i] = Piece.wPAWN;
				}
				for(int i = 0; i <8; i++){
					boardPieces[6][i] = Piece.bPAWN;
				}
				
				boardPieces[7][0] = Piece.bROOK;
				boardPieces[7][1] = Piece.bKNIGHT;
				boardPieces[7][2] = Piece.bBISHOP;
				boardPieces[7][3] = Piece.bQUEEN;
				boardPieces[7][4] = Piece.bKING;
				boardPieces[7][5] = Piece.bBISHOP;
				boardPieces[7][6] = Piece.bKNIGHT;
				boardPieces[7][7] = Piece.bROOK;
				
			}
	}

	// Getter methods-------------------------------------------------

	/**
	 * gets is first time boolean
	 */
	public static Boolean isItFirstTime() {
		return _isFirstTime;
	}

	/**
	 * get quiz model
	 */
//	public static QuizModel getQuizModel() {
//		return _quizModel;
//	}

	/**
	 * get window
	 */
	public static Stage getWindow() {
		return _window;
	}

	/**
	 * get default width
	 */
	public static int getWidth() {
		return DEFAULT_WIDTH;
	}

	/**
	 * get default height
	 */
	public static int getHeight() {
		return DEFAULT_HEIGHT;
	}

	/**
	 * get background
	 */
	public static Background getBackground() {
		return _background;
	}

	// Setter
	// methods-----------------------------------------------------------------------

	/**
	 * Sets quiz model
	 */
//	public static QuizState setQuizModel(GameState gameState, int levelSelected) {
//		_quizModel = new QuizModel(gameState, levelSelected);
//		return _quizModel.start();
//	}

	/**
	 * to be invoked from start() method that starts the GUI
	 */
	public static void setWindow(Stage window) {
		_window = window;
	}

	/**
	 * called by all scene clases to set the current scene
	 */
	public static void setScene(Scene scene) {
		_window.setScene(scene);
		_window.show();
	}

	/**
	 * Resets all data for application
	 */
	public static void setToDefault() throws FileNotFoundException {
		_isFirstTime = true;
		_levelsUnlocked = 0;
		_voice = "default";
	}

	/**
	 * Sets background image for GUI to the field image
	 */
	public static void setBackground() {
		File file = new File("media/board.jpg");
		Image image = new Image(file.toURI().toString());

		BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
		BackgroundImage backgroundImg = new BackgroundImage(image, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.CENTER, backgroundSize);
		_background = new Background(backgroundImg);
	}

	/**
	 * Sets up app model instance and launches gui
	 */
	public static void main(String[] args) {
		setup();
		launch(args);
	}

	/**
	 * Starts GUI and gives the primary stage window where all scenes will be
	 * displayed
	 */
	public void start(Stage primaryStage) throws Exception {

		_window = primaryStage;
		_window.setResizable(false);
		if (_isFirstTime) {
			GameScene.setScene();
		}

	}
}
