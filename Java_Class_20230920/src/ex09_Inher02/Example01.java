package ex09_Inher02;

public class Example01 {

	public static void main(String[] args) {
		
		BabyCat catObj = new BabyCat("삼고양이", "흰색");
		
		catObj.eat();
		catObj.meow();
		System.out.println(catObj.breed);
		System.out.println(catObj.color);
	}

}
