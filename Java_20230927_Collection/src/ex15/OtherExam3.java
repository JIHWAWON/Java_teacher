package ex15;

import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
class Person implements Comparable{
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return name + "(" + age + ")";
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
	
		return this.name.length() - p.name.length();
	}
}

public class OtherExam3 {

	public static void main(String[] args) {
		Person[] persons = new Person[3];
		persons[0] = new Person("조조", 40);
		persons[1] = new Person("유비2", 20);
		persons[2] = new Person("관우333", 39);
		
		Arrays.sort(persons);
		for(Person p : persons)
			System.out.println(p);
			
	}
	
}
