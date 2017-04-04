package ch06.controller;

import java.io.IOException;

import ch06.RunProgram;
import ch06.model.Student;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class MainPageController {

	@FXML
	ListView<Student> listViewStudents;
	
	@FXML
	TextField textFieldID, textFieldName, textFieldAge;
	
	@FXML
	RadioButton radioButtonMale, radioButtonFemale;
	
	@FXML
	CheckBox checkBoxUnderProbation;
	
	@FXML
	ComboBox<String> comboBoxSchool;
	
	@FXML
	Button buttonEdit;
	
	@FXML
	Label labelWelcome;
	
	public void addStudent() {
		int id, age;
		String name, gender, school;
		boolean underProbation;
		id = Integer.parseInt(textFieldID.getText());
		age = Integer.parseInt(textFieldAge.getText());
		name = textFieldName.getText();
		if(radioButtonMale.isSelected()) {
			gender = "Male";
		} else {
			gender = "Female";
		}
		school = comboBoxSchool.getSelectionModel().getSelectedItem();
		underProbation = checkBoxUnderProbation.isSelected();
		Student student = new Student(id, age, name, gender, school, underProbation);
		listViewStudents.getItems().add(student);
	}
	
	public void retrieveStudent() {
		Student student = listViewStudents.getSelectionModel().getSelectedItem();
		if(student != null) {
			buttonEdit.setDisable(false);
			textFieldID.setText("" + student.getId());
			textFieldAge.setText("" + student.getAge());
			textFieldName.setText(student.getName());
			if(student.getGender().equals("Male")) {
				radioButtonMale.setSelected(true);
			} else {
				radioButtonFemale.setSelected(true);
			}
			comboBoxSchool.getSelectionModel().select(student.getSchool());
			checkBoxUnderProbation.setSelected(student.isUnderProbation());
		} else {
			buttonEdit.setDisable(true);
		}
	}
	
	public void editStudent() {
		int id, age;
		String name, gender, school;
		boolean underProbation;
		id = Integer.parseInt(textFieldID.getText());
		age = Integer.parseInt(textFieldAge.getText());
		name = textFieldName.getText();
		if(radioButtonMale.isSelected()) {
			gender = "Male";
		} else {
			gender = "Female";
		}
		school = comboBoxSchool.getSelectionModel().getSelectedItem();
		underProbation = checkBoxUnderProbation.isSelected();
		Student student = listViewStudents.getSelectionModel().getSelectedItem();
		student.setId(id);
		student.setAge(age);
		student.setName(name);
		student.setGender(gender);
		student.setSchool(school);
		student.setUnderProbation(underProbation);
		int selectedIndex = listViewStudents.getSelectionModel().getSelectedIndex();
		listViewStudents.getItems().set(selectedIndex, student);
		listViewStudents.getSelectionModel().select(selectedIndex);
	}
	
	public void logout() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("../view/LoginPage.fxml"));
		Scene scene = new Scene(root, 300, 300);
		RunProgram.stage.setScene(scene);
	}
	
	public void setUsername(String username) {
		labelWelcome.setText("Welcome, " + username);
	}
	
}
