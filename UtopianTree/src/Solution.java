import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		// Read no of test cases
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		// Read all inputs & calculate outputs
		while (count > 0) {
			int age = sc.nextInt();
			System.out.println(getGrowth(age));
			count--;
		}
		sc.close();
	}

	public static int getGrowth(int age) {
		// true -> spring, false -> summer
		boolean isSpring = true;
		int currentLength = 1;
		for (int i = 0; i < age; i++) {
			// If spring, length doubles, else increase by 1
			if (isSpring) {
				currentLength *= 2;
			} else {
				currentLength += 1;
			}
			isSpring = !isSpring;
		}

		return currentLength;
	}
}
