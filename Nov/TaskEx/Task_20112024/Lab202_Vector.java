package Nov.TaskEx.Task_20112024;

import java.util.Vector;

public class Lab202_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
        v.add("febil");
        v.add("jose");
        v.add("roy");
        v.add("thomas");
        v.add("jose");
        System.out.println(v);
        v.add(1);
        v.add(null);
        v.add(true);
        System.out.println(v);
        v.remove("");
        System.out.println(v);
        System.out.println(v.contains("febil"));
        System.out.println(v.get(0));
        v.add("febil");
        System.out.println(v);
        System.out.println(v.indexOf("febil"));
        System.out.println(v.lastElement());
        System.out.println(v.lastIndexOf("febil"));
	}
}