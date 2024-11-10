package Nov.TaskEx.Task_08112024.Task_02.Hierarchical_Inheritance;

public class Runner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Febil", 12, 15);
		System.out.println("Students Information");
		s1.displayStdInfo();
		System.out.println("--------------------");
		
		Teacher t1 = new Teacher("Sofia", 12, 15);
		System.out.println("Teachers Information");
		t1.displayTeacherInfo();
		System.out.println("--------------------");
		
		Staff st1 = new Staff("Jenil", "Commerce", 15);
		System.out.println("Staffs Information");
		st1.displayStaffInfo();
		System.out.println("--------------------");
	}
}