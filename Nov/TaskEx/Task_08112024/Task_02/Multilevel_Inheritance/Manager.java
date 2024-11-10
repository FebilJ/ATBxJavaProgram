package Nov.TaskEx.Task_08112024.Task_02.Multilevel_Inheritance;

public class Manager extends Employee{
	String Dep;

	public Manager(String name, int age, int empID, String dep) {
		super(name, age, empID);
		Dep = dep;
	}
	
	void displayManagerInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(empID);
		System.out.println(Dep);
	}
}