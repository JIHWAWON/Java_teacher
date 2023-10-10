package Ex06;

import java.util.function.Predicate;

public class Lambda9 {
	public static void main(String[] args) {
		
		Predicate<Integer>  p1 = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer x) {
				System.out.print(x + " : ");
				return x%2==0;
			}
		};
		
		boolean flag = p1.test( (int)(Math.random()*100));
		
		String msg = flag == true ? "짝수" : "홀수";
		
		System.out.println(msg);
		System.out.println("-----------------------------");
		
		
		Predicate<Integer>  p2 = x->  x%2==0;
	
		
		flag = p2.test( (int)(Math.random()*100));
		
		msg = flag == true ? "짝수" : "홀수";
		
		System.out.println(msg);
		
	}
}
