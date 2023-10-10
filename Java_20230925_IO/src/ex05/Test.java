package ex05;

public class Test {

	static int eng=100;
	static int kor=900;
	static int sum=eng+kor;
	
//	static {
//		eng = 100;
//		kor = 90;
//		sum = eng+kor;
//	}
	
	public static void main(String[] args) {
		//Test t = new Test();
		
		
		System.out.println(sum);
		
		
	}
	
	static int sum(int ...values) {
		int sum=0;
		for(int i=0; i<values.length; i++)
			sum += values[i];
		
		return sum;
	}

}

class A{
	void func() {
		Test.sum(1,2,3);
	}
}
