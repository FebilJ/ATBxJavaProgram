package Nov.TaskEx.Task_21112024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab212_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Set s1 =  new HashSet();
	        Set ls = new LinkedHashSet();
	        Set ts = new TreeSet();

	       // Collection c = new HashSet();

	       // Object o = new HashSet<>();

	        s1.add("febil");
	        s1.add("jose");
	        s1.add("roy");
	        //s1.add("febil");
	        s1.add(11);
	        System.out.println(s1);
	        s1.add(null);
	        System.out.println(s1);
	        // set does not allow duplicates
	        //data is not added in sequence order

	}
}