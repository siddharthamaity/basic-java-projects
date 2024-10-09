
/**
 * Represents a box.
 *
 */
public class Box {
	// index of the box in array list
	public int index;
	public boolean up, left, right, down;
	public boolean visited = false;

	public Box(int code, int index) {
		this.index = index;
		// Extract the open sides from binary representation
		up = ((code & 8) == 0) ? false : true;
		left = ((code & 4) == 0) ? false : true;
		right = ((code & 2) == 0) ? false : true;
		down = ((code & 1) == 0) ? false : true;
		visited = false;
	}

	// Just to print a box
	@Override
	public String toString() {
		return "Box [up=" + up + ", left=" + left + ", right=" + right + ", down=" + down + "]";
	}
}
