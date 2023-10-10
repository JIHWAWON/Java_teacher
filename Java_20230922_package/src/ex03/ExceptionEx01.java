package ex03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx01 {

	public static void main(String[] args) {
		System.out.println("예의처리1");
		System.out.println("예의처리2");
		System.out.println("예의처리3");
		System.out.println("예의처리4");
		
		Scanner sc =new Scanner(System.in);
		System.out.println(">> 정수 입력입력(0은 입력하지마세요)");
		
		int[] num2 = new int[5];
		try {
			int num = sc.nextInt();
			System.out.println(5/num);
			System.out.println("111");
			System.out.println("111");
			System.out.println("111");
			num2[10] = 9;
		}catch(Exception e) {
			System.out.println("예의 내용1: " + e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("예의처리 종료!!!!!");
		}
		
		System.out.println("예의처리5");
		System.out.println("예의처리6");
		System.out.println("예의처리7");
		System.out.println("예의처리8");
		System.out.println("프로그램 종료!!!");
	}

}
