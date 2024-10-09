import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// Read input height
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		sc.close();
		// Print the staircase
		for (int i = height - 1; i >= 0; i--) {
			// Print spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// Print stairs
			for (int k = 0; k < height - i; k++) {
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}
}
