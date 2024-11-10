package Nov.TaskEx.Task_08112024.Task_02.Multilevel_Inheritance;

public class Employee extends Person{
	int empID;

	public Employee(String name, int age, int empID) {
		super(name, age);
		this.empID = empID;
	}
	
	void displayEmpInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(empID);
	}
}