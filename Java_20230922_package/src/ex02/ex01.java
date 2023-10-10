package ex02;

import java.util.Arrays;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ex01 {

	public static void main(String[] args) {
		
		String str1 = new String("이영수");
		String str2 = new String("이영수");
		
		System.out.println(str1.equals(str2));

		int i=10;
		int j= 20;
		//System.out.println(i.equals(j));
		
		Integer m = new Integer(10);
		Integer n = new Integer(10);
		
		System.out.println(m.equals(n));
		
		
		Object obj = 10;   //Object obj = new Integer(10);
		String str0  = null;
	
		Person p1 = new Person("김용우", 25);
		Person p2 = new Person("김용우2", 25);
		System.out.println("----------------");
	
		System.out.println( p1.equals(p2) );
	
	}

}

class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	System.out.println(p1.equals(p2));  p1.name == p2.name
//Person p2 = new Person("김용우",25);
// Object obj = p2;
	
	@Override
	public boolean equals(Object obj) {
		
		Person p2	=  (Person)obj;
		return this.name.equals(p2.name) && this.age == p2.age;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
