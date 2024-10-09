import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

	}

	public static boolean anagramWord(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}

		char[] characters = word.toCharArray();
		for (char ch : characters) {
			int index = anagram.indexOf(ch);
			if (index == -1) {
				return false;
			} else {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			}
		}

		return anagram.isEmpty();
	}

	public static boolean isAnagram(String word, String anagram) {
		char[] charFromWord = word.toCharArray();
		char[] charFromAnagram = anagram.toCharArray();

		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);

		return Arrays.equals(charFromWord, charFromAnagram);
	}

	public static boolean checkAnagram(String word, String anagram) {
		char[] characters = word.toCharArray();
		StringBuilder stringBuilder = new StringBuilder(anagram);

		for (char ch : characters) {
			int index = stringBuilder.indexOf("" + ch);
			if (index == -1) {
				return false;
			} else {
				stringBuilder.deleteCharAt(index);
			}
		}

		return (stringBuilder.length() == 0) ? true : false;
	}
}
