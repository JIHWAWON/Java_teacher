package ex05;
// Seoyeon Jo
// Seoyeon.Jo@stonybrook.edu

import java.util.Scanner;
public class PrintJob {
    
    public static int computePrintJobCost(String colorType, String paperSize, int count) {

    	int paperSizeCost = 0;
    	int colorTypeCost = 0;
    	
        if (colorType.equals("Grayscale")) {
            colorTypeCost = 5 * count;
        } else {
            colorTypeCost = 15 * count;
        }

        if (paperSize.equals("A4")) {
            paperSizeCost = 40 * count;
        } else if (paperSize.equals("A5")) {
            paperSizeCost = 20 * count;
        } else if (paperSize.equals("Letter")) {
            paperSizeCost = 30 * count;
        } else {
            paperSizeCost = 25 * count;
        }

        return colorTypeCost + paperSizeCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter colortype papersize and count: ");
        String input = scanner.nextLine();

        String[] arr = input.split(" ");

        String colorType = arr[0];
        String paperSize = arr[1];
        int count = Integer.parseInt(arr[2]);

        int totalCost = computePrintJobCost(colorType, paperSize, count);
        System.out.println("Print job cost: " + Math.round(totalCost));

        scanner.close();
    }

}
