package ex13;

import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class HashMapCollection {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap();
		
		map.put(45, "Toy1");
		map.put(45, "Toy3");
		map.put(35, "Robot");
		map.put(25, "Box");
		map.put(15, "Toy");
		map.put(45, "Toy2");
		System.out.println(map.get(45));
		
		Set<Integer> keySet = map.keySet();
		
		for(int i : keySet) {
			System.out.print(i + " ");
		}
		System.out.println("\n-------------------");
		
		for(int i : keySet) {
			System.out.print(map.get(i) + " ");
		}
		System.out.println("\n-------------------");
		
		Iterator<Integer> itr = keySet.iterator();
		while(itr.hasNext())
			System.out.println(map.get(itr.next()));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
