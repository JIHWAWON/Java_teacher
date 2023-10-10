package ex05;

import java.util.Scanner;

public class Salary {
	
	 public static void main(String[] args) {
		 	Scanner scanner = new Scanner(System.in);	
	        System.out.println("Enter four integers on one line: ");
	        System.out.println("4개 정수를 입력하는데 이런식으로 입력함 >> -5 24 1111 -6");
	        String[] tmp = scanner.nextLine().split(" ");
	        
	        int result = min4(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2]), Integer.parseInt(tmp[3]));
	        System.out.println("The smallest of these is " + result);
	 }
	 
	static int min4(int num1, int num2, int num3, int num4) {
        int min = num1;

        if (num2 < min) {
            if (num2 < num3) {
                if (num2 < num4) {
                    min = num2;
                } else {
                    min = num4;
                }
            } else {
                if (num3 < num4) {
                    min = num3;
                } else {
                    min = num4;
                }
            }
        } else {
            if (num1 < num3) {
                if (num1 < num4) {
                    min = num1;
                } else {
                    min = num4;
                }
            } else {
                if (num3 < num4) {
                    min = num3;
                } else {
                    min = num4;
                }
            }
        }

        return min;
    }
}
