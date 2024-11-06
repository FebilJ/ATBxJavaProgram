package Nov.TaskEx.Task_06112024.Task_ParaCons.Circle;

//Overloading Constructors
//Implement two constructors: one default & another one is parameterized
public class Circle {
	double radius;
	
	Circle(){
		this.radius = 1.0;
	}
	
	Circle(double r){
		this.radius = r;
	}
}