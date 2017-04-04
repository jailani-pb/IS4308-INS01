package ch06.model;

public class Student {

	private int id, age;
	private String name, gender, school;
	private boolean underProbation;
	
	public Student(int id, int age, String name, String gender, String school, boolean underProbation) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.school = school;
		this.underProbation = underProbation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public boolean isUnderProbation() {
		return underProbation;
	}

	public void setUnderProbation(boolean underProbation) {
		this.underProbation = underProbation;
	}
	
	public String toString() {
		return "(" + id + ") " + name;
	}
	
}







