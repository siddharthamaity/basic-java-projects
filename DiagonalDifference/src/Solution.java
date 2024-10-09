import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// Read dimension
		Scanner sc = new Scanner(System.in);
		int dimension = sc.nextInt();
		int difference = 0;
		// Read the matrix
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				int value = sc.nextInt();
				// Diagonal 1, add it
				if (i == j) {
					difference += value;
				}
				// Diagonal 2, subtract it
				if (i == dimension - j - 1) {
					difference -= value;
				}
			}
		}
		sc.close();

		// Print absolute value of difference
		System.out.println(Math.abs(difference));
	}

}
