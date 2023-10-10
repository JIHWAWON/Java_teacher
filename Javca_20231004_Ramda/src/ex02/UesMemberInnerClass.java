package ex02;

interface Printable{
	void print();
}

class Papers{
	private String con;
	
	public Papers(String con) { this.con = con; }
	
	public Printable getPrinter() {
		return new Printer2();
	}
	
	private class Printer implements Printable{

		@Override
		public void print() {
			System.out.println(con);
		}
		
	}
	private class Printer2 implements Printable{

		@Override
		public void print() {
			System.out.println(con);
		}
		
	}
}

public class UesMemberInnerClass {

	public static void main(String[] args) {
		Papers p = new Papers("프린터로 메시지 출력해 주세요.");
		
		Printable prn = p.getPrinter();
		prn.print();
		
	}

}














