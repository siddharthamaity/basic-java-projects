import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		// Read no of test cases
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();
		// Read all lines & process
		while (count > 0) {
			String line = sc.nextLine();
			System.out.println(alternate(line));
		}
		sc.close();
	}

	public static int alternate(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			// If consecutive are equal, increment count
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			}
		}

		return count;
	}
}
