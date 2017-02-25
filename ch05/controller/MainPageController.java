package ch05.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainPageController {

	@FXML
	TextField textFieldButton1, textFieldButton2A, textFieldButton2B;
	
	@FXML
	Label labelMessage;
	
	public void printButton1() {
		labelMessage.setText(textFieldButton1.getText());
	}
	
	public void printButton2() {
		labelMessage.setText(textFieldButton2A.getText() + " " + textFieldButton2B.getText());
	}
	
}
