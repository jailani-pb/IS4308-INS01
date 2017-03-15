package ch06.controller;

import java.io.IOException;

import ch06.RunProgram;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class MainPageController {

	public void logout() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("../view/LoginPage.fxml"));
		Scene scene = new Scene(root, 300, 300);
		RunProgram.stage.setScene(scene);
	}
	
}
