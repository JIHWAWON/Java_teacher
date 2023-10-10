package ex04;

class A{
	void funcA() {
		System.out.println("AAA");
	}
}
class B extends A{
	void funcA() {
		System.out.println("BBB");
	}
}

class C extends A{
	
}

class D{
	void funcA() {
		System.out.println("DDD");
	}
}
public class MainClass {

	public static void main(String[] args) {
			
		conver(new C());
		
	}
	
	
	static void conver(Object obj) {
		if( obj instanceof A) {
			A a = (A)obj;
			a.funcA();
		}
		System.out.println("conver");
	}
}

















