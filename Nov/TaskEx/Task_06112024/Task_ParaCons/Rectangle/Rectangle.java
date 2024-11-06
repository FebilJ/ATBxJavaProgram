package Nov.TaskEx.Task_06112024.Task_ParaCons.Rectangle;

public class Rectangle {
	
	int length;
	int width;
	
	// Parameterized constructor
	Rectangle(int l, int w){
		this.length = l;
		this.width = w;
	}
	
	public int area() {
		return length * width;
	}
}