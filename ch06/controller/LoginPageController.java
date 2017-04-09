package ch06.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ch06.RunProgram;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPageController {
	
	@FXML
	private Label labelMessage;
	
	@FXML
	private TextField textFieldUsername;
	
	@FXML
	private PasswordField passwordFieldPassword;
	
	public void login() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/adp", "root", "Mypassword123-");
//		Statement statement = connection.createStatement();
//		
//		String username = textFieldUsername.getText();
//		String password = passwordFieldPassword.getText();
//		String sql = "SELECT * FROM user WHERE username='" 
//				+ username + "' AND password=SHA2('"
//				+ password + "', 256)";
//		ResultSet resultSet = statement.executeQuery(sql);
		String sql = "SELECT * FROM user WHERE username=? "
				+ "AND password=SHA2(?, 256)";
		PreparedStatement preparedStatement = 
				connection.prepareStatement(sql);
		preparedStatement.setString(1, textFieldUsername.getText());
		preparedStatement.setString(2, passwordFieldPassword.getText());
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next()) {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/MainPage.fxml"));
			Parent root = fxmlLoader.load();
			MainPageController mpc = fxmlLoader.getController();
			mpc.setUsername(resultSet.getString("username"));
			Scene scene = new Scene(root, 800, 600);
			RunProgram.stage.setScene(scene);
		} else {
			labelMessage.setText("Wrong username or password");
		}
	}
}
