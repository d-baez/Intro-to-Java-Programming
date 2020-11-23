/*
(Conversion from miles to kilometers) Write a program that displays the following
table (note that 1 mile is 1.609 kilometers):
Miles           Kilometers
1               1.609
2               3.218
...
9               14.481
10              16.090
*/
public class Exercise_05_04 {
	public static void main(String[] args) {
		// Create a constant number of kilometers in a mile
		final double Km_PER_MI = 1.609;

		// Display table
		System.out.println(
			"Miles        Kilometers");

		// Create/solve conversions from miles to kilometers
		for (int i = 1; i <= 10; i++) {
			System.out.printf(
				"%-13d%-10.3f\n", i, (i * Km_PER_MI));
		}
	}
}