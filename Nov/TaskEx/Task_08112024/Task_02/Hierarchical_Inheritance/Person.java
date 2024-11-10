package Nov.TaskEx.Task_08112024.Task_02.Hierarchical_Inheritance;

public class Person {
	  String name;
	    int age;

	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void displayDetails() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
}