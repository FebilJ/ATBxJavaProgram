package Nov.TaskEx.Task_22112024_Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lab219_Map_Real_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Object> student = new HashMap();
        student.put("name", "febil");
        student.put("rollNo",1);
        student.put("phone", 637438476);
        student.put("address", "BLR");
        System.out.println(student);

        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");

        System.out.println(book_read_items);
	}
}