package Ex06;

interface Ccc{
	int square(int x);
}

class Cccc implements Ccc{
	@Override
	public int square(int x) {
		return x*x;
	}
}

public class Lambda7 {
	public static void main(String[] args) {
		
		//Ccc cc = x -> 	x*x;
		Ccc cc = 
			
		 x ->{
				System.out.println("1111111111111");
				return x*x;
			};
	
		
		
		int result = cc.square(9);
		System.out.println(result);
		
	}
}






