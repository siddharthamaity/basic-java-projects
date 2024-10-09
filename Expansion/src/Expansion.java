import java.util.Scanner;

public class Expansion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		scanner.close();

		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch == '-') {
				if ((i != 0) && (i != string.length() - 1)) {
					char startCh = string.charAt(i - 1);
					char endCh = string.charAt(i + 1);
					if (validChar(startCh) && validChar(endCh)) {
						String toAdd = "";
						if (startCh <= endCh) {
							for (int j = startCh + 1; j < endCh; j++) {
								toAdd += (char) j;
							}
						} else {
							for (int j = startCh - 1; j > endCh; j--) {
								toAdd += (char) j;
							}
						}
						string = string.substring(0, i) + toAdd + string.substring(i + 1, string.length());
					}
				}
			}
		}

		System.out.println(string);
	}

	public static boolean validChar(char ch) {
		return (((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z')) || ((ch >= '0') && (ch <= '9')));
	}

}
