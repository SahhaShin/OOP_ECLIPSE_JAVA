package org.Practice10_11.eclipse;

public class Student2 extends Person implements java.lang.Comparable {
	private int studentNumber;

	public Student2() {
		super();
		studentNumber=0;
	}
	public Student2(String initialName, int initialNumber) {
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
	public boolean equals(Student2 otherStudent) {
		return this.hasSameName(otherStudent)&&(this.studentNumber==otherStudent.studentNumber);
	}
	
	public int compareTo(Object object) {
		
		if((object!=null)&&(object instanceof Student2)) {
			Student2 otherStudent=(Student2)object;
			
			if(getName().compareTo(otherStudent.getName())>0)
				return 1;
			else if(getName().compareTo(otherStudent.getName())<0)
				return -1;
			else return 0;
		}
		return -1;
	}
	
	public String toString() {
		return "Name: "+getName()+"\nStudent number: "+studentNumber;
	}

}
