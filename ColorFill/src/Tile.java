
public class Tile {
	public int row, start, width, color;

	public Tile(int row, int start, int width) {
		this.row = row;
		this.start = start;
		this.width = width;
	}

	public boolean isAdjacent(Tile tile) {
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + row;
		result = prime * result + start;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tile other = (Tile) obj;
		if (row != other.row)
			return false;
		if (start != other.start)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tile [row=" + row + ", start=" + start + ", width=" + width + ", color=" + color + "]";
	}
}
