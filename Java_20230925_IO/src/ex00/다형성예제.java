package ex00;
class 소미{
	void funcA() {System.out.println("funcA...");}
}

class 자녀 extends 소미{
	void funcB() {System.out.println("funcB...");}
	void funcA() {System.out.println("효도...");}
}

class 직장인 extends 소미{
	void funcC() {System.out.println("funcB...");}
	void funcA() {System.out.println("열심히 근무");}
}

public class 다형성예제 {

	public static void main(String[] args) {
		
		소미 a =    new 직장인();
		a.funcA();
		
		
		
		
		
	}

}
