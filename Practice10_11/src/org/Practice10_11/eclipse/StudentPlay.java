package org.Practice10_11.eclipse;
import java.util.Arrays;
public class StudentPlay {

	public static void main(String[] args) {
		System.out.println("create Student1...\n");
		Student[] student=new Student[5];
		
		student[0]=new Student("SANHA",1);
		student[1]=new Student("MINHA",2);
		student[2]=new Student("SUSAN",3);
		student[3]=new Student("SAMSUB",4);
		student[4]=new Student("JUNGMI",5);

		System.out.println("order student number!\n");
		Arrays.sort(student);
		
		for(Student student_one: student)
			System.out.println(student_one);
		
		System.out.println("\n-----------------------------------------\n");
		System.out.println("create Student2...\n");
		Student2[] student2=new Student2[5];
		
		student2[0]=new Student2("SANHA",1);
		student2[1]=new Student2("MINHA",2);
		student2[2]=new Student2("SUSAN",3);
		student2[3]=new Student2("SAMSUB",4);
		student2[4]=new Student2("JUNGMI",5);

		System.out.println("order student name!\n");
		Arrays.sort(student2);
		
		for(Student2 student_one: student2)
			System.out.println(student_one);
	}
	

}
