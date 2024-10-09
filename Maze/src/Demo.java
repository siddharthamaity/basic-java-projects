import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Demo {

	public static void main(String[] args) throws IOException {
		ArrayList<Box> boxes = new ArrayList<>();
		// change the file path
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(Demo.class.getResourceAsStream("/input/sample.txt")));

		// Read maze from file
		String line = "";
		int dimension = 0;
		while ((line = reader.readLine()) != null) {
			dimension = line.length();
			for (int i = 0; i < line.length(); i++) {
				boxes.add(new Box(hexToInt(line.charAt(i)), i));
			}
		}

		// Indexes are calculated from the question in 1D representation
		int startIndex = 12;
		int curIndex = startIndex;
		int endIndex = 3;
		// stack to hold visited boxes
		Stack<Integer> stack = new Stack<>();
		// Array list to hold moves
		ArrayList<String> moves = new ArrayList<>();
		stack.push(curIndex);
		boxes.get(curIndex).visited = true;

		// Initial move to enter into the maze
		moves.add("R");

		// Loop until final is reached
		while (curIndex != endIndex) {
			// System.out.println(stack);
			// System.out.println("Currently on..." + curIndex);
			// Variable for backtracking
			boolean noWay = true;
			// Up open
			if (boxes.get(curIndex).up) {
				// System.out.println("Up open");
				int upIndex = curIndex - dimension;
				// Check if visited before, then don't go there
				if (!boxes.get(upIndex).visited) {
					noWay = false;
					stack.push(upIndex);
					curIndex = upIndex;
					boxes.get(curIndex).visited = true;
					moves.add("U");
					// System.out.println("Moving Up..." + curIndex);
					continue;
				}
			}
			// Right open
			if (boxes.get(curIndex).right) {
				// System.out.println("Right open");
				int rightIndex = curIndex + 1;
				// Check if visited before, then don't go there
				if (!boxes.get(rightIndex).visited) {
					noWay = false;
					stack.push(rightIndex);
					curIndex = rightIndex;
					boxes.get(curIndex).visited = true;
					moves.add("R");
					// System.out.println("Moving Right..." + curIndex);
					continue;
				}
			}
			// Left open
			if (boxes.get(curIndex).left) {
				// System.out.println("Left open");
				int leftIndex = curIndex - 1;
				// Check if visited before, then don't go there
				if (!boxes.get(leftIndex).visited) {
					noWay = false;
					stack.push(leftIndex);
					curIndex = leftIndex;
					boxes.get(curIndex).visited = true;
					moves.add("L");
					// System.out.println("Moving Left..." + curIndex);
					continue;
				}
			}
			// Down open
			if (boxes.get(curIndex).down) {
				// System.out.println("Down open");
				int downIndex = curIndex + dimension;
				// Check if visited before, then don't go there
				if (!boxes.get(downIndex).visited) {
					noWay = false;
					stack.push(downIndex);
					curIndex = downIndex;
					boxes.get(curIndex).visited = true;
					moves.add("D");
					// System.out.println("Moving Down..." + curIndex);
					continue;
				}
			}
			// No open, Backtrack
			if (noWay) {
				curIndex = stack.pop();
				// System.out.println("Backtracking..." + curIndex);
				// Remove the last given move
				moves.remove(moves.size() - 1);
			}
		}

		// final move to exit from the maze
		moves.add("R");

		System.out.println(moves);
	}

	public static int hexToInt(char ch) {
		switch (ch) {
		case '0':
			return 0;
		case '1':
			return 1;
		case '2':
			return 2;
		case '3':
			return 3;
		case '4':
			return 4;
		case '5':
			return 5;
		case '6':
			return 6;
		case '7':
			return 7;
		case '8':
			return 8;
		case '9':
			return 9;
		case 'A':
		case 'a':
			return 10;
		case 'B':
		case 'b':
			return 11;
		case 'C':
		case 'c':
			return 12;
		case 'D':
		case 'd':
			return 13;
		case 'E':
		case 'e':
			return 14;
		case 'F':
		case 'f':
			return 15;
		}

		return -1;
	}

}
