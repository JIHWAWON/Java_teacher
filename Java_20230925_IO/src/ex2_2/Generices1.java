package ex2_2;

import java.util.ArrayList;

class A{}
class B extends A{}
class C extends B {}

//제네릭 클래스
class Box<T extends A>{   // A이거나 A상속한 클래스만 전달해라.
	private T obj;
	
	void setObj(T obj) {
		this.obj = obj;
	}
	
	T getObj(){
		return obj;
	}
}

public class Generices1 {
	public static void main(String[] args) {
	
		Box<A> aBox = new Box();
		Box<B> bBox = new Box();
		Box<C> cBox = new Box();
		
		//Box<Integer> iBox = new Box();
		
		ArrayList<Integer> ilist = new ArrayList();

	}
}











