package ex05;

public class Tire {
	public void roll() {
		System.out.println("일반 타이어가 굴러감..");
	}
}

class Aaa extends Tire{
	@Override
	public void roll() {
		System.out.println("하위클래스 객체 생성");
	}
}
