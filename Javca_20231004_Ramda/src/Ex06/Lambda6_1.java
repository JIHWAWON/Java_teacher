package Ex06;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//	void printVal(String name);
//	System.out.println(name);


public class Lambda6_1 {
	public static void main(String[] args) {
//		Consumer<String> con = name -> System.out.println(name);
		
		Consumer<String> con = new Consumer<String>() {
			
			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		};
		
		con.accept("조조");
		
		BiConsumer<String, Integer> bicon = 
				(name, age)-> System.out.println(name + " = " + age);
		bicon.accept("조조", 20);
				
		
	}
}
