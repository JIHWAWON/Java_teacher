package ex01_1;

import java.util.ArrayList;

class Box <T>{
	private T ob;  //String ob
	public void set(T ob) {//String ob
		this.ob = ob;
	}
	public T get() { return this.ob; }  //String ob
}

class Unboxer{
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}
}

public class GenericMethodExam {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("Sweet");
		
		String str =  Unboxer.<String>openBox(box);         // T :String : Sweet
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
