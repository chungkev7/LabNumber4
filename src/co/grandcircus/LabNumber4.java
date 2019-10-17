package co.grandcircus;

import java.util.Scanner;

public class LabNumber4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String toContinue = "y";
		
		System.out.println("Learn your squares and cubes!\n");
				
		while (toContinue.equals("y")) {
		System.out.println("Enter an integer: ");

		int userInt = scanner.nextInt();

		System.out.println("Number\tSquared\t Cubed");
							
		for (int i = 1; i <= userInt; i++) {
		System.out.println(i + "\t" + squaredNumber(i) + "\t " + cubedNumber(i));
		}
		
		scanner.nextLine();
		
		System.out.println("\nWould you like to continue? (y/n)");
		
		toContinue = scanner.nextLine().toLowerCase().substring(0, 1);
	
		}
		
		System.out.println("Calculation complete. Have a nice day!");

		scanner.close();
	}

	public static int squaredNumber(int num) {
		return num * num;
	}

	public static int cubedNumber(int num) {
		return num * num * num;
	}

}
