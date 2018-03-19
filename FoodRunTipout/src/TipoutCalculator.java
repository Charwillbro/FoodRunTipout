package src;

import java.util.Scanner;

public class TipoutCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int numOfFoodRun;
		double totalHours = 0;
		double totalTipout = 0;
		double hourlyRate;

		System.out.println("How many food Runners were there?");
		numOfFoodRun = in.nextInt();

		double[] runnerHours = new double[numOfFoodRun];
		double[] hourlyPay = new double[numOfFoodRun];

		// entering each foodrunners hours
		for (int i = 0; i < numOfFoodRun; i++) {
			System.out.println("How many hours did food runner " + (i + 1) + " work?");
			runnerHours[i] = in.nextDouble();
		}

		// loop to add each item in the array to the total hours
		for (int i = 0; i < numOfFoodRun; i++) {

			totalHours += runnerHours[i];

		}

		// getting the total tipout
		System.out.println();
		System.out.println("How much did you collect in tips?");
		totalTipout = in.nextDouble();

		// calculating the hourly rate
		hourlyRate = totalTipout / totalHours;

		for (int i = 0; i < numOfFoodRun; i++) {

			hourlyPay[i] = hourlyRate * runnerHours[i];

			System.out.printf("Food runner " + (i + 1) + " gets $%.2f dollars. \n", hourlyPay[i]);

		}
		in.close();
	}

}
