import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		// Read no of inputs
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		// Read all inputs
		while (count > 0) {
			int number = sc.nextInt();
			System.out.println(flipBits(number));
			count--;
		}
		sc.close();
	}

	public static int flipBits(int number) {
		int mask = number & 0x80000000;
		number = ~number;
		if (mask == 0) {
			number = number & 0x7FFFFFFF;
		} else {
			number = number | 0x80000000;
		}

		return number;
	}
}
