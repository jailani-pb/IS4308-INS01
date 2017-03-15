package ch06;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RunProgram extends Application {

	public static Stage stage;
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("view/LoginPage.fxml"));
//		Parent root = FXMLLoader.load(getClass().getResource("view/MainPage.fxml"));
		Scene scene = new Scene(root, 300, 300);
		primaryStage.setScene(scene);
		stage = primaryStage;
		primaryStage.show();
	}

}
