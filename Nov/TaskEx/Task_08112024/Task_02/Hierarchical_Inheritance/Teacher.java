package Nov.TaskEx.Task_08112024.Task_02.Hierarchical_Inheritance;

public class Teacher extends Person{
	int TId;

	public Teacher(String name, int tId, int age) {
		super(name, age);
		TId = tId;
	}
	


	void displayTeacherInfo() {
		System.out.println("Teacher Name:" + name);
		System.out.println("Teacher ID:" + TId);
	}
}
