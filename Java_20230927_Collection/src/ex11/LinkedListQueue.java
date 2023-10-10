package ex11;

import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class LinkedListQueue {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
//		Queue<String> queue = new ArrayDeque<String>();
//		Queue<String> queue = new LinkedTransferQueue<String>();
		
		queue.add("Toy3");
		queue.offer("Box3");
		queue.offer("Robot3");
		queue.offer("Toy3");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println("---------------------");
		for(String s : queue)
			System.out.println(s);

		System.out.println("---------------------");
		for(String s : queue)
			System.out.println(s);
		System.out.println("---------------------");

		System.out.println(queue.peek());
		
		System.out.println("---------------------");
		for(String s : queue)
			System.out.println(s);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
