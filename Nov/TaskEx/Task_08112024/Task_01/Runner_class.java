package Nov.TaskEx.Task_08112024.Task_01;

public class Runner_class {

	public static void main(String[] args) {
		
		StudentATB s1 = new StudentATB("feb", 3);
		StudentATB s2 = new StudentATB("jeb", 4);
		StudentATB s3= new StudentATB("han", 1);
		
		//Creating a array of StudentATB objects
		StudentATB[] Students = {s1, s2, s3};
		
		for (StudentATB Studs:Students) {
			System.out.println(Studs);
		}
	}

}
