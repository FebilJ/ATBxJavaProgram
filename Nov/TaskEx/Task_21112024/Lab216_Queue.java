package Nov.TaskEx.Task_21112024;

import java.util.PriorityQueue;

public class Lab216_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue pq = new PriorityQueue();
        pq.add("Apple");
        pq.add("Mango");
        pq.add("Apple");
//        pq.add(1); // ClassCastException
     // pq.add(null); NullPointer Exception
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
	}
}