package Nov.TaskEx.Task_19112024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab199_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Collection list = new ArrayList();//Dynamic dispatch
      //List list1 = new ArrayList();//Dynamic Dispatch
      ArrayList list = new ArrayList();
      list.add("febil");
      list.add("jose");
      list.add("febil");//Duplicate is allowed
      list.add(1);//Different data type is allowed
      list.add(true);
      list.add(null); // null is allowed

      System.out.println(list);
	}
}