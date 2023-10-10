package ex10;

public class Person {
	private String name;
	private int age;
	
	public Person setName(String name) {
		this.name = name;
		return this;
	}
	public Person setAge(int age) {
		this.age = age;
		return this;
	}
	
	public void printInfo() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("kim").
		setAge(20).printInfo();
	}
}
