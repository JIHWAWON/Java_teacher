package ex04;

import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		
		Student[] studnets = new Student[3];
		int total = 0;
		double average = 0;
		studnets[0] = new Student("이영수", 20, 80,55, 66);
		studnets[1] = new Student("김민철", 30, 82,88, 77);
		studnets[2] = new Student("장민우", 25, 80,77, 99);
		
		System.out.println("성명  나이  국어   영어  수학  총점  평균");
//		for(int i=0; i<studnets.length; i++) {
		for(Student s : studnets) {
			System.out.printf("%-5s %3d %3d %3d %3d %3d %5.2f\n",
					s.getName(), s.getAge(), s.getKor(),s.getEng(),s.getMath(),s.getSum(), s.getAvg());
//			System.out.printf("%s\n",s.getName());
			total += s.sum();
		}
		average = (double)total/studnets.length;
		
		System.out.printf("전체 총점 : %d, 전체 평균 : %.2f", total, average);
	}

}
