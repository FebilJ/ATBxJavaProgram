package Nov.TaskEx.Task_08112024.Task_02.Hierarchical_Inheritance;

public class Staff extends Person{
	String Dep;
	
	public Staff(String name, String dep, int age) {
		super(name, age);
		Dep = dep;
	}
	
	void displayStaffInfo() {
		System.out.println("Staff Name:" + name);
		System.out.println("Department Name:" + Dep);
	}
}
