
/**
 * Class to represent a large integer.
 *
 */
public class LargeInt {
	private String number;

	public LargeInt(String value) {
		StringBuilder builder = new StringBuilder(value);
		this.number = builder.reverse().toString();
	}

	public LargeInt(String value, int length) {

	}

	private void padZero(int size) {
		StringBuilder builder = new StringBuilder();
		while (size > 0) {
			builder.append("0");
		}
		number = number + builder.toString();
	}

	public void add(LargeInt value) {
		int carry = 0;
		StringBuilder result = new StringBuilder();
		if (this.number.length() < value.number.length()) {

		}

		int length = (this.number.length() > value.number.length()) ? this.number.length() : value.number.length();
		for (int i = 0; i < length; i++) {
			int a = Integer.parseInt(this.number.charAt(i) + "");
			int b = Integer.parseInt(value.number.charAt(i) + "");
			int c = a + b + carry;
			if (c > 9) {
				c = c / 10;
				carry = c % 10;
			} else {
				carry = 0;
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(number);
		return "LargeInt [number=" + builder.reverse().toString() + "]";
	}
}
