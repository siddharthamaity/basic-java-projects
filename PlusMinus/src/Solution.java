import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// Read no of values
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int positiveCount = 0, negativeCount = 0, zeroCount = 0;
		// Read all numbers
		for (int i = 0; i < count; i++) {
			int value = sc.nextInt();
			if (value == 0) {
				zeroCount++;
			} else if (value > 0) {
				positiveCount++;
			} else {
				negativeCount++;
			}
		}
		sc.close();

		// Print to 3 decimal places precision
		System.out.println(String.format("%,.3f", ((float) positiveCount / (float) count)));
		System.out.println(String.format("%,.3f", ((float) negativeCount / (float) count)));
		System.out.println(String.format("%,.3f", ((float) zeroCount / (float) count)));
	}
}
