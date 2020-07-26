package org.Practice9_2_1.eclipse;

public class Undergraduate extends Student {
	private int level;
	
	public Undergraduate() {
		super();
		level=1;
	}
	
	public Undergraduate(String initialName, int initialStudentNumber, int initialLevel) {
		super(initialName,initialStudentNumber);
		setLevel(initialLevel);
	}
	
	public void reset(String newName, int newStudentNumber, int newLevel) {
		reset(newName, newStudentNumber);
		setLevel(newLevel);
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int newLevel) {
		if((1<=newLevel)&&(newLevel<=4))
			level=newLevel;
		else {
			System.out.println("Illegal level!");
			System.exit(0);
		}
	}
	
	public void writeOutput() {
		super.writeOutput();
		
		System.out.println("StudentLevel: "+level);
	}
	
	public boolean equals(Undergraduate otherUndergraduate) {
		return equals((Student)otherUndergraduate)&&(this.level==otherUndergraduate.level);
	}

}
