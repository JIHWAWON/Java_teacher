package ex2_1;

class Person {
	public String toString() {
		return "I am an person";
	}
}
class Apple{
	public String toString() {
		return "I am an apple";
	}
}

class Orange{
	public String toString() {
		return "I am an orange";
	}
}

class Box{ 
	private Object obj;
	
	void setObj(Object obj) {
		this.obj = obj;
	}
	
	Object getObj(){
		return obj;
	}
}

public class Generices1 {
	public static void main(String[] args) {
	
		Box aBox = new Box();  //사과만 담겠다..
		Box oBox = new Box();  //오렌지 담고싶넹
		
		aBox.setObj(new Apple());
		oBox.setObj(new Orange());
		
		//Object o1 = aBox.getObj();
		Apple a1 =  (Apple)aBox.getObj(); //?????
		System.out.println(a1);
//		System.out.println(a1);
		
		
		
		Object ob = new Apple();
		
		Apple app = (Apple)ob;
		System.out.println(app);
		
		
		
		
		
		
		
		
		
		
	}
}











