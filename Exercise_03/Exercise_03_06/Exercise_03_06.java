/*
(Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10
inches, you will enter 5 for feet and 10 for inches.
*/
import java.util.Scanner;

public class Exercise_03_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter weight, feet and inches
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		System.out.print("Enter feet: ");
		double feet = input.nextDouble();
		System.out.print("Enter inches: ");
		double inches = input.nextDouble();

		final double kilo_per_lb = 0.45359237; // Constant
		final double m_per_in = 0.0254; 		  // Constant
		final double ft_per_in = 0.0833333;		  // Constant

		// Compute BMI
		weight *= kilo_per_lb;
		double height = (inches += feet / ft_per_in) * m_per_in;
		double bmi = weight / (Math.pow(height, 2));

		// Display result
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}
}