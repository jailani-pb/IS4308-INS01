package ch05;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyJavaFX extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("view/MainPage.fxml"));
		primaryStage.setScene(new Scene(root, 300, 300));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
