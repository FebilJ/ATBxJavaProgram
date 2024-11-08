package Nov.TaskEx.Task_07112024.Single_Inheritance.example2;

public class Python extends Programming{
	
	void print() {
		System.out.println(author);
		System.out.println(version);
	}
	
	Python(){
		System.out.println("Python class");
	}
	
	public static void main(String[] args) {
		Python p1 = new Python();
		System.out.println(p1.author);
	}
}
