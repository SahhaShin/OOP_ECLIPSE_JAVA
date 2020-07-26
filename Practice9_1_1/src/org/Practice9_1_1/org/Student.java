package org.Practice9_1_1.org;

public class Student extends Person {

	private int studentNumber;
	public Student() {
		super();//초기화컨스트럭터
		studentNumber=0;
	}
	public Student(String initialName, int initialStudentNumber) {
		super(initialName);
		studentNumber=initialStudentNumber;
	}
	public void reset(String newName, int newStudentNumber) {
		setName(newName);
		studentNumber=newStudentNumber;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStuedntNumber(int newStudentNumber) {
		studentNumber=newStudentNumber;
	}
	public void writeOutput() {
		System.out.println("Name: "+getName());
		System.out.println("Student Number: "+studentNumber);
	}
	public boolean equals(Student otherStudent) {
		return this.hasSameName(otherStudent)&&(this.studentNumber==otherStudent.studentNumber);
	}
}
