package Nov.TaskEx.Task_21112024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab209_AL_Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> al =  new ArrayList();
        al.add("febil");
        al.add("jose");
        al.add("babu");

        System.out.println(" to print array list via for Each ");

//        for(Object str : al){
       
        for(String str: al) {
        	System.out.println(str);
        }

        System.out.println(" To print array list via for loop");
        for (int i =0; i<al.size(); i++){
            System.out.println(al.get(i));
        }


        System.out.println("to print array list via iterator");
        //Iterator<String> iterator = al.iterator();

        Iterator it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
	}
}