package Nov.TaskEx.Task_13112024_Static_Wrapper_Exceptions;

public class Lab163_Static {
	public static void main(String[] args) {
		student s = new student(20);
		student s1 = new student(10);

		System.out.println("Instance Variable = " + s.age);
		System.out.println("Static Variable = " + student.school_name);
	}
}

class student{
	int age;//non static variable // Instance Variable
	static String school_name = "ABC"; //static variable
	
	student(int age){
		this.age = age;
	}
	//Instance Initialization Block
	//I will be executed when Object is created.
	{
		System.out.println("IIB");
		System.out.println("Here you can write a code waht you want to write");
		System.out.println("Read a MySQL db()");
	}
	
	//Static Block
	
	static {
		System.out.println("SIB");
		System.out.println("Loaded once, When Class is Loaded");
		System.out.println("Read the excel file");
	}
}