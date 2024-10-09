import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// Read no of test cases
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		// Read all test cases
		while (count > 0) {
			int number = sc.nextInt();
			System.out.println(findDigits(number));
			count--;
		}
		sc.close();
	}

	public static int findDigits(int number) {
		// List to hold the digits
		ArrayList<Integer> digits = new ArrayList<>();
		// Copy the number & extract digits from it
		int temp = number;
		while (temp > 0) {
			int digit = temp % 10;
			// No need to insert 0s
			if (digit != 0) {
				digits.add(temp % 10);
			}
			temp /= 10;
		}
		int count = 0;
		// Check division by each digit
		for (Integer i : digits) {
			if (number % i == 0) {
				count++;
			}
		}

		return count;
	}

}
