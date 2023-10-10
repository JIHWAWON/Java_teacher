package ex11;

public class MainClass {

	public static void main(String[] args) {
		
		func(new D());
	}
	
	static void func(Object obj) {
//		A a = (A)obj;
//		a.funcA();
		
		if( obj instanceof A) {
			A a = (A)obj;
			 a.funcA();
		}
		System.out.println("종료");
	}

}
