package core.concepts;

import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the martial status:(married/unmarried):");
		String ms = in.nextLine();

		if (ms.equals("married")) {
			System.out.println("You are eligible to the insurance");
		} else if (ms.equals("unmarried")) {
			System.out.println("Enter the Below Details:");
			System.out.println("Enter the gender:(male/female):");
			String gender = in.nextLine().toLowerCase();
			System.out.println("Enter your age:");
			int age = in.nextInt();

			if (gender.equals("male") || gender.equals("female")) {
				if (age >= 25) {
					System.out.println("Eligible");
				} else {
					System.out.println("Not Eligible");
				}

			} else if (gender.equals("female")) {
				if (age >= 30) {
					System.out.println("Eligible.......");
				} else {
					System.out.println("Not Eligible..........");
				}

			} else {
				System.out.println("Invalild Gender Input");
			}
		} else {
			System.out.println("Invaild Matrial Status");
		}

	}
}
