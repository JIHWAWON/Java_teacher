package ex06_interface;

public class LPrinter implements Printable{

	@Override
	public void print(String msg) {
		System.out.print("LG프런티 흑백 출럭 : ");
		System.out.println(msg);
	}
	
}
