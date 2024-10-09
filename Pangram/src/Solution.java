import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// Read input
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		// Store string in char array
		char[] chars = str.toCharArray();
		// Keeps track of found alphabets, an alphabet dictionary
		ArrayList<Character> notFound = new ArrayList<>(26);
		for (char ch = 'a'; ch <= 'z'; ch++) {
			notFound.add(ch);
		}
		// Read whole char array
		for (int i = 0; i < chars.length; i++) {
			char ch = Character.toLowerCase(chars[i]);
			// If found remove that from dictionary
			if (notFound.contains(ch)) {
				notFound.remove(new Character(ch));
			}
		}

		// If all found, pangram
		if (notFound.isEmpty()) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}
	}
}
