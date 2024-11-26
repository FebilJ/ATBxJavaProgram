package Nov.TaskEx.Task_22112024_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab217_Map_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Map map  =  new HashMap();

	      //  Map<String , Object> map1 = new HashMap<>();
	        //here data type is fixed
	// order is not maintained
	        //K
	        map.put("name", "febil");
	        map.put("rollNo", 1);
	        map.put("phone", 763476334);
	        System.out.println(map);

	        map.put("name", "roy");
	        System.out.println(map);

	    }
}