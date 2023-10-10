package ex06_interface;

public class SPrinter implements CSPrint{

	@Override  //어노테이션
	public void print(String msg) {
		System.out.print("삼성프린터 흑백 출력 : ");
		System.out.println(msg);
	}

	@Override
	public void cprint(String msg) {
		System.out.print("삼성프린터 칼라 출력 : ");
		System.out.println(msg);
	}

}
