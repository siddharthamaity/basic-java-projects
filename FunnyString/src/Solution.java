import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// Read test case count
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		// Test each string
		for (int i = 0; i < count; i++) {
			String str = sc.next();
			if (isFunny(str)) {
				System.out.println("Funny");
			} else {
				System.out.println("Not Funny");
			}
		}
		sc.close();
	}

	public static boolean isFunny(String str) {
		// Convert string into character array
		char[] chars = str.toCharArray();
		int length = chars.length;
		// Looping to mid is enough
		int mid = str.length() / 2;
		for (int i = 0; i <= mid; i++) {
			// If different, not funny
			if (Math.abs(chars[i] - chars[i + 1]) != Math.abs(chars[length - i - 1] - chars[length - i - 2])) {
				return false;
			}
		}

		// All difference were same, funny
		return true;
	}

}
