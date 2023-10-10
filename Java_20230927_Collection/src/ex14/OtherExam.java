package ex14;

import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class OtherExam {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
//		List<Integer> list = {10,20,30,40,50};
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		int[] intNum = new int[5];
		int[] intNum2 = {10,20,30,40,50};
		
		List<Integer> list2 = Arrays.asList(10,20,30,40,50);
		for(int i : list2)
			System.out.print(i + " ");
		System.out.println();

		List<String> list3 = Arrays.asList("Toy", "Box", "Tobot");
		for(String i : list3)
			System.out.print(i + " ");

		System.out.println();
		//list3.add("Box"); 사용불가 Arrays.asList 추가 안됨
		
//		List<String> list4 = Arrays.asList("Toy", "Box", "Tobot");
		
		List<String> list5  = Arrays.asList("Toy", "Box", "Tobot") ;
		list5 = new ArrayList<String>(list5);
		list5.add("sssssssss");
		for(String s : list5)
			System.out.print(s + " ");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
