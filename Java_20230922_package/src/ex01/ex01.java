package ex01;

import java.util.Arrays;
import java.util.List;

public class ex01 {

	public static void main(String[] args) {
		
		int[] numA = new int[5];
		
		for(int i=0; i<numA.length; i++)
			numA[i] = i+1;
		
		for(int i=0; i<numA.length; i++)
			System.out.print(numA[i] + " ");
		
		int[] numB = new int[10];
		
		for(int i=0; i<numA.length; i++)
			numB[i] = numA[i];
		
		System.out.println();
		for(int i=0; i<numB.length; i++)
			System.out.print(numB[i] + " ");
	}

}
