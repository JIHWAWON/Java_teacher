package ex04;

import lombok.Getter;

@Getter
public class Student {
	private String name;
	private int age, kor,eng,math,sum;
	private double avg;
	
	public int sum() {
		return kor+eng+math;
	}
	
	public double average() {
		return (int)(sum()/3.0*100+0.5)/100.0;
//		return sum()/3.0;
	}
	
	public Student(String name, int age, int kor, int eng, int math) {
		this.name = name;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum();
		this.avg = average();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
				+ sum + ", avg=" + avg + "]";
	}
	
}
