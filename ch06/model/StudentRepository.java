package ch06.model;

import java.util.ArrayList;

public class StudentRepository {
	
	private ArrayList<Student> students;
	
	public StudentRepository() {
		students = new ArrayList<Student>();
	}
	
	public ArrayList<Student> getStudentList() {
		return students;
	}
	
	public void addStudent(int id, int age, String name, String gender, 
			String school, boolean underProbation) {
		Student student = new Student(id, age, name, gender, school, underProbation);
		students.add(student);
	}
	
}
