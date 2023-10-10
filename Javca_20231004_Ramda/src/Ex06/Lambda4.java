package Ex06;

@FunctionalInterface
interface Cal2{
	int max(int num1, int num2);
}


public class Lambda4 {
	public static void main(String[] args) {
		Cal2 cal = 
			
			( num1,  num2)-> num1>num2 ? num1: num2;
			
		int result = cal.max(19, 10);
		System.out.println(result);
	}
}
