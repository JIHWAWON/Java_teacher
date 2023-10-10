package ex10_1;

public class Person {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("kim");
		person.setAge(20);
		person.printInfo();
	}
}
