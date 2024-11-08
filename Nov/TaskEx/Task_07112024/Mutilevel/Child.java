package Nov.TaskEx.Task_07112024.Mutilevel;

public class Child extends Father{
int area = 3000;
	
	void c() {
		System.out.println(area);
		System.out.println("Child Function");
	}
	
	void c(int a) {
		this.area = a;
	}
	
	public static void main(String[] args) {
		Child c1 = new Child();
		

		c1.c(14);
		c1.c();
	}
	
}