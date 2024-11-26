package Nov.TaskEx.Task_22112024_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab221_Map_P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> student1 = new HashMap();
        student1.put("name","febil");
        student1.put("phone","32423424");
        student1.put("address","BLR");
        System.out.println(student1);

        HashMap<String, String> student2 =  new HashMap<>();
       student2.put("name", "james");
       student2.put("phone", "9734534893");
       student2.put("address","TVM");
        System.out.println(student2);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
	}
}