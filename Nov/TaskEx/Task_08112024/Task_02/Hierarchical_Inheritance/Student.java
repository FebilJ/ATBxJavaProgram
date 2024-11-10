package Nov.TaskEx.Task_08112024.Task_02.Hierarchical_Inheritance;

public class Student extends Person{
	int StdId;
	
	public Student(String name, int stdId, int age) {
		super(name,age);
		StdId = stdId;
	}
	
//	public Student(String name2, int i, int age) {
//		super(name,age);
//		Name = name;
//		StdId = stdId;
//	}

	void displayStdInfo() {
		System.out.println("Student Name:" + name);
		System.out.println("Student ID:" + StdId);
	}
}