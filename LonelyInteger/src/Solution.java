import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		// Read count
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		// To hold integers which have till occurred once
		ArrayList<Integer> integers = new ArrayList<>();
		// Read all integers
		while (count > 0) {
			Integer integer = new Integer(sc.nextInt());
			// Array has one, so remove it, else new, add it
			if (integers.contains(integer)) {
				integers.remove(integer);
			} else {
				integers.add(integer);
			}
			count--;
		}
		sc.close();

		// The lonely element in the list is the lonely integer
		System.out.println(integers.get(0));
	}
}
