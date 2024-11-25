package Nov.TaskEx.Task_20112024;

import java.util.ArrayList;
import java.util.List;

public class Lab204_NestedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 List fruits1 = new ArrayList();
	 
	 fruits1.add("mango");
	 fruits1.add("banana");
	 fruits1.add("orange");
	 
	 System.out.println(fruits1);
	 
	 
	 List fruits2 = new ArrayList();
	 
	 fruits2.add("grapes");
	 fruits2.add("papaya");
	 fruits2.add("gauva");
	 
	 System.out.println(fruits2);
	 
	 
	 List veggies = new ArrayList();
	 
	 veggies.add("tomato");
	 veggies.add("potato");
	 veggies.add("brinjal");
	 
	 System.out.println(veggies);
	 
	 List all = new ArrayList();
	 
	 all.add(fruits1);
	 all.add(fruits2);
	 all.add(veggies);
	 all.add("milk");
	 all.add("butter milk");
	 
	 System.out.println("Printing all: " + all);
	}
}