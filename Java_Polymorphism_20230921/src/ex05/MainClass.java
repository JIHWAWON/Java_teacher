package ex05;

public class MainClass {

	public static void main(String[] args) {

		A a = new A();
		a.funcA();
		
		B b = new B();
		b.funcB();
		b.funcA();
		//b.funcC();(x)
		
		C c = new C();
		c.funcC();
		c.funcB();
		c.funcA();
		System.out.println("-----------------------");
		
		A aa  = new B();
		aa.funcA();  //A class funcA() 출력
		//B 클래스가 A클래스있는 funcA메소드를 재정의하면 그 때는 B클래스 안 funcA가 실행됨
		
		B bb = (B)aa;
		
		
		A a3 = new C();
		
		B b3 = (B)a3;
		
		
		C c3 = (C)a3;
		
		
		
		
		
		
	}

}
