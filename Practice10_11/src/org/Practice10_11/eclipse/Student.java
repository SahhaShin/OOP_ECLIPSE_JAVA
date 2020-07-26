package org.Practice10_11.eclipse;

public class Student extends Person implements java.lang.Comparable{
	private int studentNumber;

	public Student() {
		super();
		studentNumber=0;
	}
	public Student(String initialName, int initialNumber) {
		super(initialName);
		studentNumber=initialNumber;
	}
	public void reset(String newName, int newStudentNumber) {
		setName(newName);
		studentNumber=newStudentNumber;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int newStudentNumber) {
		studentNumber=newStudentNumber;
	}
	
	public void writeOutput() {
		System.out.println("Name: "+getName());
		System.out.println("Student Number: "+studentNumber);
	}
	public boolean equals(Student otherStudent) {
		return this.hasSameName(otherStudent)&&(this.studentNumber==otherStudent.studentNumber);
	}
	
	public int compareTo(Object object) {
		
		if((object!=null)&&(object instanceof Student)) {
			Student otherStudent=(Student)object;
			
			if(studentNumber>otherStudent.studentNumber)
				return 1;
			else if(studentNumber<otherStudent.studentNumber)
				return -1;
			else return 0;
		}
		return -1;
	}
	
	public String toString() {
		return "Name: "+getName()+"\nStudent number: "+studentNumber;
	}
}
