package com.neotech.review04;

public class School {
	
	public static void main(String[] args) {
		
		// Create a class School with a main method
		// Create 2 objects/instances of Student class
		// Create 1 object of Teacher class
		
		Student student1 = new Student();
		student1.name = "Jamson";
		student1.studentNr = 225;
		student1.gradeLevel = 2;
		
		Student student2 = new Student();
		student2.name = "Lola";
		student2.studentNr = 135;
		student2.gradeLevel = 3;
		
		Teacher teacher1 = new Teacher();
		teacher1.name = "Elion";
		teacher1.subject = "Computer science";
		teacher1.salary = 95000;
		
		System.out.println("Let's call the methods!");
		student1.study();
		
		student2.sleep();
		student2.study();
		
		teacher1.teach();
		
		
	}

}
